package com.rubenvj.practicaexamen.features.welcome.domain;

import com.rubenvj.practicaexamen.features.welcome.data.Stub1AppConfigRepository;
import com.rubenvj.practicaexamen.features.welcome.data.Stub2AppConfigDataRepository;
import com.rubenvj.practicaexamen.features.welcome.data.Stub3AppConfigDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShowWelcomeMessageUseCaseTest {

    private ShowWelcomeMessageUseCase showWelcomeMessageUseCase = null;
    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearsDown() {

    }

    @Test
    public void siCountTimeOppenedEsCeroEntoncesObtengoUnTrue() {
        Stub1AppConfigRepository stub1AppConfigRepository = new Stub1AppConfigRepository();
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(stub1AppConfigRepository);

        Boolean isZero = showWelcomeMessageUseCase.execute();

        Assertions.assertTrue(isZero);
    }

    @Test
    public void cuandoCountTimeOpennedEsDistintoACeroEntoncesObtengoUnFalse() {
        Stub2AppConfigDataRepository stub2AppConfigDataRepository = new Stub2AppConfigDataRepository();
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(stub2AppConfigDataRepository);

        Boolean isMayorQueZero = showWelcomeMessageUseCase.execute();

        Assertions.assertFalse(isMayorQueZero);
    }

    @Test

    public void cuandoCountTimeOpennedEsNullEntoncesObtengoUnFalse() {
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(new Stub3AppConfigDataRepository());

        Boolean isNull = showWelcomeMessageUseCase.execute();

        Assertions.assertFalse(isNull);
    }
}
