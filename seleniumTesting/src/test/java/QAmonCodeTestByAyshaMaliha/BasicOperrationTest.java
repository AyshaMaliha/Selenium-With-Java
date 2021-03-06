package QAmonCodeTestByAyshaMaliha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicOperrationTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		//Visit Url
		driver.get("https://www.demoblaze.com/index.html");
		//Capture current url
		System.out.println("current url is: "+driver.getCurrentUrl());
		//Capture Page title of url
		System.out.println("Title:"+driver.getTitle());
		//Navigate
		driver.navigate().to(" https://opensource-demo.orangehrmlive.com/");
		//5 sec waiting time
		Thread.sleep(5000);
		//Refresh page
		driver.navigate().refresh();
		//New tab
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.aftercareexplained.com/");
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.chhoto.link/");
		//Close the existing window
		driver.close();
		
		Thread.sleep(3000);
		//Close all window tab
		driver.quit();
		
	}

}
