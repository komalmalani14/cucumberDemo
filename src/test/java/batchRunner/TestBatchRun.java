package batchRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="cucumberfile.feature",glue="cucumberstepdef",
tags= {"@Regression2"},plugin="json:target/cucumber-report.json")
public class TestBatchRun {

}
