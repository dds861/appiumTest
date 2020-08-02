package com.dd.appiumtest.testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/"},
        glue = {"com.dd.appiumtest.stepDefenitions"},
        plugin = {"pretty"}
)
public class ToggleMenuTest {

}
