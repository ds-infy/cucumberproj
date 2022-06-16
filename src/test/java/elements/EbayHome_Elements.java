package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome_Elements {
	
	@FindBy(linkText = "Advanced") public WebElement advSearchLink;
	@FindBy(xpath = "//input[@id='gh-ac']") public WebElement srchBox;
	@FindBy(xpath = "//input[@id='gh-btn']") public WebElement srchBtn;
	@FindBy(xpath = "//select[@id='gh-cat']/option") public List<WebElement> catgList;
	@FindBy(css = "h1.srp-controls__count-heading>span.BOLD:first-child") public WebElement numOfItems;
	//@FindBy(xpath = "//select[@id='gh-cat']/option") public WebElement catOptions;
	//@FindBy(xpath = "") public WebElement ;
	//@FindBy(xpath = "") public WebElement ;
	//@FindBy(xpath = "") public WebElement ;
	
	public EbayHome_Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
