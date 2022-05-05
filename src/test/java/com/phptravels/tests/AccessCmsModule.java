package com.phptravels.tests;

import com.phptravels.pages.CmsPage;
import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;

public class AccessCmsModule {

    DashboardPage dashboardPage = new DashboardPage();
    CmsPage cmsPage = new CmsPage();

    @Test
    public void AccessCmsModule(){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));

        dashboardPage.featuresSection.click();
        dashboardPage.cmsModule.click();

        cmsPage.verifyUserOnCmsPage();

    }
}
