package co.com.bancolombia.certificacion.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Task;
import static co.com.bancolombia.certificacion.userinterfaces.BarraDeNavegacion.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Calcular implements Task {


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(


                Click.on(LNK_CALCULAR)

        );

    }

    public static Calcular valor(){
        return instrumented(Calcular.class);

    }





}
