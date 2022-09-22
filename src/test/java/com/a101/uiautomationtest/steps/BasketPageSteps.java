package com.a101.uiautomationtest.steps;

import com.a101.uiautomationtest.base.TestBase;
import com.a101.uiautomationtest.pages.BasketPage;
import io.cucumber.java.en.And;

public class BasketPageSteps extends TestBase {

    BasketPage basketPage = new BasketPage(webDriver);

    @And("Sepeti Onayla butonuna tıklanır.")
    public void sepeti_onayla_butonuna_tıklanır() {
        basketPage.clickApproveBasketButton();
    }
}
