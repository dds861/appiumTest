package com.dd.appiumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class ToggleMenuPage {

    private WebDriverWait wait;
    private AndroidDriver androidDriver;

    private By openBy = MobileBy.xpath("//*[@id=\"s4-bodyContainer\"]/div[1]/a");//*[@id="zz12_RootAspMenu"]/li/ul/li[1]/a/span/span

    public ToggleMenuPage(WebDriverWait wait, AndroidDriver androidDriver) {
        this.wait = wait;
        this.androidDriver = androidDriver;
    }

    public void open() {
        wait.until(ExpectedConditions.presenceOfElementLocated(openBy)).click();
    }
}
