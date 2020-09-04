package com.dd.appiumtest.testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/"},
        glue = {"com/dd/appiumtest/stepDefenitions", "com/dd/appiumtest/hooks"},
//        glue = {"com/dd/appiumtest/stepDefenitions"},
//        tags = "@SignInButtonClickWithIncorrectCredentialsTest",
        plugin = {"pretty",
                "html:target/SystemTestReports/html",
                "json:target/SystemTestReports/json/report.json",
                "junit:target/SystemTestReports/junit/report.xml"}
)
public class BaseTestRunner {

}
