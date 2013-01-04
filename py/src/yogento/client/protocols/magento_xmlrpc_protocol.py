#-------------------------------------------------------------------------------
# Copyright (c) 2013, Minor Gordon
# All rights reserved.
# 
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions
# are met:
# 
#     * Redistributions of source code must retain the above copyright
#       notice, this list of conditions and the following disclaimer.
# 
#     * Redistributions in binary form must reproduce the above copyright
#       notice, this list of conditions and the following disclaimer in
#       the documentation and/or other materials provided with the
#       distribution.
# 
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
# CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
# INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
# MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
# CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
# SPECIAL, EXEMPLARY, OR CONSEQUENTIAL  DAMAGES (INCLUDING,
# BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
# INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
# LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
# (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
# OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
# OF SUCH DAMAGE.
#-------------------------------------------------------------------------------

from datetime import datetime
from time import mktime


class MagentoXmlrpcProtocol(object):
    def __init__(self, xmlrpc):
        object.__init__(self)

        if isinstance(xmlrpc, dict):
            xmlrpc = xmlrpc.copy()
        elif isinstance(xmlrpc, list):
            xmlrpc = list(xmlrpc)
            xmlrpc.reverse()
        else:
            raise TypeError(type(xmlrpc))
        self.__scope_stack = [[xmlrpc]]

    def readFieldBegin(self):
        if len(self.__scope_stack[-1]) == 0:
            return None, 0, None # STOP

        return self.__scope_stack[-1].keys()[0], None, None

    def readBool(self):
        value = self.__readValue()
        if value is None:
            raise TypeError
        elif isinstance(value, bool):
            return value
        elif isinstance(value, str):
            return value == '1'
        else:
            return bool(value)

    def readI16(self):
        return int(self.__readValue())

    def readI32(self):
        return int(self.__readValue())

    def readI64(self):
        value = self.__readValue()
        if isinstance(value, str):
            try:
                return mktime(datetime.strptime(value, "%Y-%m-%d %H:%M:%S").timetuple()) * 1000l
            except ValueError:
                pass
        return long(value)

    def readFieldEnd(self):
        self.__scope_stack[-1].pop(self.__scope_stack[-1].keys()[0])

    def readListBegin(self):
        list_ = self.__readValue()
        if isinstance(list_, str):
            list_ = [element.strip() for element in list_.split(',')]
        elif not isinstance(list_, list):
            raise TypeError(type(list_))
        if len(list_) > 1:
            list_ = list(reversed(list_))
        self.__scope_stack.append(list_)
        return None, len(list_)

    def readListEnd(self):
        list_ = self.__scope_stack.pop(-1)
        assert isinstance(list_, list)

    def readSetBegin(self):
        return self.readListBegin()

    def readSetEnd(self):
        return self.readListEnd()

    def readString(self):
        value = self.__readValue()
        if not isinstance(value, basestring):
            raise TypeError(type(value))
        return value

    def readStructBegin(self):
        struct = self.__readValue()
        if not isinstance(struct, dict):
            raise TypeError(type(struct))
        self.__scope_stack.append(struct)

    def readStructEnd(self):
        struct = self.__scope_stack.pop(-1)
        assert isinstance(struct, dict)

    def __readValue(self):
        scope = self.__scope_stack[-1]
        if isinstance(scope, list):
            return scope.pop(-1)
        else:
            return scope.values()[0]
