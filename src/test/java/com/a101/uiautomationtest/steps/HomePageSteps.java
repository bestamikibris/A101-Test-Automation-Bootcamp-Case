package com.a101.uiautomationtest.steps;

import com.a101.uiautomationtest.base.TestBase;
import com.a101.uiautomationtest.pages.HomePage;
import io.cucumber.java.en.Given;

public class HomePageSteps extends TestBase {

    HomePage homePage = new HomePage(webDriver);

    @Given("Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir.")
    public void giyim_aksesuar_kadın_iç_giyim_dizaltı_çorap_bölümüne_girilir() {
        homePage.clickCookieAcceptButton();
        homePage.hoverClothingAccessoryCap();
        homePage.clickKneeSocksCap();
    }

}
