package com.phptravels.pages;

import com.phptravels.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewsletterPage {

    public NewsletterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void verifyUserInNewsletterPage(){
        Assert.assertEquals(Driver.getDriver().getTitle(), "Newsletter module features - PHPTRAVELS");
    }

}
