from yogento.cli.commands.commands import Commands
from yogento.client._main import _Main


__all__ = ['Main']


class Main(_Main):
    @classmethod
    def _get_commands(cls):
        return Commands.create()


if __name__ == '__main__':
    Main().main()
