package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogintest {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void fblogin()
	{
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcd");
		driver.findElement(By.name("login")).click();
		String expurl="https://www.facebook.com/profile";
		String actualurl=driver.getCurrentUrl();
		if(expurl.equals(actualurl))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("invalid login");
		}
		
	}

}
