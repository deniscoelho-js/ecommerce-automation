package br.com.selenium.test.selenium;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScriptTest {

	@Test
	public void eightComponent() {

//		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
//		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

		WebDriver driver = new ChromeDriver();
//		WebDriver driver2 = new FirefoxDriver();

		driver.get("https://google.com");
//        driver2.get("https://google.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement searchBox = driver.findElement(By.name("q"));
		WebElement searchButtom = driver.findElement(By.name("btnK"));
		
		searchBox.sendKeys("Selenium");
		searchButtom.click();
		
		driver.quit();

	}
}
