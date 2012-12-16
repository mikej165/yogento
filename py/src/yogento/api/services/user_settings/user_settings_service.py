import __builtin__
import yogento.api.models.user_settings.user_settings


class UserSettingsService(object):
    def get_current_user_settings(self):
        get_current_user_settings_return_value = self._get_current_user_settings()

        if not isinstance(get_current_user_settings_return_value, yogento.api.models.user_settings.user_settings.UserSettings):
            raise TypeError(getattr(__builtin__, 'type')(get_current_user_settings_return_value))

        return get_current_user_settings_return_value

    def _get_current_user_settings(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_current_user_settings')

    def put_current_user_settings(self, user_settings):
        if user_settings is None:
            raise ValueError('user_settings is required')
        if not isinstance(user_settings, yogento.api.models.user_settings.user_settings.UserSettings):
            raise TypeError(getattr(__builtin__, 'type')(user_settings))

        self._put_current_user_settings(user_settings=user_settings)

    def _put_current_user_settings(self, user_settings):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_current_user_settings')
