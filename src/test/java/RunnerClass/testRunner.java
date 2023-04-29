package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class testRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions
            (
                    features = ".//FeatureFile/test.feature",
                    glue = "StepDefination",
                    dryRun = false,
                    monochrome = true,
                    plugin = {"pretty",
                            "html:test-output"}
            )
    public class TestRun {


    }
}
