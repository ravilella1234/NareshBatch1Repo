package testcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@SmokeTest or @Regression"),
                         plugin = {"pretty","html:target/cucumber-reports.html",
                         "json:target/cucumber-reports.json"},
                         monochrome = true
                         )
public class TestRunner 
{

}
