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
		
<<<<<<< HEAD
		
		features= {"src\\test\\resources\\feature"}, 
		glue= {"com.herokuapp.qa.steps"},
				tags= "@Runner"
		//,dryRun = true
=======
<<<<<<< HEAD
		
		features="src/test/resources/feature", 
		glue="com.herokuapp.qa.steps",
		tags="@SPA-1260",
=======
		features="src/test/resources/feature", 
		glue="com.herokuapp.qa.steps",
		tags = "@1633",
>>>>>>> 6c61b12574864a214859291a33b5074e15cf6ae3
		dryRun = false
>>>>>>> 71c4ef0954724bdf15118ab1996c8d25fb6dfaa4
		)
public class CukesRunner {}
