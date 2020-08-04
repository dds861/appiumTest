package com.dd.appiumtest.stepDefenitions.signin;

import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.SignInPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInScreenAppearsTestSteps extends BaseTest {
    private SignInPage signInPage = new SignInPage(driver, wait, appiumDriver);

    public SignInScreenAppearsTestSteps() throws MalformedURLException, InterruptedException {
        super();
    }
    @Given("Empty Page")
    public void empty_page() {
    }

    @When("Intranet page entered")
    public void intranet_page_entered() {

    }
    @Then("Sign in dialog appears")
    public void sign_in_dialog_appears() {
        signInPage.checkSignInTitleAppears();
    }
}
