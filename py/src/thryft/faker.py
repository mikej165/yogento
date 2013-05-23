import random


class Faker(object):
    class Address(object):
        @classmethod
        def secondaryAddress(cls):
            pass

        @classmethod
        def streetAddress(cls):
            pass

        @classmethod
        def ukCountry(cls):
            pass

        @classmethod
        def usState(cls):
            pass

        @classmethod
        def zipCode(cls):
            pass

    class DateTime(object):
        pass

    class Internet(object):
        pass

    class Lorem(object):
        @classmethod
        def paragraph(cls):
            pass

        @classmethod
        def sentence(cls):
            pass

    class Name(object):
        __FIRST_NAMES = ('John', 'Jane')
        __LAST_NAMES = ('Doe',)

        @classmethod
        def findName(cls):
            return cls.firstName() + ' ' + cls.lastName()

        @classmethod
        def firstName(cls):
            return random.choice(cls.__FIRST_NAMES)

        @classmethod
        def lastName(cls):
            return random.choice(cls.__LAST_NAMES)

    class PhoneNumber(object):
        @classmethod
        def phoneNumber(cls):
            pass

    @classmethod
    def randomBinary(cls):
        pass

    @classmethod
    def randomBool(cls):
        pass

    @classmethod
    def randomByte(cls):
        pass

    @classmethod
    def randomBytes(cls):
        pass

    @classmethod
    def randomDecimal(cls):
        pass

    @classmethod
    def randomFloat(cls):
        pass

    @classmethod
    def randomI16(cls):
        pass

    @classmethod
    def randomI32(cls):
        pass

    @classmethod
    def randomI64(cls):
        pass
