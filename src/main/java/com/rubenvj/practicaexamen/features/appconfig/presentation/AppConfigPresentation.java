package com.rubenvj.practicaexamen.features.appconfig.presentation;

import com.rubenvj.practicaexamen.features.appconfig.data.AppConfigDataRepository;
import com.rubenvj.practicaexamen.features.appconfig.data.local.FileLocalDataSource;
import com.rubenvj.practicaexamen.features.appconfig.domain.IncrementAppOpenedUseCase;

public class AppConfigPresentation {
    public static void incrementAppOpened() {
        AppConfigDataRepository appConfigDataRepository = new AppConfigDataRepository(new FileLocalDataSource());
        IncrementAppOpenedUseCase incrementAppOpenedUseCase = new IncrementAppOpenedUseCase(appConfigDataRepository);

        incrementAppOpenedUseCase.execute();
    }
}
