package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.annotations.Test;

public class SocialMediasTest {

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void socialMediasTest() {
        Driver.getDriver().get(ConfigurationReader.getProperty ("siteurl"));
        for (int i = 1; i <= 5; i++) {

            dashboardPage.SocialMedias(i).click();


        }


    }
}
