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

from collections import OrderedDict
from yogento.client._command import _Command


class _Commands(OrderedDict):
    def create(self, name=None, **kwds):  # @ReservedAssignment
        if name is None:
            commands = OrderedDict()
            for key, command_subclass in self.iteritems():
                commands[key] = command_subclass(**kwds)
            return commands
        else:
            command_subclass = self[name]
            return command_subclass(**kwds)

    def register(self, command_subclass, default=False):
        if not issubclass(command_subclass, _Command):
            raise TypeError(command_subclass)

        key = command_subclass.__module__.rsplit('.', 1)[-1]

        if default:
            command_subclasses = OrderedDict()
            command_subclasses[key] = command_subclass
            for key, command_subclass in self.iteritems():
                command_subclasses[key] = command_subclass
            self.clear()
            self.update(command_subclasses)
        else:
            self[key] = command_subclass
