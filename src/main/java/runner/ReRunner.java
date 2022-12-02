package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target//failedScenario.txt",
		glue = "steps",
//		tags = "@3",
		publish = true,
		dryRun = false,
		plugin = {"html:target/index.html","json:target/cucumber.json"}
)

//@ExtendedCucumberOptions(
//		retryCount = 2,
//		toPDF = true
//)
public class ReRunner {

}
