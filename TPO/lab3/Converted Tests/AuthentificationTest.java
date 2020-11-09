// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AuthentificationTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void authentification() {
    // Test name: Authentification
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://mailchimp.com//");
    // 2 | setWindowSize | 1550x838 |  | 
    driver.manage().window().setSize(new Dimension(1550, 838));
    // 3 | runScript | window.scrollTo(0,11664) |  | 
    js.executeScript("window.scrollTo(0,11664)");
    // 4 | click | linkText=Websites |  | 
    driver.findElement(By.linkText("Websites")).click();
    // 5 | click | linkText=Start Building For Free |  | 
    driver.findElement(By.linkText("Start Building For Free")).click();
    // 6 | mouseOver | css=.container-NzAkN:nth-child(3) |  | 
    {
      WebElement element = driver.findElement(By.cssSelector(".container-NzAkN:nth-child(3)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 7 | click | css=.avatarImage-2aHDC |  | 
    driver.findElement(By.cssSelector(".avatarImage-2aHDC")).click();
    // 8 | mouseOver | css=.avatarImage-2aHDC |  | 
    {
      WebElement element = driver.findElement(By.cssSelector(".avatarImage-2aHDC"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 9 | mouseOut | css=.innerBorder-3P9Rz > .avatarImage-2aHDC |  | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 10 | click | linkText=Log Out |  | 
    driver.findElement(By.linkText("Log Out")).click();
    // 11 | open | https://mailchimp.com/ |  | 
    driver.get("https://mailchimp.com/");
    // 12 | click | linkText=Log In |  | 
    driver.findElement(By.linkText("Log In")).click();
    // 13 | type | xpath=//input[@id='username'] | nonameiam | 
    driver.findElement(By.xpath("//input[@id=\'username\']")).sendKeys("nonameiam");
    // 14 | pause | 3000 |  | reCAPTCHA
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 15 | click | xpath=//button[@value='log in'] |  | 
    driver.findElement(By.xpath("//button[@value=\'log in\']")).click();
    // 16 | waitForElementVisible | xpath=//div[2]/p | 5000 | 
    {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/p")));
    }
    // 17 | assertElementPresent | xpath=//div[2]/div/div/div[2]/p |  | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[2]/div/div/div[2]/p"));
      assert(elements.size() > 0);
    }
    // 18 | type | xpath=//input[@id='username'] | echernousov | 
    driver.findElement(By.xpath("//input[@id=\'username\']")).sendKeys("echernousov");
    // 19 | type | xpath=//input[@id='password'] | TANCQkg5! | 
    driver.findElement(By.xpath("//input[@id=\'password\']")).sendKeys("TANCQkg5!");
    // 20 | pause | 3000 |  | reCAPTCHA
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 21 | click | xpath=//button[@value='log in'] |  | 
    driver.findElement(By.xpath("//button[@value=\'log in\']")).click();
    // 22 | click | xpath=//a[contains(text(),'I’ll do this later')] |  | 
    driver.findElement(By.xpath("//a[contains(text(),\'I’ll do this later\')]")).click();
    // 23 | close |  |  | 
    driver.close();
  }
}
