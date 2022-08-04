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

		// *******************************************************************************************
		// 1 e 2
		driver.get("http://automationexercise.com/");

		// *******************************************************************************************
		// 3
		String title = driver.getCurrentUrl();
		System.out.println(title);

		// *******************************************************************************************
		// 4
		WebElement signBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a/i"));
		signBtn.click();

		// *******************************************************************************************
		// 5
		Boolean newUserSignupIsVisible = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2"))
				.isDisplayed();
		System.out.println("new User Signup Is Visible: " + newUserSignupIsVisible);

		// *******************************************************************************************
		// 6 e 7
		WebElement nameField = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		WebElement emailField = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		nameField.sendKeys("Maria");
		emailField.sendKeys("maria3@email.com");
		signup.click();

		// *******************************************************************************************
		// 8
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

		WebElement newsletter = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
		newsletter.click();
		WebElement specialOffers = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
		specialOffers.click();

		// *******************************************************************************************
		// 12
		WebElement firstNameAdress = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		WebElement lastNameAdress = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		WebElement company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
		WebElement adress1 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		WebElement adress2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
		Select country = new Select(driver.findElement(By.name("country")));
		WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		WebElement mobileNumber = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
		firstNameAdress.sendKeys("Maria");
		lastNameAdress.sendKeys("Joaquina");
		company.sendKeys("Capgemini");
		adress1.sendKeys("st 1211,");
		adress2.sendKeys("complemento altos");
		country.selectByVisibleText("Canada");
		state.sendKeys("Alberta");
		city.sendKeys("Vitoria");
		zipcode.sendKeys("9281829827");
		mobileNumber.sendKeys("8383939838");

		// *******************************************************************************************
		// 13
		WebElement createAccount = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div/div/div/form/button"));
		createAccount.click();

		// *******************************************************************************************
		// 14
		Boolean accountCreatedIsVisible = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"))
				.isDisplayed();
		System.out.println("Account created is visible: " + accountCreatedIsVisible);

		// *******************************************************************************************
		// 15
		WebElement continueBtn = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
		continueBtn.click();

		// *******************************************************************************************
		// 16
		Boolean userNameLogged = driver
				.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b")).isDisplayed();
		System.out.println("User name visible: " + userNameLogged);

		// *******************************************************************************************
		// 17
		WebElement deleteAccount = driver
				.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
		deleteAccount.click();

//		driver.quit();
//		System.out.println("Script executado com sucesso!");
	}
}
