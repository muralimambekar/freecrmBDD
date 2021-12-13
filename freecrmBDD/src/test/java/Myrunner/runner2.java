package Myrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources/features",
		glue={"Stepdefinition"},
		plugin= {"pretty","html:test-output.htlm","junit:test.xml"},
		monochrome=true,
		dryRun= false	
		)


public class Loginrnner {

}
