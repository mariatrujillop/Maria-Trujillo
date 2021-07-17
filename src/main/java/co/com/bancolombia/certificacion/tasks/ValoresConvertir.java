package co.com.bancolombia.certificacion.tasks;

import java.util.List;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Actor;
import co.com.bancolombia.certificacion.models.Valores;
import static co.com.bancolombia.certificacion.userinterfaces.BarraDeNavegacion.*;



public class ValoresConvertir implements Task {

    private List<Valores> valores;

    public ValoresConvertir(List<Valores> valores){this.valores = valores;}

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(

                Enter.theValue(valores.get(0).getTasainteres()).into(TXT_TASA_INTERES),
                Click.on(LNK_PERIODICIDAD),
                Click.on(LNK_CAPITALIZACION)







        );


    }
    public static ValoresConvertir conLosDatos(List<Valores> valores){
        return Tasks.instrumented(ValoresConvertir.class, valores);

    }



}