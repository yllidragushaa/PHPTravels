package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.pages.WhatsappPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.annotations.Test;

public class ContactQazim {
    DashboardPage dashboardPage = new DashboardPage();
    WhatsappPage whatsappPage = new WhatsappPage();
    @Test
    public void contactQazimTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        dashboardPage.whatsappIcon.click();
        whatsappPage.switchToWhatsappWindow();
        whatsappPage.verifyUserOnWhatsappPage();

    }
}
