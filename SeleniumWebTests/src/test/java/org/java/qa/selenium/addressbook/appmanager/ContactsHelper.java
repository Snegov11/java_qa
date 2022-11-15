package org.java.qa.selenium.addressbook.appmanager;

import org.java.qa.selenium.addressbook.model.ContactData;
import org.java.qa.selenium.group.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContactsHelper {
    private WebDriver driver;

    public ContactsHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void fillGroup(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_parent_id")).click();
        driver.findElement(By.name("group_parent_id")).click();
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void returnToContactPage() {
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='nav']/ul/li[1]")).click();
    }

    public void submitAddContact() {
        driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void startCreationContact() {
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='nav']/ul/li[2]")).click();
        driver.findElement(By.name("address")).sendKeys("Test");
        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content']/form[@accept-charset='utf-8']/input[1]")).click();
    }

    public void fillContact(ContactData contactData) {
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).sendKeys(contactData.getMiddleName());
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getLastName());

        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).click();
        {
            WebElement element = driver.findElement(By.name("email"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys(contactData.getEmail());

        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).sendKeys(contactData.getAddress());

        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).sendKeys(contactData.getMobilePhone());
    }

}
