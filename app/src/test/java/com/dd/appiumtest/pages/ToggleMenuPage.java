package com.dd.appiumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;

public class ToggleMenuPage {

    private RemoteWebDriver driver;
    private WebDriverWait wait;

    private By languageBy = MobileBy.xpath("//*[@id=\"main\"]/header/div/div/div[3]/div/div/div[2]/nav/ul/li");
    private By openBy = MobileBy.xpath("//*[@id=\"main\"]/header/div/div/div[1]/div/a/span");
    private By closeBy = MobileBy.xpath("//*[@id=\"main\"]/header/div/div/div[3]/div/div/div[1]/button[2]");
    private By sectorsBy = MobileBy.xpath("//*[@id=\"main\"]/header/div/div/div[3]/div/div/nav/ul/li[2]/a");
    private By servicesBy = MobileBy.xpath("//*[@id=\"main\"]/header/div/div/div[3]/div/div/nav/ul/li[3]/a");
    private By personsBy = MobileBy.xpath("//*[@id=\"main\"]/header/div/div/div[3]/div/div/nav/ul/li[4]/a");
    private By mediaBy = MobileBy.xpath("//*[@id=\"main\"]/header/div/div/div[3]/div/div/nav/ul/li[5]/a");
    private By contactsBy = MobileBy.xpath("//*[@id=\"main\"]/header/div/div/div[3]/div/div/nav/ul/li[6]/a");
    private By startTextBy = MobileBy.xpath("//*[@id=\"main\"]/header/div/div/div[3]/div/div/nav/ul/li[1]/span");
    private static final String START_TEXT_SPANISH = "Inicio";
    private static final String START_TEXT_ENGLISH = "START";

    public ToggleMenuPage(RemoteWebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void changeLanguage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(languageBy)).click();
    }

    public void open() {
        wait.until(ExpectedConditions.presenceOfElementLocated(openBy)).click();
    }

    public void close() {
        wait.until(ExpectedConditions.presenceOfElementLocated(closeBy)).click();
    }

    public void selectSectors() {
        wait.until(ExpectedConditions.presenceOfElementLocated(sectorsBy)).click();
    }

    public void selectServices() {
        wait.until(ExpectedConditions.presenceOfElementLocated(servicesBy)).click();
    }

    public void selectPersons() {
        wait.until(ExpectedConditions.presenceOfElementLocated(personsBy)).click();
    }

    public void selectMedia() {
        wait.until(ExpectedConditions.presenceOfElementLocated(mediaBy)).click();
    }

    public void selectContacts() {
        wait.until(ExpectedConditions.presenceOfElementLocated(contactsBy)).click();
    }

    public void checkIfStartTextExist() {
        WebElement startText = wait.until(ExpectedConditions.presenceOfElementLocated(startTextBy));
        assert (startText.getText().contains(START_TEXT_SPANISH) || startText.getText().contains(START_TEXT_ENGLISH));
    }
}
