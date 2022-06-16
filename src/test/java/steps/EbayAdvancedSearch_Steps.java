package steps;

import static org.junit.Assert.fail;

import actions.Common_Actions;
import actions.EbayAdvancedSearch_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearch_Steps {
	
	Common_Actions common_actions;
	EbayAdvancedSearch_Actions ebayAdvancedSearchActions;
	
	public EbayAdvancedSearch_Steps (Common_Actions common_actions, EbayAdvancedSearch_Actions ebayAdvancedSearchActions) {
		this.common_actions = common_actions;
		this.ebayAdvancedSearchActions = ebayAdvancedSearchActions;
	}
	
	@Given("I am on Ebay Adv Search Page")
	public void i_am_on_ebay_adv_search_page() throws InterruptedException {
		common_actions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
	    Thread.sleep(5000);
	}
	@When("I click on ebay logo")
	public void i_click_on_ebay_logo() throws InterruptedException {
		ebayAdvancedSearchActions.clickOnEbayLogo();
	}
	
	
	@Then("I am navigated to home page.")
	public void i_am_navigated_to_home_page() {
		String expUrl = "https://www.ebay.com/";
		if(!expUrl.equals(common_actions.getCurrentUrl())) {
			fail("Page does not navigate to home page from advanced search page after clicking ebay logo.");
		}
		//driver.quit();
	}
	
	

	@When("I advance search an item")
	public void i_advance_search_an_item(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    ebayAdvancedSearchActions.enterSearchString(dataTable.cell(1, 0));
	    ebayAdvancedSearchActions.enterExcludeString(dataTable.cell(1, 1));
	    ebayAdvancedSearchActions.enterMinValue(dataTable.cell(1, 3));
	    ebayAdvancedSearchActions.enterMaxValue(dataTable.cell(1, 4));
	    ebayAdvancedSearchActions.clickSearchBtn();
	}



	
}




