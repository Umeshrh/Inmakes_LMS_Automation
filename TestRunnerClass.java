package org.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition" , monochrome = true , dryRun = false , plugin = {"html:Report" , "junit:Report\\junitreport.xml" , "json:Report\\jsonreport.json"})
public class TestRunnerClass {

}
