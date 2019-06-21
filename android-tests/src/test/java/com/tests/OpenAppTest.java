package com.tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenAppTest {

    private AndroidDriver driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desCaps = new DesiredCapabilities();
        desCaps.setCapability("platformName", "Android");
        desCaps.setCapability("deviceName", "Galaxy_Nexus_API_28_1");
        desCaps.setCapability("platformVersion", "9");
        desCaps.setCapability("automationName", "Appium");
        desCaps.setCapability("appPackage", "com.andromo.dev494239.app664851");
        desCaps.setCapability("appActivity", ".Dashboard_000");
        desCaps.setCapability("app", "C:/Users/Omen/Documents/GitHub/AppiumTest/android-tests/src/test/resources");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desCaps);
    }

    @Test
    public  void testAppOpen(){
        System.out.println("App opened");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
