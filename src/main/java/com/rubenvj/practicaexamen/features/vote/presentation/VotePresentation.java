package com.rubenvj.practicaexamen.features.vote.presentation;

import com.rubenvj.practicaexamen.features.appconfig.data.AppConfigDataRepository;
import com.rubenvj.practicaexamen.features.appconfig.data.local.FileLocalDataSource;
import com.rubenvj.practicaexamen.features.vote.domain.ShowVoteMessageUseCase;

public class VotePresentation {
    public static void showVoteMessage() {
        AppConfigDataRepository appConfigDataRepository = new AppConfigDataRepository(new FileLocalDataSource());
        ShowVoteMessageUseCase showVoteMessageUseCase = new ShowVoteMessageUseCase(appConfigDataRepository);
        Boolean isFive = showVoteMessageUseCase.execute();

        if (isFive) {
            System.out.println("Vote nuestra aplicacion por favor");
        }
    }
}
