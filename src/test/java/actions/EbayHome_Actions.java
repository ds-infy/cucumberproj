package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.EbayHome_Elements;
import steps.Common_Steps;

public class EbayHome_Actions {

	private WebDriver driver;
	EbayHome_Elements eBayHome_elements;
	
	public EbayHome_Actions(Common_Steps cs) {
		this.driver = cs.getDriver();
		eBayHome_elements = new EbayHome_Elements(driver);
	}
	
	public void clickAdvLink() {
		eBayHome_elements.advSearchLink.click();
	}
	
	public void enterSearchString(String srchStr) {
		eBayHome_elements.srchBox.sendKeys(srchStr);
	}
	
	public void clickSearchButton() {
		eBayHome_elements.srchBtn.click();
	}
	
	public void selectCatgFromCatgList(String catg) {
		for(WebElement e: eBayHome_elements.catgList) {
			if(e.getText().trim().toLowerCase().equals(catg.toLowerCase())) {
				e.click();
				break;
			}
		}
	}
	
	public int getCountOfItems() {
		return Integer.parseInt(eBayHome_elements.numOfItems.getText().trim().replace(",", "").replace("+", ""));
	}
	
	public void clickByLink(String str) {
		
	}
}
