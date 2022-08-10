package br.com.selenium.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {
    public WebDriver WebDriver(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.casasbahia.com.br/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}
