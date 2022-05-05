package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentMethodsTest {

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void paymentMethodTest() {
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        dashboardPage.verifyElement("All the major e-payment gatways are accepted here including Paypal, Credit Card, Western Union, Skrill, Bitcoin, Transferwise.", dashboardPage.paymentMethods);
    }

}
