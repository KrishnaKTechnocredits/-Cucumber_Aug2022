package runner;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\test\\java\\featureFiles\\",
		glue = "steps",
		tags = "@3",
		publish = true,
		dryRun = false
)

@ExtendedCucumberOptions(
		retryCount = 2,
		toPDF = true
)
public class Runner {

}
