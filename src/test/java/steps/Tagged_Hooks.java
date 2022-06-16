package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_Hooks {
	
	private WebDriver driver;
	
	public Tagged_Hooks(Common_Steps cs) {
		this.driver = cs.getDriver();
	}
	
	@Before (value = "@LocalHook", order=1)
	public void localHookMethod() {
		System.out.println("Local Before hook method called.");
	}
	
	
	//After hook in the last means it will be called first out of all 'After' hooks.
	@After (value = "@LocalHook", order = 1)
	public void localAfterHookMethod() {
		System.out.println("Local After hook method called.");
	}
}
