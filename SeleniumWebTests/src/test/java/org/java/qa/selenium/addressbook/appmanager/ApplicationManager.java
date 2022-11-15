package org.java.qa.selenium.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.fail;

public class ApplicationManager {
    public final StringBuffer verificationErrors = new StringBuffer();
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private ContactsHelper contactsHelper;

    public WebDriver driver;

    public void init() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
        contactsHelper = new ContactsHelper(driver);
        navigationHelper = new NavigationHelper(driver);
    }

    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public ContactsHelper getContactsHelper() {
        return contactsHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
