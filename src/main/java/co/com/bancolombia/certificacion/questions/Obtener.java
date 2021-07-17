package co.com.bancolombia.certificacion.questions;
import net.serenitybdd.screenplay.questions.Text;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.targets.Target;




public class Obtener implements Question<String> {

    private Target campo;
     public Obtener(Target campo){this.campo = campo;}

    @Override
    @Subject("Se obtiene el texto del campo")

    public String answeredBy(Actor actor) { return Text.of(campo).viewedBy(actor).asString().trim();
    }
    public static Obtener elTextoDelCampo(Target campo){
         return new Obtener(campo);
    }


}
