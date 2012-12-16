package com.yogento.api.services.user_settings;

public interface UserSettingsService {
    public com.yogento.api.models.user_settings.UserSettings getCurrentUserSettings() throws com.yogento.api.services.user_settings.NoSuchUserSettingsException;
    public void putCurrentUserSettings(com.yogento.api.models.user_settings.UserSettings userSettings);
}
