package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {

	public static void main(String[] args) {
		
		//chromedriver
		//firefoxdriver
		//edgedriver
		
		ChromeDriver driver=new ChromeDriver(); //open browser
		driver.get("http://www.google.com"); //url loading
		driver.quit();
		
		//quit() -quit entire browser
		//close() -close current tab

	}

}
