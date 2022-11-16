package org.java.qa.selenium.group.appmanager;

import org.java.qa.selenium.group.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ContactsHelper {
    private WebDriver driver;

    public ContactsHelper(WebDriver driver) {
        this.driver = driver;
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

    public void acceptDeleteContact() {
        //assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
        Assert.assertEquals(driver.switchTo().alert().getText(), "Delete 1 addresses?");
        driver.switchTo().alert().accept();
    }

    public void clickDelete() {
        driver.findElement(By.cssSelector(".left:nth-child(8) > input")).click();
    }

    public void selectContact() {
        int id = Integer.parseInt(driver.findElement(By.xpath("//input[@type='checkbox']")).getAttribute("value"));
        driver.findElement(By.xpath("//input[@id='"+id+"']")).click();
    }

}
