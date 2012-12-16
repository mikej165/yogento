class NoSuchUserSettingsException(Exception):
    class Builder:
        def build(self):
            return NoSuchUserSettingsException()

    def __eq__(self, other):
        return True

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        return 'NoSuchUserSettingsException()'

    def __str__(self):
        return 'NoSuchUserSettingsException()'

    def as_dict(self):
        return {}

    @classmethod
    def read(cls, iprot):
        iprot.readStructBegin()
        iprot.readStructEnd()
        return cls()

    def write(self, oprot):
        oprot.writeStructBegin('NoSuchUserSettingsException')

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
