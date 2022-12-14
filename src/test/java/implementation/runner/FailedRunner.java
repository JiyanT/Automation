package implementation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-report.html",
        "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReport:target/cucumber"
},
        features = "@target/rerun.txt",
        glue = "implementation/stepDefinitions"
)

public class FailedRunner {


}
