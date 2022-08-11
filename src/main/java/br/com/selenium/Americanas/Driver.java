package br.com.selenium.Americanas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    public WebDriver WebDriver(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mercadolivre.com.br/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}
