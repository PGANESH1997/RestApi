package testRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/java/feature",
		glue="stepdefination")
public class TestRunner {

	
	
}
