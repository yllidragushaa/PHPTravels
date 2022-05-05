package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.BrowserUtilties;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoOverview {
    DashboardPage dashboardPage = new DashboardPage ();

    @Test
    public void DemoOveriviewPage(){
        Driver.getDriver ().get (ConfigurationReader.getProperty ("siteurl"));
        dashboardPage.demopage.click ();
        dashboardPage.demopage.isDisplayed ();
    }
}

