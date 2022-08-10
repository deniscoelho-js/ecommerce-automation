package br.com.selenium.PageObject;

import org.junit.After;
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
        HomePage homePage = new HomePage(driver);
        homePage.fazerPesquisa("monitor");
    }

    @After
    public void fecharDrive(){
        driver.close();
        driver.quit();
    }
}
