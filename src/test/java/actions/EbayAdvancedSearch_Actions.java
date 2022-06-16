package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayAdvancedSearch_Elements;
import steps.Common_Steps;

public class EbayAdvancedSearch_Actions {
	
	private WebDriver driver;
	EbayAdvancedSearch_Elements ebayAdvancedSearch_elements;
	
	public EbayAdvancedSearch_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		ebayAdvancedSearch_elements = new EbayAdvancedSearch_Elements(driver);
	}
	
	public void clickOnEbayLogo() {
		ebayAdvancedSearch_elements.ebayLogo.click();
	}
	
	public void enterSearchString(String string) {
		ebayAdvancedSearch_elements.searchString.sendKeys(string);
	}
	
	public void enterExcludeString(String string) {
		ebayAdvancedSearch_elements.excludeString.sendKeys(string);
	}
	
	public void enterMinValue(String string) {
		ebayAdvancedSearch_elements.minPrice.sendKeys(string);
	}
	
	public void enterMaxValue(String string) {
		ebayAdvancedSearch_elements.maxPrice.sendKeys(string);
	}
	
	public void clickSearchBtn() {
		ebayAdvancedSearch_elements.searchButton.click();
	}
	
}
