package com.dd.appiumtest.stepDefenitions.signin;

import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.SignInPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.dd.appiumtest.contants.Constants.TEXT_401_UNAUTHORIZED;
import static com.dd.appiumtest.contants.Constants.TEXT_SIGN_IN;

public class CancelButtonClickTestSteps extends BaseTest {

    private SignInPage signInPage = new SignInPage();

    public CancelButtonClickTestSteps() throws MalformedURLException, InterruptedException {
    }

    @Given("Sign in dialog at CancelButtonClickTest")
    public void sign_in_dialog_at_cancel_button_click_test() {
        androidDriver.get(URL);
        String textOnSingIn = signInPage.getTextSignInTitle();
        assert textOnSingIn.equals(TEXT_SIGN_IN);
    }

    @When("Cancel button clicked")
    public void cancel_button_clicked() {
        androidDriver.get(URL);
        signInPage.clickCancelButton();
    }

    @Then("Unauthorized page appears")
    public void unauthorized_page_appears() {
        String unAuthorizedText = signInPage.getTextUnAuthorizedPage();
        assert unAuthorizedText.equals(TEXT_401_UNAUTHORIZED);
    }
}
