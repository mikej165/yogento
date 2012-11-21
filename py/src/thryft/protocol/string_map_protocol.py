from thryft.protocol.builtins_protocol import BuiltinsProtocol
from urllib import urlencode


class StringMapProtocol(BuiltinsProtocol):
    def to_string_map(self):
        if len(self._scope_stack) > 0:
            return self.__to_string_map(self._scope_stack[0].builtin_object)
        else:
            return {}

    def __to_string_map(self, in_value, in_key=None, out_string_map=None):
        if in_key is not None:
            child_key_prefix = in_key + '.'
        else:
            child_key_prefix = ''
        if out_string_map is None:
            out_string_map = {}
        if isinstance(in_value, dict):
            for child_key, child_value in in_value.iteritems():
                self.__to_string_map(child_value, child_key_prefix + child_key, out_string_map)
        elif isinstance(in_value, (list, tuple)):
            for child_key, child_value in enumerate(in_value):
                self.__to_string_map(child_value, child_key_prefix + str(child_key), out_string_map)
        else:
            out_string_map[in_key] = str(in_value)
        return out_string_map

    def __str__(self):
        return urlencode(self.to_string_map(), True)
