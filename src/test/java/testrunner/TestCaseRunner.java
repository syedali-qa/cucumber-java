package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/testcases.feature",
		glue="stepdefintions",
		plugin = {"pretty","html:target/HtmlReports2/report.html"},
		dryRun = false,
		monochrome=true
		
		)



public class TestCaseRunner {

}
