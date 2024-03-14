package com.rubenvj.practicaexamen.features.vote.domain;

import com.rubenvj.practicaexamen.features.vote.data.Stub1AppConfigDataRepository;
import com.rubenvj.practicaexamen.features.vote.data.Stub2AppConfigDataRepository;
import com.rubenvj.practicaexamen.features.vote.data.StubCincoAppConfigDataRepository;
import com.rubenvj.practicaexamen.features.welcome.domain.ShowWelcomeMessageUseCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShowVoteMessageUseCaseTest {
    private ShowVoteMessageUseCase showVoteMessageUseCase;

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearsDown() {
        showVoteMessageUseCase = null;
    }

    @Test
    public void cuandoCountTimeOppenedEsNullEntoncesObtengoUnFalse() {
        ShowVoteMessageUseCase showVoteMessageUseCase = new ShowVoteMessageUseCase(new Stub1AppConfigDataRepository());

        Boolean showVote = showVoteMessageUseCase.execute();

        Assertions.assertFalse(showVote);
    }

    @Test
    public void cuandoCountTimeOpennedEsDistintoACincoEntoncesObtengoUnFalse() {
        ShowVoteMessageUseCase showVoteMessageUseCase = new ShowVoteMessageUseCase(new Stub2AppConfigDataRepository());

        Boolean showVote = showVoteMessageUseCase.execute();

        Assertions.assertFalse(showVote);
    }

    @Test
    public void cuandoCountTimeOpennedEsIgualACincoEntoncesObtengoUnTrue() {
        ShowVoteMessageUseCase showVoteMessageUseCase = new ShowVoteMessageUseCase(new StubCincoAppConfigDataRepository());
        Boolean showVote = showVoteMessageUseCase.execute();

        Assertions.assertTrue(showVote);


    }
}
