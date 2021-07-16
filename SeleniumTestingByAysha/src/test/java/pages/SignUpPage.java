package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nexchar.com/signup");
		
		//Account
		//Customer Name
		/*driver.findElement(By.id("Name")).sendKeys("Jenifer Anna");
		//Business Type
		Select dd = new Select(driver.findElement(By.id("CategoryId")));
		dd.selectByVisibleText("Sporting & Outdoor");
		//Email
		driver.findElement(By.id("Email")).sendKeys("cinove6885@nhmty.com");
		//Password
		driver.findElement(By.id("Password")).sendKeys("23456");
		//Show Password
		//driver.findElement(By.linkText("Show password"));
		
		//Receive Notifications
		driver.findElement(By.id("NotReceiveNewsLetter")).click();
		
		//Create new account button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		
		//Back to SignUp Page
		driver.navigate().back();*/
		
		//Terms of Use
		driver.findElement(By.partialLinkText("Term of")).click();
		
		//
		
		
	}

}
