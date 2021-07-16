package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInPage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.nexchar.com/signin");
		//button
		
		//Account login
		//Email/User
		driver.findElement(By.id("Email")).sendKeys("cinove6885@nhmty.com");
		
		//Password
		driver.findElement(By.id("Password")).sendKeys("23456");
		
		//Remember
		driver.findElement(By.id("RememberMe")).click();
		
		//signin button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
