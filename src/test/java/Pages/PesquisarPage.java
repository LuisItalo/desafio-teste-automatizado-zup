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

    public String verificarProduto(){
        return driver.findElement(By.cssSelector("span[class=\"a-size-medium-plus a-color-base a-text-bold\"]")).getText();
    }

    public void escolherPanela() {
        metodos.clicarPanela(el.panela);
    }

    public void addPanela(){
        metodos.addCarrinho(el.adicionarCarrinho);
    }

    public void fecharBrowser(){
        driver.quit();
    }
}
