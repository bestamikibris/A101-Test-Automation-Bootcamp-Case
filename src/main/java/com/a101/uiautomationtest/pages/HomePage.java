package com.a101.uiautomationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    @FindBy(xpath = "//*[@data-pk='37a6c1c8-a180-4b87-9ec9-3a29f6453a0c']")
    private WebElement clothingAccessoryCap;

    @FindBy(xpath = "//a[@href='/giyim-aksesuar/dizalti-corap/']")
    private WebElement kneeSocksCap;

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement cookieAcceptButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void hoverClothingAccessoryCap() {
        hoverElement(clothingAccessoryCap);
    }

    public void clickKneeSocksCap(){
        clickFunction(kneeSocksCap);
    }

    public void clickCookieAcceptButton(){
        clickFunction(cookieAcceptButton);
    }
}
