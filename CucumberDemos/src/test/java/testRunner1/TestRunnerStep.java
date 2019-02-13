package testRunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\srivastava.shivangi\\eclipse-workspace\\CucumberDemos\\src\\test\\java",glue= {"stepDefinitions1"},plugin= {"pretty","json:target/cucumber-reports/Cucumber.json"})



public class TestRunnerClass {

}
