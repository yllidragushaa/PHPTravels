package com.phptravels.pages;

import com.phptravels.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CmsPage {

    public CmsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void verifyUserOnCmsPage(){
        Assert.assertEquals(Driver.getDriver().getTitle(),"CMS module features - PHPTRAVELS");
    }
}
