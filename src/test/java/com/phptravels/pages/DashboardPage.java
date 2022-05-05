package com.phptravels.pages;

import com.phptravels.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void verifyBlogPage(WebElement expectedElement, WebElement actualElement){
        Assert.assertEquals(expectedElement,actualElement);
    }

    @FindBy(xpath = "//a[@href='https://phptravels.com/demo']")
    public WebElement demoModule;

    @FindBy(xpath = "(//a[@href='https://phptravels.com/order'])[1]")
    public WebElement pricingModule;

    @FindBy(xpath = "//div[@class='whatsapp wow flash animated']")
    public WebElement whatsappIcon;

    @FindBy(xpath = "//button[@class='e1mwfyk10 lc-7qdzrc e1m5b1js0']")
    public WebElement leaveAMessageButton;

    @FindBy(xpath = "//span[.='Features']")
    public WebElement featuresSection;

    @FindBy(xpath = "//a[.='Blog Module']")
    public WebElement blogModule;

    @FindBy(xpath = "//a[@href='./contact-us']")
    public WebElement contactusicom;

    @FindBy(xpath = "//img[@src='https://phptravels.com/assets/img/home/gateway.webp']")
    public WebElement paymentMethods;

}
