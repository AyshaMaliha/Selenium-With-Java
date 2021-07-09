package basicPhase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingUrl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swj_AYsha\\seleniumTesting\\drivers\\chromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoblaze.com/");
		Thread.sleep(2000);
	}

}
