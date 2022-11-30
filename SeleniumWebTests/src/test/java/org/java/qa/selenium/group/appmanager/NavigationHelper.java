package org.java.qa.selenium.group.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroupPage() {
        if (isElementPresent(By.name("new"))) {
            return;
        }
        click(By.xpath("//li[@class='admin']"));
    }

    public void goToAddContactsPage() {
        if (isElementPresent(By.name("quickadd"))) {
            return;
        }
        click(By.xpath("//body/div[@id='container']/div[@id='nav']/ul/li[2]"));
    }

    public void returnToContactPage() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
        click(By.xpath("//body/div[@id='container']/div[@id='nav']/ul/li[1]"));
    }
}
