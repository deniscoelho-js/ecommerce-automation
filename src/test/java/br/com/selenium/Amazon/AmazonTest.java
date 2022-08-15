package br.com.selenium.Amazon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AmazonTest {
    private WebDriver driver;

    @Before
    public void criarDriver(){
        Driver amzdriver = new Driver();
        driver = amzdriver.Webdriver();
    }

    @Test
    public void verifyTitle(){
        String expectedTitle = "Amazon.com.br | Tudo pra você, de A a Z.";

        AmazonPage amazonPage = new AmazonPage(driver);
        Assert.assertEquals(amazonPage.verifyTitleOfThePage(), expectedTitle);
    }

    @Test
    public void searchProduct(){
        String productItem = "Apple Watch";
        String category = "Eletrônicos";

        AmazonPage amazonPage = new AmazonPage(driver);
        amazonPage.searchProduct(productItem, category);
    }
}
