package org.java.qa.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class TestBase {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login("admin", "secret");
    }

    protected void login(String userName, String password) {
        driver.get("http://localhost/addressbook/");
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(userName);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    protected void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    protected void fillGroup(GroupData groupData) {
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

    protected void createNewGroup() {
        driver.findElement(By.name("new")).click();
    }

    protected void goToGroupPage() {
        goToGroupPage(By.xpath("//li[@class='admin']"));
    }

    protected void returnToGroupPage() {
        goToGroupPage(By.xpath("//li[@class='admin']"));
    }

    protected void goToGroupPage(By xpath) {
        driver.findElement(xpath).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    protected void deleteGroups() {
        driver.findElement(By.name("delete")).click();
    }

    protected void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }
}
