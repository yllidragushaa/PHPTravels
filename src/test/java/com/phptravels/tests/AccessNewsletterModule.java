package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.pages.NewsletterPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.annotations.Test;

public class AccessNewsletterModule {

    DashboardPage dashboardPage = new DashboardPage();
    NewsletterPage newsletterPage = new NewsletterPage();

    @Test
    public void AccessNewsletterModule(){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        dashboardPage.featuresSection.click();
        dashboardPage.newsLetterModule.click();

        newsletterPage.verifyUserInNewsletterPage();

    }

}
