package com.phptravels.pages;

import com.phptravels.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

import org.testng.Assert;


public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void verifyElement(String expected, WebElement actual) {
        Assert.assertEquals(actual.getText(), expected);
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


    @FindBy(xpath = "(//div[@class='dropdown-content featuresDropdown'])[1]")
    public WebElement feauteresDropDown;

    @FindBy(xpath = "(//div[@class='dropdown-content featuresDropdown'])[2]")
    public WebElement productDropDown;

    @FindBy(xpath = "(//div/a[@class='lvl-0 link nav-link'])[4]")
    public WebElement requirements;


    @FindBy(xpath = "//a[.='Newsletter Module']")
    public WebElement newsLetterModule;


    @FindBy(xpath = "//p[.='All the major e-payment gatways are accepted here including Paypal, Credit Card, Western Union, Skrill, Bitcoin, Transferwise.']")
    public WebElement paymentMethods;


    @FindBy(xpath = "//a[@class='lvl-0 link nav-link']")
    public WebElement demopage;


    @FindBy(xpath = "(//a[.='Desktop App'])[2]")
    public WebElement desktopApp;

    @FindBy(xpath = "//a[.='CMS Module']")
    public WebElement cmsModule;


    public WebElement SocialMedias(int indexOfSocialMedia) {

        String a = "(//a[@class='lvl-0 link social'])[" + indexOfSocialMedia + "]";
        WebElement socialmedias = Driver.getDriver().findElement(By.xpath(a));

        return socialmedias;
    }

}
