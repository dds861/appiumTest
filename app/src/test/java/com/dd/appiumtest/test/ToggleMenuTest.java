package com.dd.appiumtest.test;

import com.dd.appiumtest.pages.ToggleMenuPage;

import org.junit.Test;

public class ToggleMenuTest extends BaseTest {

    @Test
    public void test() throws InterruptedException {

        ToggleMenuPage toggleMenuPage = new ToggleMenuPage(driver, wait);

        toggleMenuPage.open();
        toggleMenuPage.checkIfStartTextExist();
        toggleMenuPage.selectSectors();
        toggleMenuPage.open();
        toggleMenuPage.checkIfStartTextExist();
        toggleMenuPage.selectServices();
        toggleMenuPage.open();
        toggleMenuPage.checkIfStartTextExist();
        toggleMenuPage.selectPersons();
        toggleMenuPage.open();
        toggleMenuPage.checkIfStartTextExist();
        toggleMenuPage.selectMedia();
        toggleMenuPage.open();
        toggleMenuPage.checkIfStartTextExist();
        toggleMenuPage.selectContacts();
        toggleMenuPage.open();
        toggleMenuPage.checkIfStartTextExist();
        toggleMenuPage.close();
    }
}
