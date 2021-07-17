package co.com.bancolombia.certificacion.setup.hook;

import co.com.bancolombia.certificacion.utilities.WebDriverFactory;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static co.com.bancolombia.certificacion.enums.Actor.CLIENTE;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Hook {

    @Before
    public void conversorDeTasas(){
        setTheStage(new OnlineCast());
        theActor(CLIENTE.getActor());

        theActorInTheSpotlight().can(BrowseTheWeb.with(WebDriverFactory.getDriver()));


    }

}
