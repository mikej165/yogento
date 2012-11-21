from decimal import Decimal
from thryft.protocol._protocol import _Protocol


class BuiltinsProtocol(_Protocol):
    class _Scope(object):
        def __init__(self, builtin_object, name_stack):
            self._builtin_object = builtin_object
            self._name_stack = name_stack

        @property
        def builtin_object(self):
            return self._builtin_object

        def readFieldBegin(self):
            if len(self._name_stack) == 0:
                return None, 0, None  # STOP
            assert isinstance(self._name_stack[-1], basestring), self._name_stack
            return self._name_stack[-1], None, None

        def readFieldEnd(self):
            self._name_stack.pop(-1)

        def readValue(self, expected_type=None):
            value = self._readValue()
            if expected_type is not None and not isinstance(value, expected_type):
                raise TypeError("expected %s, got %s" % (expected_type, type(value)))
            return value

        def _readValue(self):
            raise NotImplementedError

        def writeFieldBegin(self, name, *args, **kwds):
            self._name_stack.append(name)
            return self

        def writeFieldEnd(self):
            self._name_stack.pop(-1)
            return self

        def writeValue(self, value):
            self._writeValue(value)

        def _writeValue(self, value):
            raise NotImplementedError

    class _ListScope(_Scope):
        def __init__(self, list_):
            if not isinstance(list_, (list, tuple)):
                raise TypeError(type(list_))
            BuiltinsProtocol._Scope.__init__(self, list_, list(reversed(xrange(len(list_)))))

        def _readValue(self):
            return self.builtin_object[self._name_stack.pop(-1)]

        def _writeValue(self, value):
            self.builtin_object.append(value)

    class _MapScope(_Scope):
        def __init__(self, dict_):
            if not isinstance(dict_, dict):
                raise TypeError(type(dict_))
            BuiltinsProtocol._Scope.__init__(self, dict_, list(reversed(sorted(dict_.keys()))))
            self.__next_value_is_key = True

        def _readValue(self):
            if self.__next_value_is_key:
                self.__next_value_is_key = False
                return self._name_stack[-1]
            else:
                self.__next_value_is_key = True
                return self.builtin_object[self._name_stack.pop(-1)]

        def _writeValue(self, value):
            if self.__next_value_is_key:
                self.__next_value_is_key = False
                self._name_stack.append(value)
            else:
                self.__next_value_is_key = True
                self.builtin_object[self._name_stack.pop(-1)] = value

    class _StructScope(_MapScope):
        def _readValue(self):
            return self.builtin_object[self._name_stack[-1]]

        def _writeValue(self, value):
            field_name = self._name_stack[-1]
            self.builtin_object[field_name] = value

    def __init__(self, root_builtin_object=None):
        _Protocol.__init__(self)
        self._scope_stack = []
        if root_builtin_object is not None:
            if isinstance(root_builtin_object, dict):
                self._scope_stack.append(self._StructScope(root_builtin_object))
            elif isinstance(root_builtin_object, (list, tuple)):
                self._scope_stack.append(self._ListScope(root_builtin_object))
            else:
                raise TypeError(type(root_builtin_object))

    def readFieldBegin(self):
        return self._scope_stack[-1].readFieldBegin()

    def readBool(self):
        return self._scope_stack[-1].readValue(bool)

    def readI32(self):
        return int(self._scope_stack[-1].readValue((Decimal, int)))

    def readI64(self):
        return long(self._scope_stack[-1].readValue((Decimal, int, long)))

    def readFieldEnd(self):
        self._scope_stack[-1].readFieldEnd()

    def readListBegin(self):
        list_ = self._scope_stack[-1].readValue(list)
        self._scope_stack.append(self._ListScope(list_))
        return None, len(list_)

    def readListEnd(self):
        self._scope_stack.pop(-1)

    def readMapBegin(self):
        map_ = self._scope_stack[-1].readValue(dict)
        self._scope_stack.append(self._MapScope(map_))
        return None, None, len(map_)

    def readMapEnd(self):
        self._scope_stack.pop(-1)

    def readSetBegin(self):
        return self.readListBegin()

    def readSetEnd(self):
        return self.readListEnd()

    def readString(self):
        return self._scope_stack[-1].readValue((Decimal, float, str, unicode))

    def readStructBegin(self):
        struct = self._scope_stack[-1].readValue(dict)
        self._scope_stack.append(self._StructScope(struct))

    def readStructEnd(self):
        self._scope_stack.pop(-1)

    def writeBool(self, value):
        self._scope_stack[-1].writeValue(value)
        return self

    def writeFieldBegin(self, name, *args, **kwds):
        self._scope_stack[-1].writeFieldBegin(name, *args, **kwds)
        return self

    def writeFieldEnd(self):
        self._scope_stack[-1].writeFieldEnd()
        return self

    def writeFieldStop(self):
        return self

    def writeI32(self, value):
        self._scope_stack[-1].writeValue(value)
        return self

    def writeI64(self, value):
        self._scope_stack[-1].writeValue(value)
        return self

    def writeListBegin(self, *args, **kwds):
        list_ = []
        if len(self._scope_stack) > 0:
            self._scope_stack[-1].writeValue(list_)
        self._scope_stack.append(self._ListScope(list_))
        return self

    def writeListEnd(self):
        if len(self._scope_stack) > 1:
            self._scope_stack.pop(-1)
        return self

    def writeMapBegin(self, *args, **kwds):
        struct = {}
        if len(self._scope_stack) > 0:
            self._scope_stack[-1].writeValue(struct)
        self._scope_stack.append(self._MapScope(struct))
        return self

    def writeMapEnd(self):
        if len(self._scope_stack) > 1:
            self._scope_stack.pop(-1)
        return self

    def writeSetBegin(self, *args, **kwds):
        self.writeListBegin()
        return self

    def writeSetEnd(self):
        self.writeListEnd()
        return self

    def writeString(self, value):
        self._scope_stack[-1].writeValue(value)
        return self

    def writeStructBegin(self, *args, **kwds):
        struct = {}
        if len(self._scope_stack) > 0:
            self._scope_stack[-1].writeValue(struct)
        self._scope_stack.append(self._StructScope(struct))
        return self

    def writeStructEnd(self):
        if len(self._scope_stack) > 1:
            self._scope_stack.pop(-1)
        return self
