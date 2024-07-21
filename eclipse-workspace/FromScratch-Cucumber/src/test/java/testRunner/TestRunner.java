package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\customers.feature" , glue= {"stepDefinition"},
monochrome= true, 
dryRun=true,
plugin={"pretty","html:target/Reports/htmlReports.html"},
tags="@SmokeTest")


public class TestRunner {


		
		

	}


