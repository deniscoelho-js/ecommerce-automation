package br.com.selenium.PageObject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class PageObjectTest {
    private WebDriver driver;

    @Before
    public void criarDriver(){
        Driver wdriver = new Driver();
        driver = wdriver.WebDriver();
    }

    @Test
    public void fazerPesquisa(){
//        String termoBusca = "monitor";

        HomePage homePage = new HomePage(driver);
        homePage.fazerPesquisa("monitor");

//        SearchPage searchPage = new SearchPage(driver);
//        boolean result =  searchPage.verificarResultadoValido(termoBusca);
//        Assert.assertTrue(result);
    }

//    @After
//    public void fecharDrive(){
//        driver.close();
//        driver.quit();
//    }
}
