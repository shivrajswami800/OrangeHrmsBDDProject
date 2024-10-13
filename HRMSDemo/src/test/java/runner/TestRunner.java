package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					features="src/test/java/features",
					glue= {"stepdefinations"},
					plugin= {"html:target/report.html"},
					tags= ""
)

		
		
public class TestRunner extends AbstractTestNGCucumberTests {

}
