package com.a101.uiautomationtest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public abstract class PageBase {

    public final WebDriver driver;
    public final WebDriverWait wait;

    public PageBase(WebDriver webDriver){
        driver = webDriver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver,this);
    }

    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public String getText(WebElement sendKeysElement){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        return sendKeysElement.getText();
    }

    public void hoverElement(WebElement hoverElement){
        wait.until(ExpectedConditions.visibilityOf(hoverElement));
        Actions action = new Actions(driver);
        action.moveToElement(hoverElement).perform();
    }

    public void selectElementFromDropdown(WebElement dropdown, String element){
        wait.until(ExpectedConditions.visibilityOf(dropdown));
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }

    public void switchTab(){
        //Get the current window handle
        String windowHandle = driver.getWindowHandle();
        //Get the list of window handles
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        tabs.remove(windowHandle);
        //Use the list of window handles to switch between windows
        driver.switchTo().window(tabs.get(0));
    }

    public void scrollIntoView(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }
}
