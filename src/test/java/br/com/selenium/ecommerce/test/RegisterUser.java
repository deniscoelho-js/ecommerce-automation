package br.com.selenium.ecommerce.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUser {
	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationexercise.com/");

		String title = driver.getCurrentUrl();

		System.out.println(title);
		
		WebElement signBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a/i"));
		signBtn.click();
		driver.quit();
	}
}
