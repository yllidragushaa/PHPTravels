package com.phptravels.tests;

import com.phptravels.pages.BlogPage;
import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.BrowserUtilties;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.annotations.Test;

public class AccessBlogModule {

    DashboardPage dashboardPage = new DashboardPage();
    BlogPage blogPage = new BlogPage();

    @Test
    public void AccessBlogModule(){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        dashboardPage.featuresSection.click();
        BrowserUtilties.sleep(1);
        dashboardPage.blogModule.click();

        BrowserUtilties.sleep(1);

        blogPage.verifyBlogPage("The perfect Blogging Module", blogPage.actualResult);


    }

}
