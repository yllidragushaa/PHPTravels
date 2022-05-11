package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.pages.DesktopAppPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileAppsTest {
    DashboardPage dashboardPage = new DashboardPage();
    DesktopAppPage desktopAppPage = new DesktopAppPage();

    @Test
    public void desktopApptest() {
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));

        dashboardPage.mobileApps.click();

        Assert.assertEquals(Driver.getDriver().getTitle(),"Mobile applications - PHPTRAVELS");

    }
}
