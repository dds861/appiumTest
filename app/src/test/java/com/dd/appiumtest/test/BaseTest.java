package com.dd.appiumtest.test;
import com.dd.appiumtest.pages.MainPage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
class BaseTest {

    protected static final String APPIUM = "http://localhost:4723/wd/hub";
    protected static final String URL = "https://babel.es";
    protected static final Integer TIME_OUT_IN_SECONDS = 10;
    protected static final Integer SLEEP_IN_MILLIS = 1000;

    protected RemoteWebDriver driver;
    protected WebDriverWait wait;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7");
        caps.setCapability("deviceName", "f2c4e47b");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("chromedriverExecutableDir", "/Users/daniyar.nurgaliyev.local/Downloads/appium_chromedriver_temp");
        caps.setCapability("chromedriverChromeMappingFile", "/Users/daniyar.nurgaliyev.local/Downloads/appium_chromedriver_temp/chromedriverChromeMappingFile");

        driver = new RemoteWebDriver(new URL(APPIUM), caps);
        wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);

        driver.get(URL);
        Thread.sleep(SLEEP_IN_MILLIS);

        MainPage mainPage = new MainPage(driver, wait);
        mainPage.acceptCookies();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
