package com.a101.uiautomationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends PageBase{

    @FindBy(className = "selected-variant-text")
    private WebElement variant;

    @FindBy(className = "go-to-shop")
    private WebElement goToBasketPageButton;

    @FindBy(className = "add-to-basket")
    private WebElement addToBasketButton;

    public ProductDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getVariantText(){
        return getText(variant);
    }

    public void clickAddToBasketButton(){
        clickFunction(addToBasketButton);
    }

    public void clickGoToBasketPageButton(){
        clickFunction(goToBasketPageButton);
    }
}
