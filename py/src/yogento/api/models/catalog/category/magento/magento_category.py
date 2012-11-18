from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__
import yogento.api.models.catalog.category.magento.magento_category_display_mode


class MagentoCategory(object):
    class Builder:
        def __init__(
            self,
            category_id,
            created_at,
            is_active,
            level,
            parent_id,
            path,
            position,
            updated_at,
            children=None,
            description=None,
            display_mode=None,
            filter_price_range=None,
            image=None,
            include_in_menu=None,
            increment_id=None,
            is_anchor=None,
            landing_page=None,
            meta_description=None,
            meta_keywords=None,
            meta_title=None,
            name=None,
            page_layout=None,
            path_in_store=None,
            thumbnail=None,
            url_key=None,
            url_path=None
        ):
            self.__category_id = category_id
            self.__children = children
            self.__created_at = created_at
            self.__description = description
            self.__display_mode = display_mode
            self.__filter_price_range = filter_price_range
            self.__image = image
            self.__include_in_menu = include_in_menu
            self.__increment_id = increment_id
            self.__is_active = is_active
            self.__is_anchor = is_anchor
            self.__landing_page = landing_page
            self.__level = level
            self.__meta_description = meta_description
            self.__meta_keywords = meta_keywords
            self.__meta_title = meta_title
            self.__name = name
            self.__page_layout = page_layout
            self.__parent_id = parent_id
            self.__path = path
            self.__path_in_store = path_in_store
            self.__position = position
            self.__thumbnail = thumbnail
            self.__updated_at = updated_at
            self.__url_key = url_key
            self.__url_path = url_path

        def build(self):
            return MagentoCategory(category_id=self.__category_id, children=self.__children, created_at=self.__created_at, description=self.__description, display_mode=self.__display_mode, filter_price_range=self.__filter_price_range, image=self.__image, include_in_menu=self.__include_in_menu, increment_id=self.__increment_id, is_active=self.__is_active, is_anchor=self.__is_anchor, landing_page=self.__landing_page, level=self.__level, meta_description=self.__meta_description, meta_keywords=self.__meta_keywords, meta_title=self.__meta_title, name=self.__name, page_layout=self.__page_layout, parent_id=self.__parent_id, path=self.__path, path_in_store=self.__path_in_store, position=self.__position, thumbnail=self.__thumbnail, updated_at=self.__updated_at, url_key=self.__url_key, url_path=self.__url_path)

        def set_category_id(self, category_id):
            self.__category_id = category_id
            return self

        def set_children(self, children):
            self.__children = children
            return self

        def set_created_at(self, created_at):
            self.__created_at = created_at
            return self

        def set_description(self, description):
            self.__description = description
            return self

        def set_display_mode(self, display_mode):
            self.__display_mode = display_mode
            return self

        def set_filter_price_range(self, filter_price_range):
            self.__filter_price_range = filter_price_range
            return self

        def set_image(self, image):
            self.__image = image
            return self

        def set_include_in_menu(self, include_in_menu):
            self.__include_in_menu = include_in_menu
            return self

        def set_increment_id(self, increment_id):
            self.__increment_id = increment_id
            return self

        def set_is_active(self, is_active):
            self.__is_active = is_active
            return self

        def set_is_anchor(self, is_anchor):
            self.__is_anchor = is_anchor
            return self

        def set_landing_page(self, landing_page):
            self.__landing_page = landing_page
            return self

        def set_level(self, level):
            self.__level = level
            return self

        def set_meta_description(self, meta_description):
            self.__meta_description = meta_description
            return self

        def set_meta_keywords(self, meta_keywords):
            self.__meta_keywords = meta_keywords
            return self

        def set_meta_title(self, meta_title):
            self.__meta_title = meta_title
            return self

        def set_name(self, name):
            self.__name = name
            return self

        def set_page_layout(self, page_layout):
            self.__page_layout = page_layout
            return self

        def set_parent_id(self, parent_id):
            self.__parent_id = parent_id
            return self

        def set_path(self, path):
            self.__path = path
            return self

        def set_path_in_store(self, path_in_store):
            self.__path_in_store = path_in_store
            return self

        def set_position(self, position):
            self.__position = position
            return self

        def set_thumbnail(self, thumbnail):
            self.__thumbnail = thumbnail
            return self

        def set_updated_at(self, updated_at):
            self.__updated_at = updated_at
            return self

        def set_url_key(self, url_key):
            self.__url_key = url_key
            return self

        def set_url_path(self, url_path):
            self.__url_path = url_path
            return self

        def update(self, magento_category):
            if isinstance(magento_category, MagentoCategory):
                self.set_category_id(magento_category.category_id)
                self.set_children(magento_category.children)
                self.set_created_at(magento_category.created_at)
                self.set_description(magento_category.description)
                self.set_display_mode(magento_category.display_mode)
                self.set_filter_price_range(magento_category.filter_price_range)
                self.set_image(magento_category.image)
                self.set_include_in_menu(magento_category.include_in_menu)
                self.set_increment_id(magento_category.increment_id)
                self.set_is_active(magento_category.is_active)
                self.set_is_anchor(magento_category.is_anchor)
                self.set_landing_page(magento_category.landing_page)
                self.set_level(magento_category.level)
                self.set_meta_description(magento_category.meta_description)
                self.set_meta_keywords(magento_category.meta_keywords)
                self.set_meta_title(magento_category.meta_title)
                self.set_name(magento_category.name)
                self.set_page_layout(magento_category.page_layout)
                self.set_parent_id(magento_category.parent_id)
                self.set_path(magento_category.path)
                self.set_path_in_store(magento_category.path_in_store)
                self.set_position(magento_category.position)
                self.set_thumbnail(magento_category.thumbnail)
                self.set_updated_at(magento_category.updated_at)
                self.set_url_key(magento_category.url_key)
                self.set_url_path(magento_category.url_path)
            elif isinstance(magento_category, dict):
                for key, value in magento_category.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(magento_category)
            return self

    def __init__(
        self,
        category_id,
        created_at,
        is_active,
        level,
        parent_id,
        path,
        position,
        updated_at,
        children=None,
        description=None,
        display_mode=None,
        filter_price_range=None,
        image=None,
        include_in_menu=None,
        increment_id=None,
        is_anchor=None,
        landing_page=None,
        meta_description=None,
        meta_keywords=None,
        meta_title=None,
        name=None,
        page_layout=None,
        path_in_store=None,
        thumbnail=None,
        url_key=None,
        url_path=None
    ):
        if category_id is None:
            raise ValueError('category_id is required')
        if not isinstance(category_id, int):
            raise TypeError(getattr(__builtin__, 'type')(category_id))
        self.__category_id = category_id

        if children is not None:
            if not (isinstance(children, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.catalog.category.magento.magento_category.MagentoCategory), children))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(children))
        self.__children = children

        if created_at is None:
            raise ValueError('created_at is required')
        if not isinstance(created_at, datetime):
            raise TypeError(getattr(__builtin__, 'type')(created_at))
        self.__created_at = created_at

        if description is not None:
            if not isinstance(description, basestring):
                raise TypeError(getattr(__builtin__, 'type')(description))
        self.__description = description

        if display_mode is not None:
            if not isinstance(display_mode, yogento.api.models.catalog.category.magento.magento_category_display_mode.MagentoCategoryDisplayMode):
                raise TypeError(getattr(__builtin__, 'type')(display_mode))
        self.__display_mode = display_mode

        if filter_price_range is not None:
            if not isinstance(filter_price_range, basestring):
                raise TypeError(getattr(__builtin__, 'type')(filter_price_range))
        self.__filter_price_range = filter_price_range

        if image is not None:
            if not isinstance(image, basestring):
                raise TypeError(getattr(__builtin__, 'type')(image))
        self.__image = image

        if include_in_menu is not None:
            if not isinstance(include_in_menu, bool):
                raise TypeError(getattr(__builtin__, 'type')(include_in_menu))
        self.__include_in_menu = include_in_menu

        if increment_id is not None:
            if not isinstance(increment_id, basestring):
                raise TypeError(getattr(__builtin__, 'type')(increment_id))
        self.__increment_id = increment_id

        if is_active is None:
            raise ValueError('is_active is required')
        if not isinstance(is_active, bool):
            raise TypeError(getattr(__builtin__, 'type')(is_active))
        self.__is_active = is_active

        if is_anchor is not None:
            if not isinstance(is_anchor, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_anchor))
        self.__is_anchor = is_anchor

        if landing_page is not None:
            if not isinstance(landing_page, basestring):
                raise TypeError(getattr(__builtin__, 'type')(landing_page))
        self.__landing_page = landing_page

        if level is None:
            raise ValueError('level is required')
        if not isinstance(level, int):
            raise TypeError(getattr(__builtin__, 'type')(level))
        self.__level = level

        if meta_description is not None:
            if not isinstance(meta_description, basestring):
                raise TypeError(getattr(__builtin__, 'type')(meta_description))
        self.__meta_description = meta_description

        if meta_keywords is not None:
            if not isinstance(meta_keywords, basestring):
                raise TypeError(getattr(__builtin__, 'type')(meta_keywords))
        self.__meta_keywords = meta_keywords

        if meta_title is not None:
            if not isinstance(meta_title, basestring):
                raise TypeError(getattr(__builtin__, 'type')(meta_title))
        self.__meta_title = meta_title

        if name is not None:
            if not isinstance(name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(name))
        self.__name = name

        if page_layout is not None:
            if not isinstance(page_layout, basestring):
                raise TypeError(getattr(__builtin__, 'type')(page_layout))
        self.__page_layout = page_layout

        if parent_id is None:
            raise ValueError('parent_id is required')
        if not isinstance(parent_id, int):
            raise TypeError(getattr(__builtin__, 'type')(parent_id))
        self.__parent_id = parent_id

        if path is None:
            raise ValueError('path is required')
        if not isinstance(path, basestring):
            raise TypeError(getattr(__builtin__, 'type')(path))
        self.__path = path

        if path_in_store is not None:
            if not isinstance(path_in_store, basestring):
                raise TypeError(getattr(__builtin__, 'type')(path_in_store))
        self.__path_in_store = path_in_store

        if position is None:
            raise ValueError('position is required')
        if not isinstance(position, int):
            raise TypeError(getattr(__builtin__, 'type')(position))
        self.__position = position

        if thumbnail is not None:
            if not isinstance(thumbnail, basestring):
                raise TypeError(getattr(__builtin__, 'type')(thumbnail))
        self.__thumbnail = thumbnail

        if updated_at is None:
            raise ValueError('updated_at is required')
        if not isinstance(updated_at, datetime):
            raise TypeError(getattr(__builtin__, 'type')(updated_at))
        self.__updated_at = updated_at

        if url_key is not None:
            if not isinstance(url_key, basestring):
                raise TypeError(getattr(__builtin__, 'type')(url_key))
        self.__url_key = url_key

        if url_path is not None:
            if not isinstance(url_path, basestring):
                raise TypeError(getattr(__builtin__, 'type')(url_path))
        self.__url_path = url_path

    def __eq__(self, other):
        if self.category_id != other.category_id:
            return False
        if self.children != other.children:
            return False
        if self.created_at != other.created_at:
            return False
        if self.description != other.description:
            return False
        if self.display_mode != other.display_mode:
            return False
        if self.filter_price_range != other.filter_price_range:
            return False
        if self.image != other.image:
            return False
        if self.include_in_menu != other.include_in_menu:
            return False
        if self.increment_id != other.increment_id:
            return False
        if self.is_active != other.is_active:
            return False
        if self.is_anchor != other.is_anchor:
            return False
        if self.landing_page != other.landing_page:
            return False
        if self.level != other.level:
            return False
        if self.meta_description != other.meta_description:
            return False
        if self.meta_keywords != other.meta_keywords:
            return False
        if self.meta_title != other.meta_title:
            return False
        if self.name != other.name:
            return False
        if self.page_layout != other.page_layout:
            return False
        if self.parent_id != other.parent_id:
            return False
        if self.path != other.path:
            return False
        if self.path_in_store != other.path_in_store:
            return False
        if self.position != other.position:
            return False
        if self.thumbnail != other.thumbnail:
            return False
        if self.updated_at != other.updated_at:
            return False
        if self.url_key != other.url_key:
            return False
        if self.url_path != other.url_path:
            return False
        return True

    def __hash__(self):
        return hash((self.category_id,self.children,self.created_at,self.description,self.display_mode,self.filter_price_range,self.image,self.include_in_menu,self.increment_id,self.is_active,self.is_anchor,self.landing_page,self.level,self.meta_description,self.meta_keywords,self.meta_title,self.name,self.page_layout,self.parent_id,self.path,self.path_in_store,self.position,self.thumbnail,self.updated_at,self.url_key,self.url_path,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('category_id=' + repr(self.category_id))
        if self.children is not None:
            field_reprs.append('children=' + repr(self.children))
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.display_mode is not None:
            field_reprs.append('display_mode=' + repr(self.display_mode))
        if self.filter_price_range is not None:
            field_reprs.append('filter_price_range=' + "'" + self.filter_price_range.encode('ascii', 'replace') + "'")
        if self.image is not None:
            field_reprs.append('image=' + "'" + self.image.encode('ascii', 'replace') + "'")
        if self.include_in_menu is not None:
            field_reprs.append('include_in_menu=' + repr(self.include_in_menu))
        if self.increment_id is not None:
            field_reprs.append('increment_id=' + "'" + self.increment_id.encode('ascii', 'replace') + "'")
        field_reprs.append('is_active=' + repr(self.is_active))
        if self.is_anchor is not None:
            field_reprs.append('is_anchor=' + repr(self.is_anchor))
        if self.landing_page is not None:
            field_reprs.append('landing_page=' + "'" + self.landing_page.encode('ascii', 'replace') + "'")
        field_reprs.append('level=' + repr(self.level))
        if self.meta_description is not None:
            field_reprs.append('meta_description=' + "'" + self.meta_description.encode('ascii', 'replace') + "'")
        if self.meta_keywords is not None:
            field_reprs.append('meta_keywords=' + "'" + self.meta_keywords.encode('ascii', 'replace') + "'")
        if self.meta_title is not None:
            field_reprs.append('meta_title=' + "'" + self.meta_title.encode('ascii', 'replace') + "'")
        if self.name is not None:
            field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        if self.page_layout is not None:
            field_reprs.append('page_layout=' + "'" + self.page_layout.encode('ascii', 'replace') + "'")
        field_reprs.append('parent_id=' + repr(self.parent_id))
        field_reprs.append('path=' + "'" + self.path.encode('ascii', 'replace') + "'")
        if self.path_in_store is not None:
            field_reprs.append('path_in_store=' + "'" + self.path_in_store.encode('ascii', 'replace') + "'")
        field_reprs.append('position=' + repr(self.position))
        if self.thumbnail is not None:
            field_reprs.append('thumbnail=' + "'" + self.thumbnail.encode('ascii', 'replace') + "'")
        field_reprs.append('updated_at=' + repr(self.updated_at))
        if self.url_key is not None:
            field_reprs.append('url_key=' + "'" + self.url_key.encode('ascii', 'replace') + "'")
        if self.url_path is not None:
            field_reprs.append('url_path=' + "'" + self.url_path.encode('ascii', 'replace') + "'")
        return 'MagentoCategory(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('category_id=' + repr(self.category_id))
        if self.children is not None:
            field_reprs.append('children=' + repr(self.children))
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.display_mode is not None:
            field_reprs.append('display_mode=' + repr(self.display_mode))
        if self.filter_price_range is not None:
            field_reprs.append('filter_price_range=' + "'" + self.filter_price_range.encode('ascii', 'replace') + "'")
        if self.image is not None:
            field_reprs.append('image=' + "'" + self.image.encode('ascii', 'replace') + "'")
        if self.include_in_menu is not None:
            field_reprs.append('include_in_menu=' + repr(self.include_in_menu))
        if self.increment_id is not None:
            field_reprs.append('increment_id=' + "'" + self.increment_id.encode('ascii', 'replace') + "'")
        field_reprs.append('is_active=' + repr(self.is_active))
        if self.is_anchor is not None:
            field_reprs.append('is_anchor=' + repr(self.is_anchor))
        if self.landing_page is not None:
            field_reprs.append('landing_page=' + "'" + self.landing_page.encode('ascii', 'replace') + "'")
        field_reprs.append('level=' + repr(self.level))
        if self.meta_description is not None:
            field_reprs.append('meta_description=' + "'" + self.meta_description.encode('ascii', 'replace') + "'")
        if self.meta_keywords is not None:
            field_reprs.append('meta_keywords=' + "'" + self.meta_keywords.encode('ascii', 'replace') + "'")
        if self.meta_title is not None:
            field_reprs.append('meta_title=' + "'" + self.meta_title.encode('ascii', 'replace') + "'")
        if self.name is not None:
            field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        if self.page_layout is not None:
            field_reprs.append('page_layout=' + "'" + self.page_layout.encode('ascii', 'replace') + "'")
        field_reprs.append('parent_id=' + repr(self.parent_id))
        field_reprs.append('path=' + "'" + self.path.encode('ascii', 'replace') + "'")
        if self.path_in_store is not None:
            field_reprs.append('path_in_store=' + "'" + self.path_in_store.encode('ascii', 'replace') + "'")
        field_reprs.append('position=' + repr(self.position))
        if self.thumbnail is not None:
            field_reprs.append('thumbnail=' + "'" + self.thumbnail.encode('ascii', 'replace') + "'")
        field_reprs.append('updated_at=' + repr(self.updated_at))
        if self.url_key is not None:
            field_reprs.append('url_key=' + "'" + self.url_key.encode('ascii', 'replace') + "'")
        if self.url_path is not None:
            field_reprs.append('url_path=' + "'" + self.url_path.encode('ascii', 'replace') + "'")
        return 'MagentoCategory(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'category_id': self.category_id, 'children': self.children, 'created_at': self.created_at, 'description': self.description, 'display_mode': self.display_mode, 'filter_price_range': self.filter_price_range, 'image': self.image, 'include_in_menu': self.include_in_menu, 'increment_id': self.increment_id, 'is_active': self.is_active, 'is_anchor': self.is_anchor, 'landing_page': self.landing_page, 'level': self.level, 'meta_description': self.meta_description, 'meta_keywords': self.meta_keywords, 'meta_title': self.meta_title, 'name': self.name, 'page_layout': self.page_layout, 'parent_id': self.parent_id, 'path': self.path, 'path_in_store': self.path_in_store, 'position': self.position, 'thumbnail': self.thumbnail, 'updated_at': self.updated_at, 'url_key': self.url_key, 'url_path': self.url_path}

    @property
    def category_id(self):
        return self.__category_id

    @property
    def children(self):
        return self.__children

    @property
    def created_at(self):
        return self.__created_at

    @property
    def description(self):
        return self.__description

    @property
    def display_mode(self):
        return self.__display_mode

    @property
    def filter_price_range(self):
        return self.__filter_price_range

    @property
    def image(self):
        return self.__image

    @property
    def include_in_menu(self):
        return self.__include_in_menu

    @property
    def increment_id(self):
        return self.__increment_id

    @property
    def is_active(self):
        return self.__is_active

    @property
    def is_anchor(self):
        return self.__is_anchor

    @property
    def landing_page(self):
        return self.__landing_page

    @property
    def level(self):
        return self.__level

    @property
    def meta_description(self):
        return self.__meta_description

    @property
    def meta_keywords(self):
        return self.__meta_keywords

    @property
    def meta_title(self):
        return self.__meta_title

    @property
    def name(self):
        return self.__name

    @property
    def page_layout(self):
        return self.__page_layout

    @property
    def parent_id(self):
        return self.__parent_id

    @property
    def path(self):
        return self.__path

    @property
    def path_in_store(self):
        return self.__path_in_store

    @property
    def position(self):
        return self.__position

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'category_id':
                init_kwds['category_id'] = iprot.readI32()
            elif ifield_name == 'children':
                init_kwds['children'] = tuple([yogento.api.models.catalog.category.magento.magento_category.MagentoCategory.read(iprot) for _ in xrange(iprot.readListBegin()[1])] + (iprot.readListEnd() is None and []))
            elif ifield_name == 'created_at':
                init_kwds['created_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'description':
                try:
                    init_kwds['description'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'display_mode':
                try:
                    init_kwds['display_mode'] = yogento.api.models.catalog.category.magento.magento_category_display_mode.MagentoCategoryDisplayMode.value_of(iprot.readString().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'filter_price_range':
                try:
                    init_kwds['filter_price_range'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'image':
                try:
                    init_kwds['image'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'include_in_menu':
                try:
                    init_kwds['include_in_menu'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'increment_id':
                try:
                    init_kwds['increment_id'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'is_active':
                init_kwds['is_active'] = iprot.readBool()
            elif ifield_name == 'is_anchor':
                try:
                    init_kwds['is_anchor'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'landing_page':
                try:
                    init_kwds['landing_page'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'level':
                init_kwds['level'] = iprot.readI32()
            elif ifield_name == 'meta_description':
                try:
                    init_kwds['meta_description'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'meta_keywords':
                try:
                    init_kwds['meta_keywords'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'meta_title':
                try:
                    init_kwds['meta_title'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'name':
                try:
                    init_kwds['name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'page_layout':
                try:
                    init_kwds['page_layout'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'parent_id':
                init_kwds['parent_id'] = iprot.readI32()
            elif ifield_name == 'path':
                init_kwds['path'] = iprot.readString()
            elif ifield_name == 'path_in_store':
                try:
                    init_kwds['path_in_store'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'position':
                init_kwds['position'] = iprot.readI32()
            elif ifield_name == 'thumbnail':
                try:
                    init_kwds['thumbnail'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'updated_at':
                init_kwds['updated_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'url_key':
                try:
                    init_kwds['url_key'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'url_path':
                try:
                    init_kwds['url_path'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, category_id=None, children=None, created_at=None, description=None, display_mode=None, filter_price_range=None, image=None, include_in_menu=None, increment_id=None, is_active=None, is_anchor=None, landing_page=None, level=None, meta_description=None, meta_keywords=None, meta_title=None, name=None, page_layout=None, parent_id=None, path=None, path_in_store=None, position=None, thumbnail=None, updated_at=None, url_key=None, url_path=None):
        if category_id is None:
            category_id = self.category_id
        if children is None:
            children = self.children
        if created_at is None:
            created_at = self.created_at
        if description is None:
            description = self.description
        if display_mode is None:
            display_mode = self.display_mode
        if filter_price_range is None:
            filter_price_range = self.filter_price_range
        if image is None:
            image = self.image
        if include_in_menu is None:
            include_in_menu = self.include_in_menu
        if increment_id is None:
            increment_id = self.increment_id
        if is_active is None:
            is_active = self.is_active
        if is_anchor is None:
            is_anchor = self.is_anchor
        if landing_page is None:
            landing_page = self.landing_page
        if level is None:
            level = self.level
        if meta_description is None:
            meta_description = self.meta_description
        if meta_keywords is None:
            meta_keywords = self.meta_keywords
        if meta_title is None:
            meta_title = self.meta_title
        if name is None:
            name = self.name
        if page_layout is None:
            page_layout = self.page_layout
        if parent_id is None:
            parent_id = self.parent_id
        if path is None:
            path = self.path
        if path_in_store is None:
            path_in_store = self.path_in_store
        if position is None:
            position = self.position
        if thumbnail is None:
            thumbnail = self.thumbnail
        if updated_at is None:
            updated_at = self.updated_at
        if url_key is None:
            url_key = self.url_key
        if url_path is None:
            url_path = self.url_path
        return self.__class__(category_id=category_id, children=children, created_at=created_at, description=description, display_mode=display_mode, filter_price_range=filter_price_range, image=image, include_in_menu=include_in_menu, increment_id=increment_id, is_active=is_active, is_anchor=is_anchor, landing_page=landing_page, level=level, meta_description=meta_description, meta_keywords=meta_keywords, meta_title=meta_title, name=name, page_layout=page_layout, parent_id=parent_id, path=path, path_in_store=path_in_store, position=position, thumbnail=thumbnail, updated_at=updated_at, url_key=url_key, url_path=url_path)

    @property
    def thumbnail(self):
        return self.__thumbnail

    @property
    def updated_at(self):
        return self.__updated_at

    @property
    def url_key(self):
        return self.__url_key

    @property
    def url_path(self):
        return self.__url_path

    def write(self, oprot):
        oprot.writeStructBegin('MagentoCategory')

        oprot.writeFieldBegin('category_id', 8, -1)
        oprot.writeI32(self.category_id)
        oprot.writeFieldEnd()

        if self.children is not None:
            oprot.writeFieldBegin('children', 15, -1)
            oprot.writeListBegin(12, len(self.children))
            for _0 in self.children:
                _0.write(oprot)
            oprot.writeListEnd()
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('created_at', 12, -1)
        oprot.writeDateTime(self.created_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.created_at.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.description is not None:
            oprot.writeFieldBegin('description', 11, -1)
            oprot.writeString(self.description)
            oprot.writeFieldEnd()

        if self.display_mode is not None:
            oprot.writeFieldBegin('display_mode', 11, -1)
            oprot.writeString([attr for attr in dir(yogento.api.models.catalog.category.magento.magento_category_display_mode.MagentoCategoryDisplayMode) if getattr(yogento.api.models.catalog.category.magento.magento_category_display_mode.MagentoCategoryDisplayMode, attr) == self.display_mode][0])
            oprot.writeFieldEnd()

        if self.filter_price_range is not None:
            oprot.writeFieldBegin('filter_price_range', 11, -1)
            oprot.writeString(self.filter_price_range)
            oprot.writeFieldEnd()

        if self.image is not None:
            oprot.writeFieldBegin('image', 11, -1)
            oprot.writeString(self.image)
            oprot.writeFieldEnd()

        if self.include_in_menu is not None:
            oprot.writeFieldBegin('include_in_menu', 2, -1)
            oprot.writeBool(self.include_in_menu)
            oprot.writeFieldEnd()

        if self.increment_id is not None:
            oprot.writeFieldBegin('increment_id', 11, -1)
            oprot.writeString(self.increment_id)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('is_active', 2, -1)
        oprot.writeBool(self.is_active)
        oprot.writeFieldEnd()

        if self.is_anchor is not None:
            oprot.writeFieldBegin('is_anchor', 2, -1)
            oprot.writeBool(self.is_anchor)
            oprot.writeFieldEnd()

        if self.landing_page is not None:
            oprot.writeFieldBegin('landing_page', 11, -1)
            oprot.writeString(self.landing_page)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('level', 8, -1)
        oprot.writeI32(self.level)
        oprot.writeFieldEnd()

        if self.meta_description is not None:
            oprot.writeFieldBegin('meta_description', 11, -1)
            oprot.writeString(self.meta_description)
            oprot.writeFieldEnd()

        if self.meta_keywords is not None:
            oprot.writeFieldBegin('meta_keywords', 11, -1)
            oprot.writeString(self.meta_keywords)
            oprot.writeFieldEnd()

        if self.meta_title is not None:
            oprot.writeFieldBegin('meta_title', 11, -1)
            oprot.writeString(self.meta_title)
            oprot.writeFieldEnd()

        if self.name is not None:
            oprot.writeFieldBegin('name', 11, -1)
            oprot.writeString(self.name)
            oprot.writeFieldEnd()

        if self.page_layout is not None:
            oprot.writeFieldBegin('page_layout', 11, -1)
            oprot.writeString(self.page_layout)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('parent_id', 8, -1)
        oprot.writeI32(self.parent_id)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('path', 11, -1)
        oprot.writeString(self.path)
        oprot.writeFieldEnd()

        if self.path_in_store is not None:
            oprot.writeFieldBegin('path_in_store', 11, -1)
            oprot.writeString(self.path_in_store)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('position', 8, -1)
        oprot.writeI32(self.position)
        oprot.writeFieldEnd()

        if self.thumbnail is not None:
            oprot.writeFieldBegin('thumbnail', 11, -1)
            oprot.writeString(self.thumbnail)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('updated_at', 12, -1)
        oprot.writeDateTime(self.updated_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.updated_at.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.url_key is not None:
            oprot.writeFieldBegin('url_key', 11, -1)
            oprot.writeString(self.url_key)
            oprot.writeFieldEnd()

        if self.url_path is not None:
            oprot.writeFieldBegin('url_path', 11, -1)
            oprot.writeString(self.url_path)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
