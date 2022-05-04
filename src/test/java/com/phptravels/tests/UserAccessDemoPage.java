package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.pages.DemoPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.annotations.Test;

public class UserAccessDemoPage {
    DashboardPage dashboardPage = new DashboardPage();
    DemoPage demoPage = new DemoPage();
    @Test
    public void accessDemoPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        dashboardPage.demoModule.click();
        demoPage.verifyUserOnDemoPage();
    }
}
