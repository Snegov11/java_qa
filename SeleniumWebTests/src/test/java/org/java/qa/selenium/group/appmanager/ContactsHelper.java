package org.java.qa.selenium.group.appmanager;

import org.java.qa.selenium.group.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactsHelper extends HelperBase {

    public ContactsHelper(WebDriver driver) {
        super(driver);
    }

    public void submitAddContact() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void startCreationContact() {
        click(By.xpath("//body/div[@id='container']/div[@id='nav']/ul/li[2]"));
        driver.findElement(By.name("address")).sendKeys("Test");
        click(By.xpath("//body/div[@id='container']/div[@id='content']/form[@accept-charset='utf-8']/input[1]"));
    }

    public void fillContact(ContactData contactData, boolean creation) {
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("email"), contactData.getEmail());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getMobilePhone());
        if (creation) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.name("new_group")));
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void acceptDeleteContact() {
        Assert.assertEquals(driver.switchTo().alert().getText(), "Delete 1 addresses?");
        driver.switchTo().alert().accept();
    }

    public void clickDelete() {
        click(By.cssSelector(".left:nth-child(8) > input"));
    }

    public void selectContact() {
        int id = Integer.parseInt(driver.findElement(By.xpath("//input[@type='checkbox']")).getAttribute("value"));
        click(By.xpath("//input[@id='"+id+"']"));
    }

    public void initContactModification() {
        int id = Integer.parseInt(driver.findElement(By.xpath("//input[@type='checkbox']")).getAttribute("value"));
        click(By.xpath("//a[@href='edit.php?id="+id+"']"));
    }

    public void updateContact() {
        click(By.name("update"));
    }
}
