from datetime import datetime
from time import mktime
import __builtin__
import yogento.api.models.sales.order.magento.magento_order_status


class MagentoOrderStatusHistory(object):
    class Builder:
        def __init__(
            self,
            created_at,
            status,
            comment=None,
            entity_name=None,
            is_customer_notified=None,
            is_visible_on_front=None,
            parent_id=None,
            store_id=None
        ):
            self.__comment = comment
            self.__created_at = created_at
            self.__entity_name = entity_name
            self.__is_customer_notified = is_customer_notified
            self.__is_visible_on_front = is_visible_on_front
            self.__parent_id = parent_id
            self.__status = status
            self.__store_id = store_id

        def build(self):
            return MagentoOrderStatusHistory(comment=self.__comment, created_at=self.__created_at, entity_name=self.__entity_name, is_customer_notified=self.__is_customer_notified, is_visible_on_front=self.__is_visible_on_front, parent_id=self.__parent_id, status=self.__status, store_id=self.__store_id)

        def set_comment(self, comment):
            self.__comment = comment
            return self

        def set_created_at(self, created_at):
            self.__created_at = created_at
            return self

        def set_entity_name(self, entity_name):
            self.__entity_name = entity_name
            return self

        def set_is_customer_notified(self, is_customer_notified):
            self.__is_customer_notified = is_customer_notified
            return self

        def set_is_visible_on_front(self, is_visible_on_front):
            self.__is_visible_on_front = is_visible_on_front
            return self

        def set_parent_id(self, parent_id):
            self.__parent_id = parent_id
            return self

        def set_status(self, status):
            self.__status = status
            return self

        def set_store_id(self, store_id):
            self.__store_id = store_id
            return self

        def update(self, magento_order_status_history):
            if isinstance(magento_order_status_history, MagentoOrderStatusHistory):
                self.set_comment(magento_order_status_history.comment)
                self.set_created_at(magento_order_status_history.created_at)
                self.set_entity_name(magento_order_status_history.entity_name)
                self.set_is_customer_notified(magento_order_status_history.is_customer_notified)
                self.set_is_visible_on_front(magento_order_status_history.is_visible_on_front)
                self.set_parent_id(magento_order_status_history.parent_id)
                self.set_status(magento_order_status_history.status)
                self.set_store_id(magento_order_status_history.store_id)
            elif isinstance(magento_order_status_history, dict):
                for key, value in magento_order_status_history.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(magento_order_status_history)
            return self

    def __init__(
        self,
        created_at,
        status,
        comment=None,
        entity_name=None,
        is_customer_notified=None,
        is_visible_on_front=None,
        parent_id=None,
        store_id=None
    ):
        if comment is not None:
            if not isinstance(comment, basestring):
                raise TypeError(getattr(__builtin__, 'type')(comment))
        self.__comment = comment

        if created_at is None:
            raise ValueError('created_at is required')
        if not isinstance(created_at, datetime):
            raise TypeError(getattr(__builtin__, 'type')(created_at))
        self.__created_at = created_at

        if entity_name is not None:
            if not isinstance(entity_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(entity_name))
        self.__entity_name = entity_name

        if is_customer_notified is not None:
            if not isinstance(is_customer_notified, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_customer_notified))
        self.__is_customer_notified = is_customer_notified

        if is_visible_on_front is not None:
            if not isinstance(is_visible_on_front, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_visible_on_front))
        self.__is_visible_on_front = is_visible_on_front

        if parent_id is not None:
            if not isinstance(parent_id, int):
                raise TypeError(getattr(__builtin__, 'type')(parent_id))
        self.__parent_id = parent_id

        if status is None:
            raise ValueError('status is required')
        if not isinstance(status, yogento.api.models.sales.order.magento.magento_order_status.MagentoOrderStatus):
            raise TypeError(getattr(__builtin__, 'type')(status))
        self.__status = status

        if store_id is not None:
            if not isinstance(store_id, int):
                raise TypeError(getattr(__builtin__, 'type')(store_id))
        self.__store_id = store_id

    def __eq__(self, other):
        if self.comment != other.comment:
            return False
        if self.created_at != other.created_at:
            return False
        if self.entity_name != other.entity_name:
            return False
        if self.is_customer_notified != other.is_customer_notified:
            return False
        if self.is_visible_on_front != other.is_visible_on_front:
            return False
        if self.parent_id != other.parent_id:
            return False
        if self.status != other.status:
            return False
        if self.store_id != other.store_id:
            return False
        return True

    def __hash__(self):
        return hash((self.comment,self.created_at,self.entity_name,self.is_customer_notified,self.is_visible_on_front,self.parent_id,self.status,self.store_id,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.comment is not None:
            field_reprs.append('comment=' + "'" + self.comment.encode('ascii', 'replace') + "'")
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.entity_name is not None:
            field_reprs.append('entity_name=' + "'" + self.entity_name.encode('ascii', 'replace') + "'")
        if self.is_customer_notified is not None:
            field_reprs.append('is_customer_notified=' + repr(self.is_customer_notified))
        if self.is_visible_on_front is not None:
            field_reprs.append('is_visible_on_front=' + repr(self.is_visible_on_front))
        if self.parent_id is not None:
            field_reprs.append('parent_id=' + repr(self.parent_id))
        field_reprs.append('status=' + repr(self.status))
        if self.store_id is not None:
            field_reprs.append('store_id=' + repr(self.store_id))
        return 'MagentoOrderStatusHistory(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.comment is not None:
            field_reprs.append('comment=' + "'" + self.comment.encode('ascii', 'replace') + "'")
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.entity_name is not None:
            field_reprs.append('entity_name=' + "'" + self.entity_name.encode('ascii', 'replace') + "'")
        if self.is_customer_notified is not None:
            field_reprs.append('is_customer_notified=' + repr(self.is_customer_notified))
        if self.is_visible_on_front is not None:
            field_reprs.append('is_visible_on_front=' + repr(self.is_visible_on_front))
        if self.parent_id is not None:
            field_reprs.append('parent_id=' + repr(self.parent_id))
        field_reprs.append('status=' + repr(self.status))
        if self.store_id is not None:
            field_reprs.append('store_id=' + repr(self.store_id))
        return 'MagentoOrderStatusHistory(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'comment': self.comment, 'created_at': self.created_at, 'entity_name': self.entity_name, 'is_customer_notified': self.is_customer_notified, 'is_visible_on_front': self.is_visible_on_front, 'parent_id': self.parent_id, 'status': self.status, 'store_id': self.store_id}

    @property
    def comment(self):
        return self.__comment

    @property
    def created_at(self):
        return self.__created_at

    @property
    def entity_name(self):
        return self.__entity_name

    @property
    def is_customer_notified(self):
        return self.__is_customer_notified

    @property
    def is_visible_on_front(self):
        return self.__is_visible_on_front

    @property
    def parent_id(self):
        return self.__parent_id

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'comment':
                try:
                    init_kwds['comment'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'created_at':
                init_kwds['created_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'entity_name':
                try:
                    init_kwds['entity_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'is_customer_notified':
                try:
                    init_kwds['is_customer_notified'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'is_visible_on_front':
                try:
                    init_kwds['is_visible_on_front'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'parent_id':
                try:
                    init_kwds['parent_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'status':
                init_kwds['status'] = yogento.api.models.sales.order.magento.magento_order_status.MagentoOrderStatus.value_of(iprot.readString().strip().upper())
            elif ifield_name == 'store_id':
                try:
                    init_kwds['store_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, comment=None, created_at=None, entity_name=None, is_customer_notified=None, is_visible_on_front=None, parent_id=None, status=None, store_id=None):
        if comment is None:
            comment = self.comment
        if created_at is None:
            created_at = self.created_at
        if entity_name is None:
            entity_name = self.entity_name
        if is_customer_notified is None:
            is_customer_notified = self.is_customer_notified
        if is_visible_on_front is None:
            is_visible_on_front = self.is_visible_on_front
        if parent_id is None:
            parent_id = self.parent_id
        if status is None:
            status = self.status
        if store_id is None:
            store_id = self.store_id
        return self.__class__(comment=comment, created_at=created_at, entity_name=entity_name, is_customer_notified=is_customer_notified, is_visible_on_front=is_visible_on_front, parent_id=parent_id, status=status, store_id=store_id)

    @property
    def status(self):
        return self.__status

    @property
    def store_id(self):
        return self.__store_id

    def write(self, oprot):
        oprot.writeStructBegin('MagentoOrderStatusHistory')

        if self.comment is not None:
            oprot.writeFieldBegin('comment', 11, -1)
            oprot.writeString(self.comment)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('created_at', 12, -1)
        oprot.writeDateTime(self.created_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.created_at.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.entity_name is not None:
            oprot.writeFieldBegin('entity_name', 11, -1)
            oprot.writeString(self.entity_name)
            oprot.writeFieldEnd()

        if self.is_customer_notified is not None:
            oprot.writeFieldBegin('is_customer_notified', 2, -1)
            oprot.writeBool(self.is_customer_notified)
            oprot.writeFieldEnd()

        if self.is_visible_on_front is not None:
            oprot.writeFieldBegin('is_visible_on_front', 2, -1)
            oprot.writeBool(self.is_visible_on_front)
            oprot.writeFieldEnd()

        if self.parent_id is not None:
            oprot.writeFieldBegin('parent_id', 8, -1)
            oprot.writeI32(self.parent_id)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('status', 11, -1)
        oprot.writeString([attr for attr in dir(yogento.api.models.sales.order.magento.magento_order_status.MagentoOrderStatus) if getattr(yogento.api.models.sales.order.magento.magento_order_status.MagentoOrderStatus, attr) == self.status][0])
        oprot.writeFieldEnd()

        if self.store_id is not None:
            oprot.writeFieldBegin('store_id', 8, -1)
            oprot.writeI32(self.store_id)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
