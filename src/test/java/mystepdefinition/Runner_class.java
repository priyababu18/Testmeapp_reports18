package mystepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature456",glue="mystepdefinition",plugin={"html:target/cucumber-htmlreport.html","json:target/cucmber.json"})

public class Runner_class {
	

}
