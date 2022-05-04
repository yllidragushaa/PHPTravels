package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.pages.PricingPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.annotations.Test;

public class AccessPlansAndServices {
    DashboardPage dashboardPage = new DashboardPage();
    PricingPage pricingPage = new PricingPage();
    @Test
    public void userAccessPlansAndPrices(){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        dashboardPage.pricingModule.click();
        pricingPage.verifyUserOnPricingPage();
    }
}
