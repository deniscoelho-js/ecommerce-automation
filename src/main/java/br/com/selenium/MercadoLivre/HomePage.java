package br.com.selenium.MercadoLivre;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "as_word")
    private WebElement barraPesquisa;

    @FindBy(how = How.XPATH, using = "/html/body/header/div/form/button")
    private WebElement botaoPesquisa;

    public void fazerPesquisa(String textoPesquisa){
        barraPesquisa.sendKeys(textoPesquisa);
        botaoPesquisa.click();
    }

}
