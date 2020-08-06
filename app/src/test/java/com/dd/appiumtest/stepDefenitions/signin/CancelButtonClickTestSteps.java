package com.dd.appiumtest.stepDefenitions.signin;

import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.SignInPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelButtonClickTestSteps extends BaseTest {


    private SignInPage signInPage = new SignInPage(wait, androidDriver);

    public CancelButtonClickTestSteps() throws MalformedURLException, InterruptedException {
    }

    @Given("Sign in dialog at CancelButtonClickTest")
    public void sign_in_dialog_at_cancel_button_click_test() {

    }

    @When("Cancel button clicked")
    public void cancel_button_clicked() {
        signInPage.clickCancelButton();
    }

    @Then("Unauthorized page appears")
    public void unauthorized_page_appears() {

    }
}
