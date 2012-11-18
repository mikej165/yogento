try:
    from collections import OrderedDict  # @UnusedImport
except ImportError:
    from _ordereddict import OrderedDict  # @UnusedImport @Reimport @IgnorePep8
