package co.com.bancolombia.certificacion.stepdefinitions;

import co.com.bancolombia.certificacion.enums.Portal;
import co.com.bancolombia.certificacion.models.Valores;
import co.com.bancolombia.certificacion.tasks.Calcular;
import co.com.bancolombia.certificacion.tasks.Navegar;
import co.com.bancolombia.certificacion.tasks.ValoresConvertir;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;



import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConversorDeTasas {



    @DataTableType
    public Valores usuarioEntry(Map<String, String> entry){
        return new Valores(
                entry.get("Valores")

        );

    }



    @Dado("que el cliente ingresa al portal de Bancolombia")
    public void queElClienteIngresaAlPortalDeBancolombia() {

            theActorInTheSpotlight().wasAbleTo(Open.url(Portal.DEMO_QA.getUrl()));

    }

    @Cuando("el cliente selecciona la opcion de conversor de tasas de interes")
    public void elClienteSeleccionaLaOpcionDeConversorDeTasasDeInteres() {
        theActorInTheSpotlight().attemptsTo(
                Navegar.pagina()


        );

    }

    @Y("el cliente seleccione calcular de la opcion de tasa nominal a tasa efectiva")
    public void elClienteSeleccioneCalcularDeLaOpcionDeTasaNominalATasaEfectiva() {

        theActorInTheSpotlight().attemptsTo(
                Calcular.valor()
        );

    }

    @Y("el cliente ingrese los valores requeridos para el calculo")
    public void elClienteIngreseLosValoresRequeridosParaElCalculo(List<Valores> valores) {
        theActorInTheSpotlight().attemptsTo(ValoresConvertir.conLosDatos(valores));

       }

    @Entonces("el cliente podra visualizar la informacion requerida de forma exitosa")
    public void elClientePodraVisualizarLaInformacionRequeridaDeFormaExitosa(String string) {

    }
}
