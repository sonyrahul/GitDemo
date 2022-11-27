package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Introduction {
	WebDriver driver;
	@BeforeMethod
	public void chrome()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void getdata() {
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		System.out.println("Rahul Sony");
		System.out.println("Rahul");
		System.out.println("Rahul 123");


	}
	
	@Test
	public void google() {
		// TODO Auto-generated method stub
		
		driver.get("https://google.com");
		System.out.println("Rat mein bnaunga main roti");

	}
	@Test
	public void Newgoogle() {
		// TODO Auto-generated method stub
		
		driver.get("https://google.com");
		System.out.println("New Google");

	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
