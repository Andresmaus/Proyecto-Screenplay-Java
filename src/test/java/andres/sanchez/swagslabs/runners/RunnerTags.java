package andres.sanchez.swagslabs.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/sawgs_labs.feature",
        tags = "@HistoriaUsuario",
        glue = "andres.sanchez.swagslabs.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}

