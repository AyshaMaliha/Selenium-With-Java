package basicPhase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicOperations {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//1. capture the title of the webpage
		//System.out.println(driver.getTitle());
		
		// 2. capture the current url
//		System.out.println("current url is: "+driver.getCurrentUrl());
//		
//		//3. capture page source code
//		System.out.println("Page source code is: "+driver.getPageSource());
		
		//4. window maximize
		driver.manage().window().maximize();
		
		// 5. window full screen
//		driver.manage().window().fullscreen();
//		
//		// 7. Delay for 5 sec 
//		Thread.sleep(5000);
//		
//		// 6. window minimize
//		driver.manage().window().minimize();

		// 8. Navigate to another URL
		
//		// 9.  Navigate to another website
//		driver.navigate().to("http://sheradambd.com/home");
//		
//		// 10. Navigate back to nexchar website
//		driver.navigate().back();
//		
//		// 11. Navigate forward to sheradam bd website
//		driver.navigate().forward();
//		
//		// wait for 4 sec
//		Thread.sleep(4000);
//		
//		// 12. Refresh the page
//		driver.navigate().refresh();
		
		// 13. open the new tab
		//driver.switchTo().newWindow(WindowType.TAB).get("http://sheradambd.com/home");;
		
		//driver.switchTo().newWindow(WindowType.TAB).get("http://sheradambd.com/home");
		// 14. visit a URL in the new Tab
		//driver.get("http://sheradambd.com/home");
		
		// 15. CLose the current tab
		//driver.close();
		
	//	Thread.sleep(3000);
		
		// 16. Close the browser
		
		//driver.quit();
		
		// 17. Dimension the window using setSize function
		//Dimension d= new Dimension(450,500);
		//driver.manage().window().setSize(d);

		
		
		
		
	}

}
