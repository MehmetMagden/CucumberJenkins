package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@deneme",
        dryRun = true







)








public class Runner {





}
