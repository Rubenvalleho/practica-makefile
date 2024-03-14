package com.rubenvj.practicaexamen.features.welcome.data;

import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfig;
import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfigRepository;

public class Stub2AppConfigDataRepository implements AppConfigRepository {

    @Override
    public AppConfig getAppConfig() {
        return new AppConfig(1);
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}
