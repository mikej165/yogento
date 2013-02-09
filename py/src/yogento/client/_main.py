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

from argparse import ArgumentParser
from yogento.client.utils import class_qname
import logging
import sys


class _Main(object):
    @classmethod
    def _get_commands(cls):
        raise NotImplementedError(class_qname(cls))

    @classmethod
    def main(cls):
        commands = cls._get_commands()
        if len(commands) == 0:
            raise RuntimeError('no commands available')

        # Create the argument parser and subparsers for each command
        argument_parser = ArgumentParser()
        argument_subparsers = argument_parser.add_subparsers(dest='command')
        for command_str in sorted(commands.iterkeys()):
            command = commands[command_str]
            command_argument_subparser = \
                argument_subparsers.add_parser(command_str)
            command_argument_subparser.add_argument(
                '--debug',
                action='store_true',
                help='turn on debugging'
            )
            command_argument_subparser.add_argument(
                '--logging',
                help='set logging level (see Python logging module)'
            )
            command.add_arguments(command_argument_subparser)

        # Parse arguments
        argv = list(sys.argv)
        argv.pop(0)  # parse_args want the argv to exclude sys.argv[0]
        if len(argv) == 0:
            argv.append(commands.keys()[0])
        elif argv[0] not in commands:
            argv.insert(0, commands.keys()[0])
        args = argument_parser.parse_args(argv)
        if args.debug:
            logging_level = logging.DEBUG
        elif args.logging is not None:
            logging_level = getattr(logging, args.logging.upper())
        else:
            logging_level = logging.WARNING
        logging.basicConfig(
            format='%(asctime)s:%(module)s:%(lineno)s:%(name)s:%(levelname)s: %(message)s',  # @IgnorePep8
            level=logging_level
        )
        # delattr(args, 'debug') # Pass debug= through to the command
        delattr(args, 'logging')

        command = commands[args.command]
        delattr(args, 'command')

        # Execute the specified command
        command_ret = command(**args.__dict__)
        if command_ret is not None:
            print command_ret
