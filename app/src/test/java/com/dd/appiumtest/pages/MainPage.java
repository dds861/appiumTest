package com.dd.appiumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;

public class MainPage {

    private RemoteWebDriver driver;
    private WebDriverWait wait;

    private By acceptButtonBy = MobileBy.id("btnAceptCookies");

    public MainPage(RemoteWebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void acceptCookies() {
        wait.until(ExpectedConditions.presenceOfElementLocated(acceptButtonBy)).click();
    }
}
