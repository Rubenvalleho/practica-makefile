package com.rubenvj.practicaexamen.features.welcome.presentation;

import com.rubenvj.practicaexamen.features.appconfig.data.AppConfigDataRepository;
import com.rubenvj.practicaexamen.features.appconfig.data.local.FileLocalDataSource;
import com.rubenvj.practicaexamen.features.welcome.domain.ShowWelcomeMessageUseCase;

public class WelcomePresentation {
    public static void showWelcomeMessage() {
        AppConfigDataRepository appConfigDataRepository = new AppConfigDataRepository(new FileLocalDataSource());
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(appConfigDataRepository);

        if (showWelcomeMessageUseCase.execute()) {
            System.out.println("Bienvenido a la aplicacion");
        }
    }
}
