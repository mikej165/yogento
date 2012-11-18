from inspect import isclass
import logging
import re


__all__ = [
    'camelize',
    'decamelize',
    'get_logger',
    'indent',
    'numeric',
    'timestamp_str',
    'which'
]


def camelize(name):
    return ''.join([name_part.capitalize() for name_part in name.split('_')])


def class_qname(class_):
    if not isclass(class_):
        class_ = class_.__class__
    return class_.__module__ + '.' + class_.__name__


def decamelize(name):
    return re.sub('(((?<=[a-z])[A-Z])|([A-Z](?![A-Z]|$)))', '_\\1', name)\
               .lower()\
               .strip('_')


def get_logger(cls_or_self):
    return logging.getLogger(class_qname(cls_or_self))


def numeric(value):
    if isinstance(value, (int, long, float)):
        return value
    elif isinstance(value, basestring):
        for numeric_type in (int, float):
            try:
                return numeric_type(value)
            except (TypeError, ValueError):
                pass
        raise ValueError(value)
    else:
        raise TypeError(type(value))
