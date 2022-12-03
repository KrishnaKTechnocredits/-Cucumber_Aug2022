package runner;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\test\\java\\featureFiles\\",
		glue = "steps",
		tags = "@ui",
		publish = true,
		dryRun = false,
		plugin = {
				"rerun:target/failedScenario.txt",
				"html:target/index.html",
				"json:target/cucumber.json"
		}
)

//@ExtendedCucumberOptions(
//		retryCount = 2,
//		toPDF = true
//)
public class Runner {

}
