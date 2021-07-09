package QAmonCodeTestByAyshaMaliha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage_Object_Locator {
	
		
		private static WebElement locator=null;
		//Username 
		public static WebElement username (WebDriver driver)
		{
			locator=driver.findElement(By.id("Email"));
			return locator;
		}
		
		//Password
		public static WebElement password (WebDriver driver)
		{
			locator=driver.findElement(By.id("Password"));
			return locator;
		}
		
		//Remember Me
		public static WebElement rememberme (WebDriver driver)
		{
			locator=driver.findElement(By.id("IsRemember"));
			return locator;
		}
		
		public static WebElement signinbtn (WebDriver driver)
		{
			locator=driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
			return locator;
		}
		
		
}


