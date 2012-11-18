import __builtin__
import yogento.api.models.user.user
import yogento.api.models.user.user_settings


class UserService(object):
    def delete_user_by_username(self, username):
        if username is None:
            raise ValueError('username is required')
        if not isinstance(username, basestring):
            raise TypeError(getattr(__builtin__, 'type')(username))

        delete_user_by_username_return_value = self._delete_user_by_username(username=username)

        if not isinstance(delete_user_by_username_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(delete_user_by_username_return_value))

        return delete_user_by_username_return_value

    def _delete_user_by_username(self, username):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_user_by_username')

    def get_current_user(self):
        get_current_user_return_value = self._get_current_user()

        if not isinstance(get_current_user_return_value, yogento.api.models.user.user.User):
            raise TypeError(getattr(__builtin__, 'type')(get_current_user_return_value))

        return get_current_user_return_value

    def _get_current_user(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_current_user')

    def get_current_user_settings(self):
        get_current_user_settings_return_value = self._get_current_user_settings()

        if not isinstance(get_current_user_settings_return_value, yogento.api.models.user.user_settings.UserSettings):
            raise TypeError(getattr(__builtin__, 'type')(get_current_user_settings_return_value))

        return get_current_user_settings_return_value

    def _get_current_user_settings(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_current_user_settings')

    def get_user_settings_by_username(self, username):
        if username is None:
            raise ValueError('username is required')
        if not isinstance(username, basestring):
            raise TypeError(getattr(__builtin__, 'type')(username))

        get_user_settings_by_username_return_value = self._get_user_settings_by_username(username=username)

        if not isinstance(get_user_settings_by_username_return_value, yogento.api.models.user.user_settings.UserSettings):
            raise TypeError(getattr(__builtin__, 'type')(get_user_settings_by_username_return_value))

        return get_user_settings_by_username_return_value

    def _get_user_settings_by_username(self, username):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_user_settings_by_username')

    def get_user_by_username(self, username):
        if username is None:
            raise ValueError('username is required')
        if not isinstance(username, basestring):
            raise TypeError(getattr(__builtin__, 'type')(username))

        get_user_by_username_return_value = self._get_user_by_username(username=username)

        if not isinstance(get_user_by_username_return_value, yogento.api.models.user.user.User):
            raise TypeError(getattr(__builtin__, 'type')(get_user_by_username_return_value))

        return get_user_by_username_return_value

    def _get_user_by_username(self, username):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_user_by_username')

    def head_user_by_username(self, username):
        if username is None:
            raise ValueError('username is required')
        if not isinstance(username, basestring):
            raise TypeError(getattr(__builtin__, 'type')(username))

        head_user_by_username_return_value = self._head_user_by_username(username=username)

        if not isinstance(head_user_by_username_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(head_user_by_username_return_value))

        return head_user_by_username_return_value

    def _head_user_by_username(self, username):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._head_user_by_username')

    def put_current_user_settings(self, user_settings):
        if user_settings is None:
            raise ValueError('user_settings is required')
        if not isinstance(user_settings, yogento.api.models.user.user_settings.UserSettings):
            raise TypeError(getattr(__builtin__, 'type')(user_settings))

        self._put_current_user_settings(user_settings=user_settings)

    def _put_current_user_settings(self, user_settings):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_current_user_settings')

    def put_user(self, user):
        if user is None:
            raise ValueError('user is required')
        if not isinstance(user, yogento.api.models.user.user.User):
            raise TypeError(getattr(__builtin__, 'type')(user))

        self._put_user(user=user)

    def _put_user(self, user):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_user')

    def put_user_settings(self, username, user_settings):
        if username is None:
            raise ValueError('username is required')
        if not isinstance(username, basestring):
            raise TypeError(getattr(__builtin__, 'type')(username))
        if user_settings is None:
            raise ValueError('user_settings is required')
        if not isinstance(user_settings, yogento.api.models.user.user_settings.UserSettings):
            raise TypeError(getattr(__builtin__, 'type')(user_settings))

        self._put_user_settings(username=username, user_settings=user_settings)

    def _put_user_settings(self, username, user_settings):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_user_settings')
