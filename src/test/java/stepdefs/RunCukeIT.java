package stepdefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "summary", "json:target/cucumber-json.json",
		"tech.grasshopper.AllureCucumberMappingPlugin:target/cucumber-allure.json" }/* , tags = "@city" */)
public class RunCukeIT extends AbstractTestNGCucumberTests {

}