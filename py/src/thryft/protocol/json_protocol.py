from decimal import Decimal
try:
    import json
except ImportError:
    import simplejson as json #@UnusedImport
from thryft.protocol.builtins_protocol import BuiltinsProtocol


class JsonProtocol(BuiltinsProtocol):
    def __init__(self, json=None):
        if json is not None:
            if isinstance(json, str):
                builtin_object = globals()['json'].loads(json, parse_float=Decimal, strict=False) #@UndefinedVariable
            else:
                builtin_object = json
            builtin_object = [builtin_object]
        else:
            builtin_object = None
        BuiltinsProtocol.__init__(self, builtin_object)

    def __str__(self):
        if len(self._scope_stack) > 0:
            return json.dumps(self._scope_stack[0].builtin_object) #@UndefinedVariable
        else:
            return ''
