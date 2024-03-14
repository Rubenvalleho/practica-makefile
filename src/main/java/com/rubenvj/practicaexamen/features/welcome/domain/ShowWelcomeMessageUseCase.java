package com.rubenvj.practicaexamen.features.welcome.domain;

import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfig;
import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfigRepository;

import javax.swing.text.StyledEditorKit;

public class ShowWelcomeMessageUseCase {
    private AppConfigRepository appConfigRepository;
    public ShowWelcomeMessageUseCase(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }

    public Boolean execute() {
        AppConfig appConfig = appConfigRepository.getAppConfig();

        return  appConfig != null && appConfig.countTimeOpened == 0;
    }
}
