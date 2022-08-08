package br.com.selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

public static void main(String[] args) {
	WebDriver driver = null;
	
	driver = new ChromeDriver();
	
	driver.get("https://google.com");
}
}
