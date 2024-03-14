package com.rubenvj.practicaexamen.features.welcome.data;

import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfig;
import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfigRepository;

public class Stub3AppConfigDataRepository implements AppConfigRepository {

    @Override
    public AppConfig getAppConfig() {
        return null;
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}
