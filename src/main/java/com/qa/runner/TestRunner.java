package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;






@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/com/qa/features/", 
		glue ={"com/qa/stepDefinitions"},
		dryRun = true,
		tags = "~@tag1",
	    plugin = { "pretty", "html:target/cucumber-reports" },
		monochrome = true
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
