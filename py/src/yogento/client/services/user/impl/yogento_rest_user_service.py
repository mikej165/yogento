from yogento.api.models.user.user import User
from yogento.api.models.user.user_settings import UserSettings
from yogento.api.services.user.user_service import UserService
from yogento.client.services._yogento_rest_service import _YogentoRestService


class YogentoRestUserService(_YogentoRestService, UserService):
    def _get_current_user(self):
        return self._get_model(User, '/users/current')

    def _get_current_user_settings(self):
        return self._get_model(UserSettings, '/users/current/settings')

    def _put_current_user_settings(self, user_settings):
        return self._put_model(user_settings, '/users/current/settings')
