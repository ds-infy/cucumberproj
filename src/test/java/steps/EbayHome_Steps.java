package steps;

import static org.junit.Assert.fail;

import actions.Common_Actions;
import actions.EbayHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {

	Common_Actions common_actions;
	EbayHome_Actions ebayHome_actions;
	
	public EbayHome_Steps(Common_Actions common_actions, EbayHome_Actions ebayHomeActions) {
		this.common_actions = common_actions;
		this.ebayHome_actions = ebayHomeActions;
	}
	
	@Given("User is on ebay home page")
	public void user_is_on_ebay_home_page() throws InterruptedException {
	    common_actions.goToUrl("https://www.ebay.com/");
	    Thread.sleep(1000);
	}

	@When("User clicks on Advance Search link")
	public void user_clicks_on_advance_search_link() {
	   ebayHome_actions.clickAdvLink();
	}

	@Then("New page should open")
	public void new_page_should_open() {
	    String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
	    String actUrl = common_actions.getCurrentUrl();
	    if(!expUrl.equals(actUrl)) {
	    	fail("Page does not navigate to Adv Search Page.");
	    }
	   //driver.quit();
	}
	
	
	@When("I search for {string}")
	public void i_search_for_iphone11(String str1) {
		ebayHome_actions.enterSearchString(str1);
		ebayHome_actions.clickSearchButton();
	}
	
	
	@Then("Search items count of {int} should be displayed")
	public void search_items_count_should_be_displayed(int count) {
	    int itemCount1 = ebayHome_actions.getCountOfItems();
	    if(itemCount1 < count) {
	    	fail("The item count is less than " + count);
	    }
	}
	
	@When("I search for {string} in {string} category")
	public void i_search_for_in_category(String string, String string2) throws InterruptedException {
		ebayHome_actions.enterSearchString(string);
	    ebayHome_actions.selectCatgFromCatgList(string2);
	    ebayHome_actions.clickSearchButton();
	    Thread.sleep(1000);
	}

	@When("I click on {string}")
	public void i_click_on(String string) throws InterruptedException {
	    common_actions.clickByLinkName(string);
		Thread.sleep(1000);
	}
	@Then("Validate that page navigates to {string} and title contains {string}")
	public void validate_that_page_navigates_to_and_title_contains(String string, String string2) {
	    
	    if(!common_actions.getCurrentUrl().equals(string)) {
	    	fail("Page is not navigating to correct url");
	    }
	    
	    if(!common_actions.getCurrentPageTitle().contains(string2)) {
	    	fail("Page title does not contain : '" + string2+ "'");
	    }
	    
	}




	
}
