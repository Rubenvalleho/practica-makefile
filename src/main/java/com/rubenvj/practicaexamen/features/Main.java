package com.rubenvj.practicaexamen.features;

import com.rubenvj.practicaexamen.features.appconfig.presentation.AppConfigPresentation;
import com.rubenvj.practicaexamen.features.vote.presentation.VotePresentation;
import com.rubenvj.practicaexamen.features.welcome.presentation.WelcomePresentation;

public class Main {
    public static void main(String[] args) {
        AppConfigPresentation.incrementAppOpened();

        WelcomePresentation.showWelcomeMessage();

        VotePresentation.showVoteMessage();
    }
}