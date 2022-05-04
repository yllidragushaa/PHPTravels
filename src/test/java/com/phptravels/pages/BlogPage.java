package com.phptravels.pages;

import com.phptravels.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BlogPage {

    @FindBy(xpath = "//h2[.='The perfect Blogging Module']")
    public WebElement actualResult;

    public BlogPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void verifyBlogPage(String firstString, WebElement element){
        Assert.assertEquals(element.getText(),firstString);

    }

}
