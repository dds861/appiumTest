package com.dd.appiumtest.stepDefenitions.signin;

import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.SignInPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.dd.appiumtest.contants.Constants.TEXT_SIGN_IN;

public class SignInButtonClickWithIncorrectCredentialsTestSteps extends BaseTest {

    private SignInPage signInPage = new SignInPage();

    public SignInButtonClickWithIncorrectCredentialsTestSteps() throws MalformedURLException, InterruptedException {
    }

    @Given("Sign in dialog at SignInButtonClickWithIncorrectCredentialsTest")
    public void sign_in_dialog_at_sign_in_button_click_with_incorrect_credentials_test() {
        androidDriver.get(URL);
        String textOnSingIn = signInPage.getTextSignInTitle();
        assert textOnSingIn.equals(TEXT_SIGN_IN);
    }

    @When("Username {string} is being entered incorrectly")
    public void username_is_being_entered_incorrectly(String username) {
        signInPage.fillUsernameWithText(username);
    }

    @When("Password {string} is being entered incorrectly")
    public void password_is_being_entered_incorrectly(String password) {
        signInPage.fillPasswordWithText(password);
    }

    @Then("Dialog to sign in appears")
    public void dialog_to_sign_in_appears() {
        String textOnSingIn = signInPage.getTextSignInTitle();
        assert textOnSingIn.equals(TEXT_SIGN_IN);
    }
}
