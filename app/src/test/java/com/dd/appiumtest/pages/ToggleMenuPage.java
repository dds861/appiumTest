package com.dd.appiumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class ToggleMenuPage {

    private RemoteWebDriver remoteWebDriver;
    private WebDriverWait wait;
    private AndroidDriver androidDriver;

        private By openBy = MobileBy.xpath("//*[@id=\"s4-bodyContainer\"]/div[1]/a");//*[@id="zz12_RootAspMenu"]/li/ul/li[1]/a/span/span
//    private By openBy = MobileBy.xpath("//*[@content-desc='Abrir menú']");
//    private By openBy = MobileBy.AccessibilityId("s4-bodyContainer\\");
//    private By openBy = MobileBy.AccessibilityId("Abrir menú");

    public ToggleMenuPage(RemoteWebDriver remoteWebDriver, WebDriverWait wait, AndroidDriver androidDriver) {
        this.remoteWebDriver = remoteWebDriver;
        this.wait = wait;
        this.androidDriver = androidDriver;
    }

    public void open() {

//        remoteWebDriver.findElementByXPath("//android.view.View[@content-desc='Abrir menú']").click();
//        MobileElement mobileElement = (MobileElement)chromeButtonElement;
//        androidDriver.findElement(openBy).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(openBy)).click();
    }


}
