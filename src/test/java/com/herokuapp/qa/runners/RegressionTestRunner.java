package com.herokuapp.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class RegressionTestRunner {

	@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = {
					"pretty",
					"html:target/cucumber-reports",
					"json:target/cucumber.json"
			
			},
			
			tags="@Regression_test",
			features="src/test/resources/com/herokuapp/features", 
			glue="com.herokuapp.qa.steps"
			,dryRun = true
			)
	public class SmokeTestRunner {}

}
