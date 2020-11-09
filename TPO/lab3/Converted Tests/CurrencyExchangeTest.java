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
public class CurrencyExchangeTest {
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
  public void currencyExchange() {
    driver.get("https://mailchimp.com//");
    driver.manage().window().setSize(new Dimension(1550, 838));
    driver.findElement(By.xpath("//a[contains(text(),\'Pick A Plan\')]")).click();
    js.executeScript("window.scrollTo(0,0)");
    js.executeScript("window.scrollTo(0,337.6000061035156)");
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//option[6]")).click();
    assertThat(driver.findElement(By.cssSelector(".pricingPlans__planCard:nth-child(1) .formattedPrice__price--symbol--left")).getText(), is("€"));
    driver.findElement(By.xpath("//select")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".formSelect--small > select"));
      dropdown.findElement(By.xpath("//option[. = 'R$ BRL']")).click();
    }
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//div[2]/div/div[2]/div/div[2]/div")).click();
    assertThat(driver.findElement(By.xpath("//div[2]/div/div[2]/div/div[2]/div/div")).getText(), is("R$"));
    driver.findElement(By.xpath("//select")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".formSelect--small > select"));
      dropdown.findElement(By.xpath("//option[. = '£ GBP']")).click();
    }
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//main[@id=\'content\']/div/div/div/div[2]/div[4]/div[2]/div/div[2]/div")).click();
    assertThat(driver.findElement(By.cssSelector(".pricingPlans__tableWrapper > .pricingPlans__planCard:nth-child(4) .formattedPrice__price--symbol--left")).getText(), is("£"));
    driver.findElement(By.cssSelector(".formSelect--small > select")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".formSelect--small > select"));
      dropdown.findElement(By.xpath("//option[. = '¥ JPY']")).click();
    }
    driver.findElement(By.cssSelector(".formSelect--small > select")).click();
    driver.findElement(By.cssSelector(".pricingPlans__tableWrapper > .pricingPlans__planCard:nth-child(3) .formattedPrice__price--symbol--left")).click();
    assertThat(driver.findElement(By.cssSelector(".pricingPlans__tableWrapper > .pricingPlans__planCard:nth-child(3) .formattedPrice__price--symbol--left")).getText(), is("¥"));
    driver.findElement(By.cssSelector(".formSelect--small > select")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".formSelect--small > select"));
      dropdown.findElement(By.xpath("//option[. = 'DKK kr']")).click();
    }
    driver.findElement(By.cssSelector(".formSelect--small > select")).click();
    driver.findElement(By.cssSelector(".pricingPlans__tableWrapper > .pricingPlans__planCard:nth-child(3) .pricingGrid__rowItem > .flex")).click();
    assertThat(driver.findElement(By.cssSelector(".pricingPlans__tableWrapper > .pricingPlans__planCard:nth-child(3) .formattedPrice__price--symbol--right")).getText(), is("kr"));
    driver.findElement(By.xpath("//select")).click();
    driver.findElement(By.xpath("//option[@value=\'USD\']")).click();
    assertThat(driver.findElement(By.xpath("//div[2]/div[2]/div/div[2]/div/div")).getText(), is("$"));
    driver.close();
  }
}
