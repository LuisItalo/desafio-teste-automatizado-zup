package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class steps {

    private WebDriver driver;
    public Scenario cenario;


    @Dado("^que acesso o site Amazon$")
    public void que_acesso_o_site_Amazon() throws Throwable {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.br/");
        //driver.manage().window().maximize();


    }

    @Quando("^escolher por \"([^\"]*)\"$")
    public void escolher_por(String arg1) throws Throwable {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(arg1);
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Panela de Pressão, Vancouver, Vermelha, 6L, Tramon')]")).click();
        String texto = driver.findElement(By.xpath("//span[contains(text(),'Panela de Pressão, Vancouver, Vermelha, 6L, Tramon')]")).getText();
        Assert.assertEquals("Panela de Pressão, Vancouver, Vermelha, 6L, Tramontina", texto);
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    }

    @Entao("^adiciona no carrinho$")
    public void adiciona_no_carrinho() throws Throwable {
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();

    }
    @Quando("^digito por \"([^\"]*)\"$")
    public void digito_por(String arg1) throws Throwable {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(arg1);
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

    }

    @Entao("^retorna erro$")
    public void retorna_erro() throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(),'Paçoquinha Tablete Yoki 1,1kg')]")).click();
        String texto = driver.findElement(By.cssSelector("#productTitle")).getText();
        Assert.assertEquals("Paçoquinha Tablete Yoki 1,1kg", texto);

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
