package br.com.selenium.MercadoLivre;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MercadoLivreTest {
    private WebDriver driver;

    @Before
    public void criarDriver(){
        Driver wdriver = new Driver();
        driver = wdriver.WebDriver();
    }

    @Test
    public void fazerPesquisa(){
        String textoBusca = "monitor";

        HomePage homePage = new HomePage(driver);
        homePage.fazerPesquisa(textoBusca);
    }
}
