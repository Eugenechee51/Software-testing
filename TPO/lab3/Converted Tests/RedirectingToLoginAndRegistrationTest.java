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
public class RedirectingToLoginAndRegistrationTest {
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
  public void redirectingToLoginAndRegistration() {
    driver.get("https://mailchimp.com/");
    driver.manage().window().setSize(new Dimension(1051, 806));
    driver.findElement(By.linkText("Websites")).click();
    driver.findElement(By.linkText("Start Building For Free")).click();
    driver.findElement(By.cssSelector(".avatarImage-2aHDC")).click();
    driver.findElement(By.linkText("Log Out")).click();
    driver.get("https://mailchimp.com/");
    driver.findElement(By.xpath("//nav/button")).click();
    driver.findElement(By.xpath("//div[2]/button")).click();
    driver.findElement(By.xpath("//li/button")).click();
    driver.findElement(By.xpath("//li/div/a")).click();
    driver.findElement(By.xpath("//section/div/div/div/div/a")).click();
    driver.findElement(By.xpath("//main/div/div/div")).click();
    assertThat(driver.findElement(By.xpath("//h1")).getText(), is("Log In"));
    driver.get("https://mailchimp.com/");
    driver.findElement(By.linkText("Pick A Plan")).click();
    js.executeScript("window.scrollTo(0,139.1999969482422)");
    js.executeScript("window.scrollTo(0,2240)");
    {
      WebElement element = driver.findElement(By.xpath("//div[3]/div[2]/input"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.xpath("//div[3]/div[2]/input"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.xpath("//div[3]/div[2]/input"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.xpath("//div[3]/div[2]/input")).sendKeys("11");
    driver.findElement(By.xpath("//div[3]/div[2]/input")).click();
    driver.findElement(By.xpath("//div[3]/div[2]/div[3]/div[2]/div/div[3]/a")).click();
    driver.findElement(By.xpath("//h1")).click();
    assertThat(driver.findElement(By.xpath("//h1")).getText(), is("Welcome to Mailchimp"));
    driver.get("https://mailchimp.com/");
    driver.findElement(By.linkText("Log In")).click();
    driver.findElement(By.cssSelector(".button-large")).click();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.close();
  }
}
