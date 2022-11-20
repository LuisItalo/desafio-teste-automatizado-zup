package runners;

import Drivers.Drivers;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/desafio_amazon.feature",
        glue = "steps",
        tags = "~@ignore",
        plugin = {"pretty", "html:target/report-cucumber.html"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        strict = false,
        dryRun = false
)
public class Runner extends Drivers {

    public static void abrirNavegador(boolean headless) {
        String ambiente = "https://www.amazon.com.br/";
//        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        if(!headless) {
            chromeOptions.addArguments("--headless");
        }
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get(ambiente);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



}
