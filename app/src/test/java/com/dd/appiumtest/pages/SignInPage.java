package com.dd.appiumtest.pages;

import com.dd.appiumtest.base.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;

public class SignInPage extends BaseTest {


    private By cancelBy = MobileBy.id("android:id/button2");
    private By signInBy = MobileBy.id("android:id/button1");
    private By usernameBy = MobileBy.id("com.android.chrome:id/username");
    private By passwordBy = MobileBy.id("com.android.chrome:id/password");
    private By signInTitleBy = MobileBy.id("com.android.chrome:id/alertTitle");
    //        private By signInTitleBy = MobileBy.xpath("//*[@text='Sign in']");
    private By unAuthorizedTextBy = MobileBy.xpath("/html/body/pre");


    private static final String START_TEXT_SPANISH = "Inicio";
    private static final String START_TEXT_ENGLISH = "START";

    public SignInPage() throws MalformedURLException, InterruptedException {
    }


    public void clickCancelButton() {
        androidDriver.get(URL);
        androidDriver.context("NATIVE_APP");
        wait.until(ExpectedConditions.presenceOfElementLocated(cancelBy)).click();
        androidDriver.context(getWebContext(androidDriver));
    }

    public void clickSignInButton() {
        androidDriver.context("NATIVE_APP");
        wait.until(ExpectedConditions.presenceOfElementLocated(signInBy)).click();
        androidDriver.context(getWebContext(androidDriver));
    }


    public void checkSignInTitleAppears() {
        androidDriver.get(URL);
        androidDriver.context("NATIVE_APP");
        String signInTitle = wait.until(ExpectedConditions.presenceOfElementLocated(signInTitleBy)).getText();
        assert signInTitle.equals("Sign in");
        androidDriver.context(getWebContext(androidDriver));
    }

    public void unauthorizedPage() {
        String unauthorizedText = wait.until(ExpectedConditions.presenceOfElementLocated(unAuthorizedTextBy)).getText();
        assert unauthorizedText.equals("401 UNAUTHORIZED");
    }
}
