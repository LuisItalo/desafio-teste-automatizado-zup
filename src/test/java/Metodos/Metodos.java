package Metodos;

import Drivers.Drivers;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Metodos extends Drivers {

    public void escrever(By elemento, String texto){
        driver.findElement(elemento).sendKeys(texto);
    }

    public void clicar(By elemento){
        driver.findElement(elemento).click();
    }

    public void clicarPanela(By elemento) {
        driver.findElement(elemento).click();
    }

    public void addCarrinho(By elemento){
        driver.findElement(elemento).click();
    }

    public void aguardarElemento(By elemento){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }


//    public void screeshot(String nome) {
//        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(file, new File("target/screenshots/" +nome+ ".jpg"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public void evidencia(String nomeEvidencia){
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File srcFile = scrShot.getScreenshotAs((OutputType.FILE));
        File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void fecharBrowser(){
        driver.quit();
    }
}
