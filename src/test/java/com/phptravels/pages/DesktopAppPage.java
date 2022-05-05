package com.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopAppPage {

    @FindBy (xpath = "//h2[.='All Features at a Glance']")
    public WebElement desktopAppText;
}
