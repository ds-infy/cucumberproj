package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import steps.Common_Steps;

public class Common_Actions {
	
	private WebDriver driver;
	Common_Steps common_steps;
	
	public Common_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
	}
	
	public void goToUrl(String str) {
		driver.get(str);
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}
	
	public void quitWebDriver() {
		driver.quit();
	}
	
	public void clickByLinkName(String str) {
		driver.findElement(By.linkText(str)).click();
	}
	
	
}
