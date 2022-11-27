package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {

	@Test
	public void rahul() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		System.out.println("The pirate of mine");
		System.out.println("Aj bnega chicken curry");
		System.out.println("Rat mein bnaunga main roti");
		driver.close();

	}
	@Test
	public void google() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("The pirate of mine");
		System.out.println("Aj bnega chicken curry");
		System.out.println("Rat mein bnaunga main roti");
		driver.close();

	}

}
