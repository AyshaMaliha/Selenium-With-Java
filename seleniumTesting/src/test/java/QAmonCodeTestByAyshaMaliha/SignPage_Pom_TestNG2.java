package QAmonCodeTestByAyshaMaliha;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import QAmonCodeTestByAyshaMaliha.SignInPage_Object_Locator;

public class SignPage_Pom_TestNG2 {
	
	private static WebDriver driver=null;
	@BeforeTest
	public void setUpTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.acquireangel.com/signin");
		//driver.findElement(By.id("Email")).sendKeys("123");
		
	}
	@BeforeTest
	public void setUpTest2()
	{
     driver.get("https://www.acquireangel.com/signin");
		
		//Username Test Action
		
		
		SignInPage_Object_Locator.username(driver).sendKeys("hamidsaymon9@gmail.com");		
		//Password Test Action
		SignInPage_Object_Locator.password(driver).sendKeys("Abc12345");
		
		//Remember me Test Action
		SignInPage_Object_Locator.rememberme(driver).click();
		
		//Sign in button Test Action
		SignInPage_Object_Locator.signinbtn(driver).click();
  }
	@BeforeTest
	public void setUpTest3()
	{
		driver.close();
	}
}

	
		
		
		
		
		
		



