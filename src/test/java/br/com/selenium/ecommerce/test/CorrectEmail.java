package br.com.selenium.ecommerce.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CorrectEmail {
	@Test
	public void correct() {
		WebDriver driver = new ChromeDriver();

		// *******************************************************************************************
		// 1 e 2
		driver.get("http://automationexercise.com");

		// *******************************************************************************************
		// 3
		String title = driver.getCurrentUrl();
		System.out.println(title);

		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		
		Boolean loginIsVisible = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).isDisplayed();
		System.out.println("Login is visible: " + loginIsVisible);
		
		
//		parei no item 6

	}

}
