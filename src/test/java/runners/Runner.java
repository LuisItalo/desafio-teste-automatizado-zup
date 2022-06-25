package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/desafio_amazon.feature",
        glue = "steps",
        tags = "~@ignore",
        plugin = "pretty",
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        strict = false,
        dryRun = false
)
public class Runner {
}
