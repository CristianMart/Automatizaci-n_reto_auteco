package co.com.test.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ConfiguracionInicial {

    @Before
    public void ConfiguracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }
}
