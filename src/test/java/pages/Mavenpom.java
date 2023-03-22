package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mavenpom {

	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}    
	
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test()
	{
		String s=driver.getTitle();
		System.out.println(s);
	}
}
