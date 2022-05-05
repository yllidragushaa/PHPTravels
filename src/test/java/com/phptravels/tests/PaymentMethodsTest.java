package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentMethodsTest {

    DashboardPage dashboardPage = new DashboardPage();

 @Test
    public void paymentMethodTest(){
     Assert.assertTrue(dashboardPage.paymentMethods);
 }



}
