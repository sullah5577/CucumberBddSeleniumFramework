package framework;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty"},
        // This creates auto method name in camelCase
        snippets = SnippetType.CAMELCASE,

        // Path to feature file
        features = {"src/test/resources/features"},

        // display the console output in a proper readble format
        monochrome = true,


        dryRun = false,
        // Specify tags to be executed
        tags = {"@acct_1"},
        // Specify step definition package name
        glue = {"stepdefinitions"}
)

public class TestRunner {


}
