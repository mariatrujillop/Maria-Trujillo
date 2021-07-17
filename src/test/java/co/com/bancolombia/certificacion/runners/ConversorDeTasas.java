package co.com.bancolombia.certificacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co.com.bancolombia.certificacion.stepdefinitions", "co.com.bancolombia.certificacion.setup"},
        features = "src/test/java/co/com/bancolombia/certificacion/features/conversor_de_tasas.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false


)
public class ConversorDeTasas {
}
