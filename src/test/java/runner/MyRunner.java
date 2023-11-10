package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/resources/features" }, glue = "stepdefinitions")

public class MyRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider
	public Object[][] scenarios() {

		return super.scenarios();
	}
}
