package com.dd.appiumtest.stepDefenitions.toggleMenu;

import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.SignInPage;
import com.dd.appiumtest.pages.ToggleMenuPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyQueriesTestSteps extends BaseTest {
    private ToggleMenuPage toggleMenuPage = new ToggleMenuPage(wait, androidDriver);
    private SignInPage signInPage = new SignInPage();

    public MyQueriesTestSteps() throws MalformedURLException, InterruptedException {
        super();
    }

    @Given("The main page at QueriesTest")
    public void the_main_page_at_queries_test() {

    }

    @When("Queries clicked at QueriesTest")
    public void queries_clicked_at_queries_test() {

    }

    @Then("{string} is seen at QueriesTest")
    public void is_seen_at_queries_test(String string) {

    }
}
