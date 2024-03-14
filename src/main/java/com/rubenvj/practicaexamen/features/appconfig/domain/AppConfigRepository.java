package com.rubenvj.practicaexamen.features.appconfig.domain;

public interface AppConfigRepository {
    public AppConfig getAppConfig();

    public void saveAppConfig(AppConfig appConfig);
}
