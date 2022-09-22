package com.a101.uiautomationtest.steps;

import com.a101.uiautomationtest.base.TestBase;
import com.a101.uiautomationtest.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.util.Assert;

import java.util.UUID;

public class CheckoutPageSteps extends TestBase {

    CheckoutPage checkoutPage = new CheckoutPage(webDriver);

    @And("Üye olmadan devam et butonuna tıklanır.")
    public void üye_olmadan_devam_et_butonuna_tıklanır() {
        checkoutPage.clickContinueWithoutSubscriptionButton();
    }

    @And("Mail girilir")
    public void mail_girilir() {
        checkoutPage.enterEmail("bestamikibris@gmail.com");
    }
    @And("Devam et butonuna tıklanır.")
    public void devam_et_butonuna_tıklanır() throws InterruptedException {
        checkoutPage.clickContinueButton();
    }

    @Then("Adres ekranı geldiği kontrol edilir.")
    public void adres_ekranı_geldiği_kontrol_edilir() {
        checkoutPage.checkAddressPageOpened();
    }

    @And("Yeni adres ekle butonuna tıklanır.")
    public void yeni_adres_ekle_butonuna_tıklanır() {
        checkoutPage.clickNewAddressButton();
    }
    @And("Adres bilgileri girilir.")
    public void adres_bilgileri_girilir() throws InterruptedException {
        checkoutPage.enterTitle(UUID.randomUUID().toString());
        checkoutPage.enterFirstName("Bestami" + UUID.randomUUID());
        checkoutPage.enterLastName("Kibris");
        checkoutPage.enterPhoneNumber("05438567432");
        checkoutPage.selectCity("İSTANBUL");
        checkoutPage.selectTownship("ADALAR");
        Thread.sleep(1000);
        checkoutPage.selectDistrict("BURGAZADA MAH");
        checkoutPage.enterAddress("Merkez cami arkası");
    }

    @And("Kaydet butonuna tıklanır.")
    public void kaydet_butonuna_tıklanır() {
        checkoutPage.clickSaveAddressButton();
    }

    @And("Kargo firması seçilir.")
    public void kargo_firması_seçilir() throws InterruptedException {
        Thread.sleep(3000);
        checkoutPage.clickCargoRadioButton();
    }

    @When("Kaydet ve Devam Et butonuna tıkla")
    public void kaydet_ve_devam_et_butonuna_tıkla() {
        checkoutPage.clickSaveAndContinueButton();
    }

    @Then("Ödeme ekranının geldiği görülür.")
    public void ödeme_ekranının_geldiği_görülür() throws InterruptedException {
        Assert.isTrue(checkoutPage.isPaymentPageOpened(),"Payment page is not opened.");
        Thread.sleep(4000);
    }
}
