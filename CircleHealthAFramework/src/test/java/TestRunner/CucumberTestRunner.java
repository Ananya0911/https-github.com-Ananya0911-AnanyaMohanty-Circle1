package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "StepDefination",
    plugin = {"pretty", "html:target/cucumber-html-reports", "json:target/cucumber.json"}
)


public class CucumberTestRunner {

}
