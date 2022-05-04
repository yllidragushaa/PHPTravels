package com.phptravels.pages;

import com.phptravels.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DemoPage {
    public DemoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void verifyUserOnDemoPage(){
        Assert.assertEquals(Driver.getDriver().getTitle(),  "Demo Script Test drive - PHPTRAVELS");
    }
}
