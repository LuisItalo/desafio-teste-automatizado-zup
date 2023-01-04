package steps;

import Elementos.Elementos;
import Metodos.Metodos;
import Pages.PesquisarPage;
import cucumber.api.Scenario;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import runners.Runner;

import java.io.File;


public class PesquisaTeste{

    Elementos elementos = new Elementos();
    Metodos metodos = new Metodos();
    PesquisarPage pesqPage = new PesquisarPage();

    @Dado("^que estou no site a Amazon$")
    public void que_estou_no_site_a_Amazon() throws Throwable {
        Runner.abrirNavegador(true);
    }

    @Quando("^digitar \"([^\"]*)\"$")
    public void digitar(String arg1) throws Throwable {
        pesqPage.pesquisarPanela();

    }

    @Entao("^retorna lista de produtos$")
    public void retorna_lista_de_produtos() throws Throwable {
        String texto =  pesqPage.verificarProduto();
        Assert.assertEquals("RESULTADOS", texto);
        metodos.evidencia("Panela");
//        pesqPage.fecharBrowser();
    }

    @Entao("^adiciona no carrinho$")
    public void adicionaNoCarrinho() throws Throwable {
        pesqPage.escolherPanela();
        pesqPage.addPanela();
        metodos.evidencia("Produto Carrinho");
        pesqPage.fecharBrowser();
    }

}
