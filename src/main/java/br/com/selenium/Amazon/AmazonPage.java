package br.com.selenium.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPage {
    private WebDriver driver;

    public AmazonPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String verifyTitleOfThePage(){
        String actualTitle;

        actualTitle = driver.getTitle();
        return actualTitle;
    }

    public void searchProduct(String productItem, String category){
        WebElement selDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select selCategory = new Select(selDropDown);
        selCategory.selectByVisibleText(category);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productItem);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
