package com.herokuapp.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/cucumber-reports",
				"json:target/cucumber.json"
		
		},
		
		tags="@Smoke_test",
		features="src/test/resources/com/herokuapp/features", 
		glue="com.herokuapp.qa.steps"
		,dryRun = true
		)
public class SmokeTestRunner {}
