package implementation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = { "html:target/cucumber-report.html",
                             "rerun:target/rerun.txt",
                              "me.jvt.cucumber.report.PrettyReports:target/cucumber"
                           },
                 features = "src/test/resources/features",
                 glue = "implementation/stepDefinitions",
                 dryRun = false,
                 tags = ""
)
public class CukesRunner {


}
