package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.BrowserUtilties;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.annotations.Test;

public class ContactLiveChatSupport {
    DashboardPage dashboardPage = new DashboardPage();
    @Test
    public void contactSupportTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        BrowserUtilties.sleep(7);
        dashboardPage.leaveAMessageButton.click();
    }
}
