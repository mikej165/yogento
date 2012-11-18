package com.yogento.api.services.user;

public interface UserService {
    public boolean deleteUserByUsername(String username);
    public com.yogento.api.models.user.User getCurrentUser() throws com.yogento.api.services.user.NoSuchUserException;
    public com.yogento.api.models.user.UserSettings getCurrentUserSettings() throws com.yogento.api.services.user.NoSuchUserException, com.yogento.api.services.user.NoSuchUserSettingsException;
    public com.yogento.api.models.user.UserSettings getUserSettingsByUsername(String username) throws com.yogento.api.services.user.NoSuchUserException, com.yogento.api.services.user.NoSuchUserSettingsException;
    public com.yogento.api.models.user.User getUserByUsername(String username) throws com.yogento.api.services.user.NoSuchUserException;
    public boolean headUserByUsername(String username);
    public void putCurrentUserSettings(com.yogento.api.models.user.UserSettings userSettings) throws com.yogento.api.services.user.NoSuchUserException;
    public void putUser(com.yogento.api.models.user.User user);
    public void putUserSettings(String username, com.yogento.api.models.user.UserSettings userSettings) throws com.yogento.api.services.user.NoSuchUserException;
}
