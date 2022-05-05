package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.annotations.Test;

public class AccessRequirements {

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void accessRequirements(){

        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));

        dashboardPage.requirements.click();

    }
}
