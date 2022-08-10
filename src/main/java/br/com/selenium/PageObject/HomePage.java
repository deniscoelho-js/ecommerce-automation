package br.com.selenium.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(how = How.CSS, using = "#EncontreUmaLoja")
    private WebElement encontreUmaLoja;

    @FindBy(how = How.CSS, using = "#Duvidas")
    private WebElement duvidas;

    @FindBy(how = How.ID, using = "strBusca")
    private WebElement barraPesquisa;

    @FindBy(how = How.ID, using = "btnOK")
    private WebElement botaoPesquisar;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void acessarEncontreUmaLoja(){
        encontreUmaLoja.click();
    }

    public void acessarDuvidas(){
        duvidas.click();
    }

    public void fazerPesquisa(String termoBusca){
        termoBusca = termoBusca.toLowerCase();

        barraPesquisa.sendKeys(termoBusca);
        botaoPesquisar.click();
    }
}
