package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubleclick {
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";

ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}

	@Test
	public void test()
	{
		
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		WebElement doubclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		Actions act=new Actions(driver);
		act.contextClick(right).perform();
		edit.click();
		driver.switchTo().alert().accept();
		act.doubleClick(doubclick).perform();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
	}

}
