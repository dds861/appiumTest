package com.dd.appiumtest.stepDefenitions.toggleMenu;

import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.ToggleMenuPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAreaTestSteps extends BaseTest {
    private ToggleMenuPage toggleMenuPage = new ToggleMenuPage(remoteWebDriver, wait, androidDriver);

    public MyAreaTestSteps() throws MalformedURLException, InterruptedException {
        super();
    }

    @Given("The main page at MyAreaTest")
    public void the_main_page() {
        toggleMenuPage.open();
    }

    @When("My Area clicked at MyAreaTest")
    public void my_area_clicked() {

    }

    @Then("{string} is seen at MyAreaTest")
    public void is_seen(String string) {

    }
}
