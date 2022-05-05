package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class AccessSupliers {

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void accessSuppliers(){

        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));

        Select select = new Select(dashboardPage.productDropDown);

        select.selectByIndex(6);

    }
}
