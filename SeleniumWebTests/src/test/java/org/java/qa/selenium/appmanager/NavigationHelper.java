package org.java.qa.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void goToGroupPage() {
        driver.findElement(By.xpath("//li[@class='admin']")).click();
    }
}
