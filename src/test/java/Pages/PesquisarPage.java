package Pages;

import Drivers.Drivers;
import Elementos.Elementos;
import Metodos.Metodos;
import org.junit.Assert;
import org.openqa.selenium.By;

public class PesquisarPage extends Drivers {

    Metodos metodos = new Metodos();
    Elementos el = new Elementos();

    public void pesquisarPanela(){
        metodos.escrever(el.caixaPesquisa, "panela de pressao" );
        metodos.clicar(el.pesquisar);
    }

    public String verificarComAcento(){
        return driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/span/div/div/span")).getText();
    }

    public void fecharBrowser(){
        driver.quit();
    }
}
