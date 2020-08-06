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

    public SignInPage() throws MalformedURLException, InterruptedException {
    }

    public void clickCancelButton() {
        androidDriver.context(NATIVE_APP_CONTEXT);
        wait.until(ExpectedConditions.presenceOfElementLocated(cancelBy)).click();
        androidDriver.context(getWebContext(androidDriver));
    }

    public String getTextSignInTitle() {
        androidDriver.context(NATIVE_APP_CONTEXT);
        String signInTitle = wait.until(ExpectedConditions.presenceOfElementLocated(signInTitleBy)).getText();
        androidDriver.context(getWebContext(androidDriver));
        return signInTitle;
    }

    public String getTextUnAuthorizedPage() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(unAuthorizedTextBy)).getText();
    }

    public void clickSignInButton() {
        androidDriver.context(NATIVE_APP_CONTEXT);
        wait.until(ExpectedConditions.presenceOfElementLocated(signInBy)).click();
        androidDriver.context(getWebContext(androidDriver));
    }
    public void fillUsernameWithText(String username) {
        androidDriver.context(NATIVE_APP_CONTEXT);
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameBy)).sendKeys(username);
        androidDriver.context(getWebContext(androidDriver));
    }
}
