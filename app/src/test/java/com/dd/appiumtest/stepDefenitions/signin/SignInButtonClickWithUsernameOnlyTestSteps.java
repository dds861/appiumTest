package com.dd.appiumtest.stepDefenitions.signin;
import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.SignInPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.dd.appiumtest.contants.Constants.TEXT_SIGN_IN;

public class SignInButtonClickWithUsernameOnlyTestSteps extends BaseTest {

    private SignInPage signInPage = new SignInPage();

    public SignInButtonClickWithUsernameOnlyTestSteps() throws MalformedURLException, InterruptedException {
    }

    @Given("Sign in dialog at SignInButtonClickWithUsernameOnlyTest")
    public void sign_in_dialog_at_sign_in_button_click_with_username_only_test() {
        androidDriver.get(URL);
        String textOnSingIn = signInPage.getTextSignInTitle();
        assert textOnSingIn.equals(TEXT_SIGN_IN);
    }

    @When("Username {string} is entered at SignInButtonClickWithUsernameOnlyTest")
    public void username_is_entered_at_sign_in_button_click_with_username_only_test(String username) {
        signInPage.fillUsernameWithText(username);
    }
    @When("Sign in button clicked at SignInButtonClickWithUsernameOnlyTest")
    public void sign_in_button_clicked_at_sign_in_button_click_with_username_only_test() {
        signInPage.clickSignInButton();
    }
    @Then("Appears sign in dialog")
    public void appears_sign_in_dialog() {
        String textOnSingIn = signInPage.getTextSignInTitle();
        assert textOnSingIn.equals(TEXT_SIGN_IN);
    }
}
