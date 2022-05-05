package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AccessHotelsModule {

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void accessHotelsModule(){

        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));

        Select select = new Select(dashboardPage.feauteresDropDown);

        select.selectByIndex(2);

    }
}
