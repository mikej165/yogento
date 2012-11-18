namespace java com.yogento.api.services.user
namespace py yogento.api.services.user

include "yogento/api/models/user/user.thrift"
include "yogento/api/models/user/user_settings.thrift"
include "yogento/api/services/user/no_such_user_exception.thrift"
include "yogento/api/services/user/no_such_user_settings_exception.thrift"

service UserService {
    bool delete_user_by_username(required string username);

    user.User get_current_user() throws (no_such_user_exception.NoSuchUserException e);
    user_settings.UserSettings get_current_user_settings() throws (no_such_user_exception.NoSuchUserException e1, no_such_user_settings_exception.NoSuchUserSettingsException e2);
    user_settings.UserSettings get_user_settings_by_username(required string username) throws (no_such_user_exception.NoSuchUserException e1, no_such_user_settings_exception.NoSuchUserSettingsException e2);
    user.User get_user_by_username(required string username) throws (no_such_user_exception.NoSuchUserException e);
    
    bool head_user_by_username(required string username);

    void put_current_user_settings(required user_settings.UserSettings user_settings) throws (no_such_user_exception.NoSuchUserException e);
    void put_user(user.User user);
    void put_user_settings(required string username, required user_settings.UserSettings user_settings) throws (no_such_user_exception.NoSuchUserException e);
}
