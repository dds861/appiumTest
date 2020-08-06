package com.dd.appiumtest.stepDefenitions.signin;

import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.SignInPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.dd.appiumtest.contants.Constants.TEXT_SIGN_IN;

public class SignInButtonClickWithPasswordOnlyTestSteps extends BaseTest {
    private SignInPage signInPage = new SignInPage();

    public SignInButtonClickWithPasswordOnlyTestSteps() throws MalformedURLException, InterruptedException {
    }

    @Given("Sign in dialog at SignInButtonClickWithPasswordOnlyTest")
    public void sign_in_dialog_at_sign_in_button_click_with_password_only_test() {
        androidDriver.get(URL);
        String textOnSingIn = signInPage.getTextSignInTitle();
        assert textOnSingIn.equals(TEXT_SIGN_IN);
    }

    @When("Password {string} is entered at SignInButtonClickWithPasswordOnlyTest")
    public void password_is_entered_at_sign_in_button_click_with_password_only_test(String password) {
        signInPage.fillPasswordWithText(password);
    }

    @When("Sign in button clicked at SignInButtonClickWithPasswordOnlyTest")
    public void sign_in_button_clicked_at_sign_in_button_click_with_password_only_test() {
        signInPage.clickSignInButton();
    }

    @Then("Dialog appears to sign in")
    public void dialog_appears_to_sign_in() {
        String textOnSingIn = signInPage.getTextSignInTitle();
        assert textOnSingIn.equals(TEXT_SIGN_IN);
    }
}
