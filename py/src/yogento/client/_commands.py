from yogento.client._command import _Command
from yogento.client.dependencies.ordereddict import OrderedDict


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
