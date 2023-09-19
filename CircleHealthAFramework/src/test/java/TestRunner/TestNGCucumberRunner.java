package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "StepDefination", 
    dryRun = false,
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-html-reports", "json:target/cucumber.json"}
)
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
}
