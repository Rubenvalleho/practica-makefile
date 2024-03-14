package com.rubenvj.practicaexamen.features.appconfig.data;

import com.rubenvj.practicaexamen.features.appconfig.data.local.FileLocalDataSource;
import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfig;
import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfigRepository;

import java.io.File;

public class AppConfigDataRepository implements AppConfigRepository {

    private FileLocalDataSource fileLocalDataSource;

    public AppConfigDataRepository (FileLocalDataSource fileLocalDataSource) {
        this.fileLocalDataSource = fileLocalDataSource;
    }


    @Override
    public AppConfig getAppConfig() {
        return fileLocalDataSource.obtain();
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {
        fileLocalDataSource.save(appConfig);
    }
}
