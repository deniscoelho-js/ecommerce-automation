package br.com.selenium.ecommerce.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {
	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();
		//*******************************************************************************************
		driver.get("http://automationexercise.com/");
		//*******************************************************************************************
		String title = driver.getCurrentUrl();
		System.out.println(title);

		WebElement signBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a/i"));
		signBtn.click();

		Boolean newUserSignupIsVisible = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2"))
				.isDisplayed();
		System.out.println("new User Signup Is Visible: " + newUserSignupIsVisible);

		WebElement nameField = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		WebElement emailField = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		nameField.sendKeys("Maria");
		emailField.sendKeys("maria@email.com");
		signup.click();

		Boolean enterAccountInformarionsIsVisible = driver
				.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div/div/div/h2/b")).isDisplayed();
		System.out.println("enter account information Is Visible: " + enterAccountInformarionsIsVisible);

		WebElement titleRadio = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		titleRadio.click();
		WebElement passwordFieldAccount = driver.findElement(By.xpath("//*[@id=\"password\"]"));

		Select day = new Select(driver.findElement(By.name("days")));
		Select month = new Select(driver.findElement(By.name("months")));
		Select year = new Select(driver.findElement(By.name("years")));
		passwordFieldAccount.sendKeys("12345678");
		day.selectByVisibleText("6");
		month.selectByVisibleText("May");
		year.selectByVisibleText("1988");

		WebElement newsletter = driver.findElement(By.id("newsletter"));
		newsletter.click();
		WebElement specialOffers = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
		specialOffers.click();

//		parei no item 12

//		driver.quit();
//		System.out.println("Script executado com sucesso!");
	}
}
