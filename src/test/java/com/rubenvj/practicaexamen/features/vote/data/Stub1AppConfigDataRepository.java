package com.rubenvj.practicaexamen.features.vote.data;

import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfig;
import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfigRepository;

public class Stub1AppConfigDataRepository implements AppConfigRepository {

    @Override
    public AppConfig getAppConfig() {
        return null;
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}
