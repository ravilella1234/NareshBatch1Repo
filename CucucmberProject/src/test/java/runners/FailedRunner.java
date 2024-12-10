package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"@target/failedrerun.txt"},
		glue = {"steps","hooks"},
		plugin = {"pretty",
				  "html:target/cucumber-reports.html",
				  "rerun:target/failedrerun.txt"
				 },
		publish = true
    )

public class FailedRunner extends AbstractTestNGCucumberTests
{
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
