class NoSuchCategoryException(Exception):
    class Builder:
        def build(self):
            return NoSuchCategoryException()

    def __eq__(self, other):
        return True

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        return 'NoSuchCategoryException()'

    def __str__(self):
        return 'NoSuchCategoryException()'

    def as_dict(self):
        return {}

    @classmethod
    def read(cls, iprot):
        iprot.readStructBegin()
        iprot.readStructEnd()
        return cls()

    def write(self, oprot):
        oprot.writeStructBegin('NoSuchCategoryException')

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
