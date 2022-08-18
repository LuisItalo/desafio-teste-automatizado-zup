package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Pesquisa_steps {

    private WebDriver driver;
    public Scenario cenario;

    @Dado("^que estou no site a Amazon$")
    public void que_estou_no_site_a_Amazon() throws Throwable {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.br/");
    }

    @Quando("^digitar \"([^\"]*)\"$")
    public void digitar(String arg1) throws Throwable {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(arg1);
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

    }

    @Entao("^retorna lista de produtos com acento$")
    public void retorna_lista_de_produtos_com_acento() throws Throwable {
        String texto = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/div[1]/h1[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).getText();
        Assert.assertEquals("1-48 de mais de 1.000 resultados para", texto);
    }

    @Entao("^retorna lista de produtos sem acento$")
    public void retorna_lista_de_produtos_sem_acento() throws Throwable {
        String texto = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/div[1]/h1[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).getText();
        Assert.assertEquals("1-48 de mais de 1.000 resultados para", texto);
    }

        @After(order = 1)
    public void screeshot(Scenario cenario) {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("target/screenshots/"+cenario.getId()+".jpg"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @After(order = 0)
    public void fecharBrowser(){
        driver.quit();
    }
}
