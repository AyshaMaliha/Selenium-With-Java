package testingPhase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTwo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//visit 
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		Thread.sleep(2000);
		// click Make Appointment button
		driver.findElement(By.id("btn-make-appointment")).click();
		/*Thread.sleep(2000);
		//Fill up the username field
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		Thread.sleep(3000);
		//Fill up password field
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		// click login button
		driver.findElement(By.id("btn-login")).click();
		Thread.sleep(6000);
		//quit the browser.
		//driver.quit();*/
		
		
		
		
	}

}
