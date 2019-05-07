package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
glue= {"StepDefinition"},
features= {"src/test/java/features"}

)

public class testRunner {




}
