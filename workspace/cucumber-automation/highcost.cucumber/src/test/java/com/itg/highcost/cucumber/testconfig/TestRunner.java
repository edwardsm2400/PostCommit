package com.itg.highcost.cucumber.testconfig;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber"},
		features = "User-Stories",
		glue = "com.itg.highcost.cucumber.testDefinition",
		tags = "@positive, @negative"
		)
public class TestRunner {
}