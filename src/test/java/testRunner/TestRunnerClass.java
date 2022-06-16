package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//Denotes the directory where features are placed.
		features = {"features"},
		//Denotes the directory where steps are placed.
		glue = {"steps"},
		//Prints out the execution report. Support formats - HTML, JUNIT, JSON.
		//plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
		//plugin = {"pretty", "junit:ReportJUNIT"}
		plugin = {"pretty", "json:target/ReportJSON/cucumber.json"},
		//Denotes if execution happens (when false) or just a dry run (when true)
		dryRun = false,
		//Logs are cleaner when monochrome = true.
		monochrome = false,
		//Runs only the scenario having the tag value. Tag value is given in the feature file.
		tags = "@P2444"
		//Runs only the scenario containing the 'name' value in the scenario name.
		//name = "Advance"
		)
public class TestRunnerClass {
	
}
