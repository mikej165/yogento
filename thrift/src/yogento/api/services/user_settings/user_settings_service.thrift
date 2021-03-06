namespace java com.yogento.api.services.user_settings
namespace gwt_client_java com.yogento.gui.client.services.user_settings
namespace gwt_server_java com.yogento.gui.server.services.user_settings
namespace * yogento.api.services.user_settings

include "yogento/api/models/user_settings/user_settings.thrift"
include "yogento/api/services/user_settings/no_such_user_settings_exception.thrift"
include "yogento/api/services/user_settings/user_settings_io_exception.thrift"

service UserSettingsService {
    user_settings.UserSettings
    get_current_user_settings()
    throws (
        no_such_user_settings_exception.NoSuchUserSettingsException e1,
        user_settings_io_exception.UserSettingsIoException e2
    );

    void
    put_current_user_settings(
        user_settings.UserSettings user_settings
    ) throws (
        user_settings_io_exception.UserSettingsIoException e
    );
}
