package com.dd.appiumtest.hooks;

import com.dd.appiumtest.base.BaseTest;

import java.net.MalformedURLException;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseHooks extends BaseTest {

    public BaseHooks() throws MalformedURLException, InterruptedException {
        System.out.println("MainHooks");
    }

    @Before
    public void BeforeMain() {
        System.out.println("BeforeMain");
    }

    @After
    public void AfterMain() {
        System.out.println("AfterMain");
        quitDriver();
    }
}
