package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/Features/LoginEx.feature",
		glue = "stepdefintions",
		plugin = {"pretty","json:target/JsonReport/report.json"},
//		dryRun = true,
		monochrome = true
		
		)



public class LoginTestRunner {

}
