
package loadtesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverTest {
	
	@Test
	public void testcase1() {
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://hosting.invers.com/aimex/");
		driver.findElementById("ctl00_cph_LoginView1_LoginControl_Login1_UserName").sendKeys("Hello");
		driver.findElementById("ctl00_cph_LoginView1_LoginControl_Login1_Password").sendKeys("Hellop");
		driver.quit();
		
	}

}