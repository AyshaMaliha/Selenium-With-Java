package QAmonCodeTestByAyshaMaliha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Execution_Test {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//visit url
		driver.get(" https://www.nexchar.com/signup");
		//Customer name
		driver.findElement(By.id("Name")).sendKeys("Jenifer");
		//Business Type
		Select drop=new Select(driver.findElement(By.id("CategoryId")));
		drop.selectByVisibleText("Gift Shop");
		//Email
		driver.findElement(By.id("Email")).sendKeys("jennypureheart96@gmail.com");
		//Password
		driver.findElement(By.id("Password")).sendKeys("23456");
		//Receive Notifications
		driver.findElement(By.id("NotReceiveNewsLetter")).click();
		
		//Create account
		driver.findElement(By.cssSelector("button[type='submit'")).click();
		
	}

}
