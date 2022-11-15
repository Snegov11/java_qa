package org.java.qa.selenium.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void goToAddContactsPage() {
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='nav']/ul/li[2]")).click();
    }
}
