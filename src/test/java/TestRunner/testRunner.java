package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//"pretty","html:target/cucumber-reports"}

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-reports"},
glue= {"StepDefinition"},
features= {"src/test/java/features"}

)

public class testRunner {




}
