package com.dd.appiumtest.base;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.annotation.Nullable;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {

    protected static final String APPIUM = "http://localhost:4723/wd/hub";
    protected static final String URL = "https://intranet.babel.es/";
    protected static final Integer TIME_OUT_IN_SECONDS = 10;
    protected static final Integer SLEEP_IN_MILLIS = 1000;
    private static final String PLATFORM_NAME = "Android";
    private static final String PLATFORM_VERSION = "7";
    private static final String DEVICE_NAME = "f2c4e47b";
    private static final String DEVICE_ID = "f2c4e47b";
    //    private static final String DEVICE_ID = "emulator-5554";
    private static final String AUTOMATION_NAME = "UiAutomator2";
    private static final String BROWSER_NAME = "Chrome";
    private static final String CHROME_DRIVER_EXECUTABLE_DIR = "/Users/daniyar.nurgaliyev.local/Downloads/appium_chromedriver_temp";
    private static final String CHROME_DRIVER_CHROME_MAPPING_FILE = "/Users/daniyar.nurgaliyev.local/Downloads/appium_chromedriver_temp/chromedriverChromeMappingFile";


    protected AndroidDriver androidDriver;
    protected WebDriverWait wait;
    private DesiredCapabilities caps;

    public BaseTest() throws MalformedURLException, InterruptedException {
        setupDesiredCapabilities();
        setupObjects();
        setupDriver();
    }

    public void quitDriver() {
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }

    private void setupDesiredCapabilities() {
        caps = new DesiredCapabilities();
        caps.setCapability(CapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        caps.setCapability(MobileCapabilityType.UDID, DEVICE_ID);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME);
        caps.setCapability(CapabilityType.BROWSER_NAME, BROWSER_NAME);
        caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE_DIR, CHROME_DRIVER_EXECUTABLE_DIR);
        caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_CHROME_MAPPING_FILE, CHROME_DRIVER_CHROME_MAPPING_FILE);

    }

    private void setupDriver() throws InterruptedException {
        Thread.sleep(SLEEP_IN_MILLIS);
        androidDriver.get(URL);
    }

    private void setupObjects() throws MalformedURLException {
        androidDriver = new AndroidDriver(new URL(APPIUM), caps);
        wait = new WebDriverWait(androidDriver, TIME_OUT_IN_SECONDS);
    }


    @Nullable
    protected String getWebContext(AndroidDriver driver) {
        ArrayList<String> contexts = new ArrayList(driver.getContextHandles());
        for (String context : contexts) {
            if (!context.equals("NATIVE_APP")) {
                return context;
            }
        }
        return null;
    }
}
