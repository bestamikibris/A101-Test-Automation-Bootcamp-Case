package com.a101.uiautomationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{

    @FindBy(xpath = "//*[@data-pk='18864']")
    private WebElement firstProduct;

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickFirstProduct(){
        clickFunction(firstProduct);
    }
}
