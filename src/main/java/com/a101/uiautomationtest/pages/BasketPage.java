package com.a101.uiautomationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends PageBase{

    @FindBy(xpath = "//a[@href='/orders/checkout/']")
    private WebElement approveBasketButton;

    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickApproveBasketButton(){
        clickFunction(approveBasketButton);
    }
}
