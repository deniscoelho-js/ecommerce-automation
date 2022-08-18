package br.com.selenium.amzCap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AmzCapTest {
    private WebDriver driver;

    @Before
    public void criaDriver(){
        Driver amzCapDriver = new Driver();
        driver = amzCapDriver.Webdriver();
    }

    @Test
    public void buscarItem(){
        String texto = "O Verdadeiro Valor de TI";
        String excluido = "O Verdadeiro Valor de TI foi removido de Carrinho de compras.";
        HomePage homePage = new HomePage(driver);
        homePage.fazerPesquisa(texto);
        homePage.clicaNoLivro();
        homePage.adicinarAoCarrinho();
        homePage.irParaCarrinhoDeComparas();
        Assert.assertEquals(texto, homePage.VerificarSeEstaNoCarrinho());
        homePage.excluirDoCarrinho();
        Assert.assertEquals(excluido, homePage.verificarSeFoiExcluido());
    }

}
