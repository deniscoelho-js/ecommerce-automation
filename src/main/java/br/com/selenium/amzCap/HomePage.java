package br.com.selenium.amzCap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement barraPesquisa;

    @FindBy(how = How.ID, using = "nav-search-submit-button")
    private WebElement botaoPesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[2]/div[1]/h2/a/span")
    private WebElement livro;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add-to-cart-button\"]")
    private WebElement adiciona;

    @FindBy(how = How.XPATH, using = "//span[@class='a-truncate-cut'][contains(.,'O Verdadeiro Valor de TI')]")
    private WebElement adicionadoAoCarrinho;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sw-gtc\"]/span/a")
    private WebElement irParaCarrinho;

    @FindBy(how = How.XPATH, using = "//input[@value='Excluir']")
    private WebElement exclui;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'O Verdadeiro Valor de TI  Abre em uma nova aba  foi removido de Carrinho de compras.')]")
    private WebElement elementoExcluido;

    public void fazerPesquisa(String textoPesquisa){
        barraPesquisa.sendKeys(textoPesquisa);
        botaoPesquisar.click();
    }

    public void clicaNoLivro(){
        livro.click();
    }

    public void adicinarAoCarrinho(){
        adiciona.click();
    }

    public void irParaCarrinhoDeComparas(){
        irParaCarrinho.click();
    }

    public String VerificarSeEstaNoCarrinho(){
        System.out.println(adicionadoAoCarrinho.getText());
        return adicionadoAoCarrinho.getText();
    }

    public void excluirDoCarrinho(){
        exclui.click();
    }

    public String verificarSeFoiExcluido(){
        System.out.println(elementoExcluido.getText());
        return elementoExcluido.getText();
    }

}
