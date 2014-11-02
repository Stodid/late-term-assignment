package is.stodid.tictactoe;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TicWebTest {

    static WebDriver driver;
    static String baseUrl;
    static String port;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass
    public static void before() {
        // Will be run before all tests in class are run
        driver = new FirefoxDriver();
        port = System.getenv("PORT");
        if(port == null) {
            port = "4567";
        }
        baseUrl = "http://localhost:" + port;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void after() {
        // Will be run after all tests in class have run
        driver.close();
    }

    @Before
    public void setup() {
        // Will be run before each test in class is run
        ;
    }

    @Test
    public void assertTitle() {
        driver.get(baseUrl + "/");
        assertEquals("Tic Tac Toe", driver.getTitle());
    }

      @Test
      public void test1() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("restart")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [clickAt | id=0 | ]]
        assertEquals("x", driver.findElement(By.id("0")).getText());
        driver.findElement(By.id("8")).click();
        assertEquals("o", driver.findElement(By.id("8")).getText());
        driver.findElement(By.id("2")).click();
        assertEquals("x", driver.findElement(By.id("2")).getText());
        driver.findElement(By.id("4")).click();
        assertEquals("o", driver.findElement(By.id("4")).getText());
        assertEquals("Player 1's turn", driver.findElement(By.cssSelector("h2.text-center")).getText());
        driver.findElement(By.id("3")).click();
        assertEquals("x", driver.findElement(By.id("3")).getText());
        driver.findElement(By.id("5")).click();
        assertEquals("o", driver.findElement(By.id("5")).getText());
        driver.findElement(By.id("6")).click();
        assertEquals("x", driver.findElement(By.id("6")).getText());
        assertEquals("Player 1 won!", driver.findElement(By.cssSelector("h2.text-center")).getText());
  }

  @After
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

