package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_Steps {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
		driver=new ChromeDriver();
		System.out.println("Global Before Hook called. WebDriver created.");
	}
	
	//After hook in the first place means it will be called last out of all 'After' hooks.
	@After public void tearDown(Scenario scenario) throws InterruptedException {
		if(scenario.isFailed()) {
			//Take screenshot
			final byte[] scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr, "image/png", scenario.getName());
		}
		driver.quit();
		Thread.sleep(1000);
		System.out.println("Global After Hook called. Browser closed.");
		//Adding one comment for 2nd commit.
	}
	
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
}
