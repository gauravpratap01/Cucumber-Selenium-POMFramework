package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "./src/test/resources/appFeatures/AccountsPage.feature" }, 
					glue = { "stepDefinitions","AppHooks" }, 
					plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				      			"json:target/json-report/cucumber.json" }, 
					monochrome = true)
public class MyTestRunner {

}
