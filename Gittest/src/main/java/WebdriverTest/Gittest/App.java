package WebdriverTest.Gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
   protected WebDriver driver; 
	@Test
	public void guru99() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/hm87585/eclipse-workspace/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String eTitle = "Meet Guru99";
		String aTitle = "";
		driver.get("http://www.guru99.com/");
		aTitle = driver.getTitle();
		if(aTitle.contentEquals(eTitle))
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("Test Failed");
			
		}
		driver.close();
		
	}
   
}
