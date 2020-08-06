package com.dd.appiumtest.pages;

import com.dd.appiumtest.base.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;

public class MainPage extends BaseTest {

    private By titleTextBy = MobileBy.xpath("/html/head/title");

    public MainPage() throws MalformedURLException, InterruptedException {
    }

    public String getPageTitleText() {
        wait.until(ExpectedConditions.presenceOfElementLocated(titleTextBy));
        return androidDriver.getTitle();
    }
}
