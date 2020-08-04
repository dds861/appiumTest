package com.dd.appiumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class SignInPage {

    private RemoteWebDriver driver;
    private AppiumDriver appiumDriver;
    private WebDriverWait wait;

    private By cancelBy = MobileBy.id("android:id/button2");
    private By signInBy = MobileBy.id("android:id/button1");
    private By usernameBy = MobileBy.id("com.android.chrome:id/username");
    private By passwordBy = MobileBy.id("com.android.chrome:id/password");
    private By signInTitleBy = MobileBy.id("com.android.chrome:id/alertTitle");
    //        private By signInTitleBy = MobileBy.xpath("//*[@text='Sign in']");
    private By unAuthorizedTextBy = MobileBy.xpath("/html/body/pre");

    private static final String START_TEXT_SPANISH = "Inicio";
    private static final String START_TEXT_ENGLISH = "START";

    public SignInPage(RemoteWebDriver driver, WebDriverWait wait, AppiumDriver appiumDriver) {
        this.driver = driver;
        this.appiumDriver = appiumDriver;
        this.wait = wait;
    }

    public void clickCancelButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(cancelBy)).click();
    }

    public void checkSignInTitleAppears() {

//        String currentwindow = driver.getWindowHandle();
//        Set<String> allWindows = driver.getWindowHandles();
//        Iterator<String> i = allWindows.iterator();
//        while(i.hasNext()){
//            String childwindow = i.next();
//            if(!childwindow.equalsIgnoreCase(currentwindow)){
//                driver.switchTo().window(childwindow);
//                System.out.println("The child window is "+childwindow);
//            } else {
//                System.out.println("There are no children");
//            }
//        }
//        appiumDriver.findElementByXPath("//android.widget.Button[@resourceid=‘android:id/button1’]").click();
//        driver.findElementByXPath("//android.widget.Button[@resourceid=‘android:id/button1’]").click();
//        driver.findElement(By.name("Cancel")).click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/button1")));
////        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();

//        String text0 = driver.findElement(By.id(".alertTitle")).getText();
//        System.out.println("text0: " + text0);
//        String myWindowHandle = driver.getWindowHandle();
//        System.out.println("myWindowHandle: " + myWindowHandle);
////        driver.switchTo().window(myWindowHandle);
//        WebDriver popup = driver.switchTo().frame(".action_bar_root");
//        String text1 = popup.findElement(signInTitleBy).getText();
//        ;
//        System.out.println(text1);
//        String text2 = wait.until(ExpectedConditions.presenceOfElementLocated(signInTitleBy)).getText();
//        System.out.println(text2);
    }
}
