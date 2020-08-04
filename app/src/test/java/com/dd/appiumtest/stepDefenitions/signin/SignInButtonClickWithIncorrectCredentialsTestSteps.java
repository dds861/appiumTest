package com.dd.appiumtest.stepDefenitions.signin;
import com.dd.appiumtest.base.BaseTest;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SignInButtonClickWithIncorrectCredentialsTestSteps extends BaseTest {

    public SignInButtonClickWithIncorrectCredentialsTestSteps() throws MalformedURLException, InterruptedException {
    }

    @Given("Sign in dialog at SignInButtonClickWithIncorrectCredentialsTest")
    public void sign_in_dialog_at_sign_in_button_click_with_incorrect_credentials_test() {

    }

    @When("Username {string} is being entered incorrectly")
    public void username_is_being_entered_incorrectly(String string) {

    }
    @When("Password {string} is being entered incorrectly")
    public void password_is_being_entered_incorrectly(String string) {

    }
    @Then("Dialog to sign in appears")
    public void dialog_to_sign_in_appears() {

    }
}
