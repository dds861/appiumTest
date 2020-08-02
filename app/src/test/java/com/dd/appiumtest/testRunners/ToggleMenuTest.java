package com.dd.appiumtest.testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/"},
        glue = {"com/dd/appiumtest/stepDefenitions", "com/dd/appiumtest/hooks"},
        tags = "@ToggleMenuTest",
        plugin = {"pretty"}
)
public class ToggleMenuTest {

}
