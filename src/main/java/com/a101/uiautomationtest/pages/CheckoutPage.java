package com.a101.uiautomationtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CheckoutPage extends PageBase{

    @FindBy(className = "auth__form__proceed")
    private WebElement continueWithoutSubscriptionButton;

    @FindBy(xpath = "//*[@name='user_email']")
    private WebElement emailInput;

    @FindBy(xpath = "//*[contains(text(), ' DEVAM ET ')]")
    private WebElement continueButton;

    @FindBy(className = "new-address")
    private WebElement newAddressButton;

    @FindBy(xpath = "//input[@name='title']")
    private WebElement titleInput;

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='phone_number']")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//select[@name='city']")
    private WebElement selectCity;

    @FindBy(xpath = "//select[@name='township']")
    private WebElement selectTownship;

    @FindBy(className = "js-district")
    private WebElement selectDistrict;

    @FindBy(className = "js-address-textarea")
    private WebElement adressInput;

    @FindBy(className = "js-set-country")
    private WebElement saveAddressButton;

    @FindBy(xpath = "//label[@data-slug='10']")
    private WebElement cargoRadioButton;


    @FindBy(xpath = "//button[@data-index='1']")
    private WebElement saveAndContinueButton;

    public CheckoutPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickContinueWithoutSubscriptionButton(){
        clickFunction(continueWithoutSubscriptionButton);
    }

    public void enterEmail(String email){
        sendKeysFunction(emailInput, email);
    }

    public void clickContinueButton() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> submitButons = driver.findElements(By.xpath("//button[@type='submit']"));
        submitButons.forEach(k -> {
            if (k.getText().contains("DEVAM ET")) {
                clickFunction(k);
            }
        });
    }

    public void checkAddressPageOpened(){
        wait.until(ExpectedConditions.elementToBeClickable(newAddressButton));
    }

    public void clickNewAddressButton(){
        clickFunction(newAddressButton);
    }

    public void enterTitle(String title){
        sendKeysFunction(titleInput, title);
    }

    public void enterFirstName(String firstName){
        sendKeysFunction(firstNameInput, firstName);
    }

    public void enterLastName(String lastName){
        sendKeysFunction(lastNameInput, lastName);
    }

    public void enterPhoneNumber(String phoneNumber){
        sendKeysFunction(phoneNumberInput, phoneNumber);
    }

    public void selectCity(String city){
        selectElementFromDropdown(selectCity, city);
    }

    public void selectTownship(String township){
        selectElementFromDropdown(selectTownship, township);
    }

    public void selectDistrict(String district){
        selectElementFromDropdown(selectDistrict, district);
    }

    public void enterAddress(String address){
        sendKeysFunction(adressInput, address);
    }

    public void clickSaveAddressButton(){
        clickFunction(saveAddressButton);
    }

    public void clickCargoRadioButton(){
        clickFunction(cargoRadioButton);
    }

    public void clickSaveAndContinueButton(){
        clickFunction(saveAndContinueButton);
    }

    public boolean isPaymentPageOpened(){
        List<WebElement> paymentTabs = driver.findElements(By.className("payment-tab"));
        wait.until(ExpectedConditions.elementToBeClickable(paymentTabs.get(0)));
        return !paymentTabs.isEmpty();
    }
}
