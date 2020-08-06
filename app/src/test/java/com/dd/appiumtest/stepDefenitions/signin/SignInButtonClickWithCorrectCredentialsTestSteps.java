package com.dd.appiumtest.stepDefenitions.signin;

import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.MainPage;
import com.dd.appiumtest.pages.SignInPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.dd.appiumtest.contants.Constants.TEXT_INTRANET_MAIN_PAGE_TITLE;
import static com.dd.appiumtest.contants.Constants.TEXT_SIGN_IN;

public class SignInButtonClickWithCorrectCredentialsTestSteps extends BaseTest {

    private SignInPage signInPage = new SignInPage();
    private MainPage mainPage = new MainPage();

    public SignInButtonClickWithCorrectCredentialsTestSteps() throws MalformedURLException, InterruptedException {
        super();
    }

    @Given("Sign in dialog at SignInButtonClickWithCorrectCredentialsTest")
    public void sign_in_dialog_at_sign_in_button_click_with_correct_credentials_test() {
        androidDriver.get(URL);
        String textOnSingIn = signInPage.getTextSignInTitle();
        assert textOnSingIn.equals(TEXT_SIGN_IN);
    }

    @When("Username {string} is being entered correctly")
    public void username_is_being_entered_correctly(String username) {
        signInPage.fillUsernameWithText(username);
    }

    @And("Password {string} is being entered correctly")
    public void password_is_being_entered_correctly(String password) {
        signInPage.fillPasswordWithText(password);
    }

    @Then("Main intranet page is being opened")
    public void main_intranet_page_is_being_opened() {
        signInPage.clickSignInButton();
        String pageTitle = mainPage.getPageTitleText();
        assert pageTitle.equals(TEXT_INTRANET_MAIN_PAGE_TITLE);
    }
}
