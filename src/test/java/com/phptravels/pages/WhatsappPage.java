package com.phptravels.pages;

import com.phptravels.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Set;

public class WhatsappPage {
    public WhatsappPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void switchToWhatsappWindow(){
        String mainWindow = Driver.getDriver().getWindowHandle();
        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        for (String window : allWindows) {
            if (Driver.getDriver().getWindowHandle().equals(mainWindow)){
                Driver.getDriver().switchTo().window(window);
            }
        }
    }

    public void verifyUserOnWhatsappPage(){

        Assert.assertEquals(Driver.getDriver().getTitle(), "Share on WhatsApp");
    }
}
