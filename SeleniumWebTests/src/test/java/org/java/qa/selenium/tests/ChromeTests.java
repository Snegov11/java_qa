package org.java.qa.selenium.tests;

import java.time.Duration;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ChromeTests {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }

  @Test
  public void addCountryTest() throws Exception {
    driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
    driver.findElement(By.name("FromLB")).findElement(By.xpath("//option[@value='USA']")).click();
    driver.findElement(By.xpath("//input[@value='->']")).click();
    driver.findElement(By.name("FromLB")).findElement(By.xpath("//option[@value='Russia']")).click();
    driver.findElement(By.xpath("//input[@value='->']")).click();
    driver.findElement(By.name("ToLB")).findElement(By.xpath("//option[@value='USA']")).click();
    driver.findElement(By.xpath("//input[@value='<-']")).click();
    driver.findElement(By.name("ToLB")).findElement(By.xpath("//option[@value='Russia']")).click();
    driver.findElement(By.xpath("//input[@value='<-']")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
