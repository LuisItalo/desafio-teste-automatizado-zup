package Metodos;

import Drivers.Drivers;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Metodos extends Drivers {

    public void escrever(By elemento, String texto){
        driver.findElement(elemento).sendKeys(texto);
    }

    public void clicar(By elemento){
        driver.findElement(elemento).click();
    }


    public void screeshot(String nome) {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("target/screenshots/" +nome+ ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fecharBrowser(){
        driver.quit();
    }
}
