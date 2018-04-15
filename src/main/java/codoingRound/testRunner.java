package codoingRound;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/feature",tags="@signin"
		,glue= {"stepDefination"}
		)

public class testRunner {

}
