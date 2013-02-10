namespace java com.yogento.api.services.user_settings
namespace * yogento.api.services.user_settings

include "yogento/api/models/user_settings/user_settings.thrift"
include "yogento/api/services/user_settings/no_such_user_settings_exception.thrift"

service UserSettingsService {
    user_settings.UserSettings get_current_user_settings() throws (no_such_user_settings_exception.NoSuchUserSettingsException e);
    void put_current_user_settings(user_settings.UserSettings user_settings);
}
