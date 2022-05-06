package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.checkerframework.checker.units.qual.Temperature;
import org.testng.annotations.Test;

public class ChangelogAccess {

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void accesingChangelog(){

        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));

        dashboardPage.changelog.click();

    }
}
