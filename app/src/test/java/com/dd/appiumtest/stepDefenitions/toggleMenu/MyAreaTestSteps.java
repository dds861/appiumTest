package com.dd.appiumtest.stepDefenitions.toggleMenu;

import com.dd.appiumtest.base.BaseTest;
import com.dd.appiumtest.pages.MainPage;
import com.dd.appiumtest.pages.SignInPage;
import com.dd.appiumtest.pages.ToggleMenuPage;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.dd.appiumtest.contants.Constants.TEXT_CORRECT_PASSWORD;
import static com.dd.appiumtest.contants.Constants.TEXT_CORRECT_USERNAME;
import static com.dd.appiumtest.contants.Constants.TEXT_INTRANET_MAIN_PAGE_TITLE;

public class MyAreaTestSteps extends BaseTest {
    private ToggleMenuPage toggleMenuPage = new ToggleMenuPage(wait, androidDriver);
    private SignInPage signInPage = new SignInPage();
    private MainPage mainPage = new MainPage();

    public MyAreaTestSteps() throws MalformedURLException, InterruptedException {
        super();
    }

    @Given("The main page at MyAreaTest")
    public void the_main_page() {
        androidDriver.get(URL);
        signInPage.fillUsernameWithText(TEXT_CORRECT_USERNAME);
        signInPage.fillPasswordWithText(TEXT_CORRECT_PASSWORD);
        signInPage.clickSignInButton();
        String pageTitle = mainPage.getPageTitleText();
        assert pageTitle.equals(TEXT_INTRANET_MAIN_PAGE_TITLE);
    }

    @When("My Area clicked at MyAreaTest")
    public void my_area_clicked() {
        toggleMenuPage.open();
    }

    @Then("{string} is seen at MyAreaTest")
    public void is_seen(String string) {

    }
}
