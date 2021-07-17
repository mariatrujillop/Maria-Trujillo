package co.com.bancolombia.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BarraDeNavegacion {

    private BarraDeNavegacion(){}

    public static final Target LNK_NEGOCIOS = Target.the("Link campo negocios").locatedBy("//*[@id='header-pymes']");
    public static final Target LNK_HERRAMIENTAS = Target.the("Link campo herramientas").locatedBy("//*[@id='menu-top']/div/div/div/ul/li[4]/a");
    public static final Target LNK_CONVERSOR = Target.the("Link campo conversor").locatedBy("//*[@id='simuladores']/div/div/div[3]/div[1]/div[2]/div/ul/li[4]/a/h3");
    public static final Target LNK_CALCULAR = Target.the("Link campo calcular").locatedBy("//*[@id='btntoolUno']/a");
    public static final Target TXT_TASA_INTERES = Target.the("Ingresar tasa interes").locatedBy("//*[@id='interes']");
    public static final Target LNK_PERIODICIDAD = Target.the("Seleccionar la periodicidad").locatedBy("//*[@id='periodicidad-deseada']/option[3]");
    public static final Target LNK_CAPITALIZACION = Target.the("Seleccionar la capitalizacion").locatedBy("//*[@id='capitalizacion']/option[2]");
    public static final Target DLG_RESULTADO = Target.the("Resultado de la conversion").locatedBy("//*[@id='respuesta']");









}
