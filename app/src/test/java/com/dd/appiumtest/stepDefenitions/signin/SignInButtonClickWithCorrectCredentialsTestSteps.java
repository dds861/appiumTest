package com.dd.appiumtest.stepDefenitions.signin;
import com.dd.appiumtest.base.BaseTest;

import java.net.MalformedURLException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SignInButtonClickWithCorrectCredentialsTestSteps extends BaseTest {

    public SignInButtonClickWithCorrectCredentialsTestSteps() throws MalformedURLException, InterruptedException {
        super();
    }
    @Given("Sign in dialog at SignInButtonClickWithCorrectCredentialsTest")
    public void sign_in_dialog_at_sign_in_button_click_with_correct_credentials_test() {

    }

    @When("Username {string} is being entered correctly")
    public void username_is_being_entered_correctly(String string) {

    }

    @And("Password {string} is being entered correctly")
    public void password_is_being_entered_correctly(String string) {

    }

    @Then("Main intranet page is being opened")
    public void main_intranet_page_is_being_opened() {

    }
}
