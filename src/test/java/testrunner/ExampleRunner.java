package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features\\Example.feature",
		glue ="stepdefintions",
		plugin = {"pretty","json:target/JsonReports/report.json"}
		//monochrome = ture,
		//dry run =true,
		//tags= @smoke and @sanity
		)

public class ExampleRunner {

}
