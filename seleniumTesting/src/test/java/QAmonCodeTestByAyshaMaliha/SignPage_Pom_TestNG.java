package QAmonCodeTestByAyshaMaliha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import QAmonCodeTestByAyshaMaliha.SignInPage_Object_Locator;

public class SignPage_Pom_TestNG {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
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

}
