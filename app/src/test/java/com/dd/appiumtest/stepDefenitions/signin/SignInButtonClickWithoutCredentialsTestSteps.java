package com.dd.appiumtest.stepDefenitions.signin;
import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.SignInPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.dd.appiumtest.contants.Constants.TEXT_SIGN_IN;

public class SignInButtonClickWithoutCredentialsTestSteps extends BaseTest {

    private SignInPage signInPage = new SignInPage();

    public SignInButtonClickWithoutCredentialsTestSteps() throws MalformedURLException, InterruptedException {
    }

    @Given("Sign in dialog at SignInButtonClickWithoutCredentialsTest")
    public void sign_in_dialog_at_sign_in_button_click_without_credentials_test() {
        androidDriver.get(URL);
        String textOnSingIn = signInPage.getTextSignInTitle();
        assert textOnSingIn.equals(TEXT_SIGN_IN);
    }

    @When("Sign in button clicked at SignInButtonClickWithoutCredentialsTest")
    public void sign_in_button_clicked_at_sign_in_button_click_without_credentials_test() {
        signInPage.clickSignInButton();
    }

    @Then("Dialog sign in appears")
    public void dialog_sign_in_appears() {
        String textOnSingIn = signInPage.getTextSignInTitle();
        assert textOnSingIn.equals(TEXT_SIGN_IN);
    }
}
