package com.rubenvj.practicaexamen.features.vote.data;

import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfig;
import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfigRepository;

public class StubCincoAppConfigDataRepository implements AppConfigRepository {

    @Override
    public AppConfig getAppConfig() {
        return new AppConfig(5);
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}
