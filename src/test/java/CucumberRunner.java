import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"}, glue = {"ru.raiffeisen"},
                plugin = {"json:target/cucumber-report.json",
                          "pretty",
                          "ru.raiffeisen.reporter.AllureReporter",
                          "rerun:rerun.txt"},
                tags = {"@web"})
public class CucumberRunner {
}

