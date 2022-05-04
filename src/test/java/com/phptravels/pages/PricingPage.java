package com.phptravels.pages;

import com.phptravels.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PricingPage {
    public PricingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void verifyUserOnPricingPage(){
        Assert.assertEquals(Driver.getDriver().getTitle(), "Order purchase script onetime payment - PHPTRAVELS");
    }
}
