package com.herokuapp.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(plugin = { "pretty", 
			"html:target/cucumber-reports", 
			"json:target/cucumber.json"

	},

			tags = "@DB", 
			features = "src/test/resources/JDBCTest", 
			glue = "com.herokuapp.qa.tests", 
			dryRun = false
			)
	
	public class DBRunner  {
	

}
