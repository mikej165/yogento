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
from decimal import Decimal
from time import mktime
from datetime import datetime


class _Protocol(object):
    def readByte(self):
        return self.readI16()

    def readDateTime(self):
        return datetime.fromtimestamp(self.readI64() / 1000.0)

    def readDecimal(self):
        return Decimal(self.readString())

    def readEmailAddress(self):
        return self.readString()

    def readI16(self):
        return self.readI32()

    def readUrl(self):
        return self.readString()

    def writeByte(self, byte):
        self.writeI16(byte)
        return self

    def writeDateTime(self, date_time):
        self.writeI64(long(mktime(date_time.timetuple())) * 1000l)
        return self

    def writeDecimal(self, decimal):
        self.writeString(str(decimal))
        return self

    def writeEmailAddress(self, email_address):
        self.writeString(email_address)
        return self

    def writeI16(self, i16):
        self.writeI32(i16)
        return self

    def writeMixed(self, object_):
        if object_ is None:
            self.writeNull()
        elif isinstance(object_, dict):
            self.writeMapBegin(len(object_))
            for key, value in object_.iteritems():
                self.writeMixed(key)
                self.writeMixed(value)
            self.writeMapEnd()
        elif isinstance(object_, float):
            self.writeDouble(object_)
        elif isinstance(object_, frozenset):
            self.writeSetBegin(len(object_))
            for item in object_:
                self.writeMixed(item)
            self.writeSetEnd()
        elif isinstance(object_, int):
            self.writeI32(object_)
        elif isinstance(object_, (list, tuple)):
            self.writeListBegin(len(object_))
            for item in object_:
                self.writeMixed(item)
            self.writeListEnd()
        elif isinstance(object_, long):
            self.writeI64(object_)
        elif isinstance(object_, basestring):
            self.writeString(object_)
        elif hasattr(object_, 'write'):
            object_.write(self)
        else:
            raise TypeError(type(object_))
        return self

    def writeUrl(self, url):
        self.writeString(url)
        return self
