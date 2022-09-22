package com.a101.uiautomationtest.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver webDriver;

    public static void chromeSetup() throws InterruptedException {
        WebDriverManager
                .chromedriver()
                .setup();
        webDriver = new ChromeDriver();
        openA101();
    }

    public static void firefoxSetup() throws InterruptedException {
        WebDriverManager
                .firefoxdriver()
                .setup();
        webDriver = new FirefoxDriver();
        openA101();
    }

    public static void openA101() throws InterruptedException {
        webDriver.manage().window().maximize();
        webDriver.get("https://www.a101.com.tr");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }

    public static void quitDriver(){
        if (webDriver != null){
            webDriver.quit();
        }
    }
}

