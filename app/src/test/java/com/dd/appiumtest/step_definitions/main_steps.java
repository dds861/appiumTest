package com.dd.appiumtest.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class main_steps {
    @When("I am on x page")
    public void i_am_on_x_page() {
        System.out.println("I am on x page");
    }

    @Then("I see that element")
    public void i_see_that_element() {
        System.out.println("I see that element");
    }

}
