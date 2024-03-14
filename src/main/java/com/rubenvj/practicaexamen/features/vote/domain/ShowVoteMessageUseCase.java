package com.rubenvj.practicaexamen.features.vote.domain;

import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfig;
import com.rubenvj.practicaexamen.features.appconfig.domain.AppConfigRepository;

public class ShowVoteMessageUseCase {
    private AppConfigRepository appConfigRepository;
    private final int voteOpenned = 5;

    public ShowVoteMessageUseCase (AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }

    public Boolean execute () {
        AppConfig appConfig = appConfigRepository.getAppConfig();

       return appConfig != null && appConfig.countTimeOpened==voteOpenned;
    }
}
