package com.a101.uiautomationtest.steps;

import com.a101.uiautomationtest.base.TestBase;
import com.a101.uiautomationtest.pages.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductDetailPageSteps extends TestBase {

    ProductDetailPage productDetailPage = new ProductDetailPage(webDriver);

    @Then("Açılan ürünün siyah olduğu doğrulanır.")
    public void açılan_ürünün_siyah_olduğu_doğrulanır() {
        String variantText = productDetailPage.getVariantText();
        Assert.assertTrue(variantText.contains("SİYAH"));
    }

    @And("Sepeti Görüntüle butonuna tıklanır.")
    public void sepeti_görüntüle_butonuna_tıklanır() {
        productDetailPage.clickGoToBasketPageButton();
    }

    @And("Sepete ekle butonuna tıklanır.")
    public void sepete_ekle_butonuna_tıklanır() {
        productDetailPage.clickAddToBasketButton();
    }
}
