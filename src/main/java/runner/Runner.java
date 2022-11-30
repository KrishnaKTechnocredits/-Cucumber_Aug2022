package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\test\\java\\featureFiles\\",
		glue = "steps",
		tags = "@1",
		publish = true
)
public class Runner {

}
