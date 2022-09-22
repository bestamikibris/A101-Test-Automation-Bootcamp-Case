package com.a101.uiautomationtest.steps;

import com.a101.uiautomationtest.base.TestBase;
import com.a101.uiautomationtest.pages.ProductPage;
import io.cucumber.java.en.And;

public class ProductPageSteps extends TestBase {

    ProductPage productPage = new ProductPage(webDriver);

    @And("Bir ürüne tıklanır")
    public void bir_ürüne_tıklanır() {
        productPage.clickFirstProduct();
    }
}
