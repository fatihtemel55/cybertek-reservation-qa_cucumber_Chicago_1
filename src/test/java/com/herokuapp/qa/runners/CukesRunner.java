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
		
		
		features="src/test/resources/feature", 
		glue="com.herokuapp.qa.steps"
		,dryRun = true,
		tags="@test"
		)
public class CukesRunner {}
