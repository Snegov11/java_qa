package org.java.qa.selenium.group.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroupPage() {
        click(By.xpath("//li[@class='admin']"));
    }

    public void goToAddContactsPage() {
        click(By.xpath("//body/div[@id='container']/div[@id='nav']/ul/li[2]"));
    }
}
