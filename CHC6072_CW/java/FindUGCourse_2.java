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

import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FindUGCourse_2 {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.gecko.driver", "Z:\\大四文件\\Software Analysis and Testing (SE) (Joojo Walker,Albert Xu)\\Practice\\Env\\geckodriver.exe");
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void scenario5() {
    driver.get("https://www.brookes.ac.uk//");
    driver.manage().window().setSize(new Dimension(1295, 695));
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"js-header\"]/div/ul/li[1]/a"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.xpath("//*[@id=\"js-header\"]/div/ul/li[1]/a")).click();
    vars.put("num", js.executeScript("return 1"));
    do {
      vars.put("num", js.executeScript("return arguments[0]+1", vars.get("num")));
      {
        List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/study/\')]"));
        assert(elements.size() > 0);
      }
      driver.findElement(By.xpath("//a[contains(@href, \'/study/\')]")).click();
    } while ((Boolean) js.executeScript("return (arguments[0]<5)", vars.get("num")));
    vars.put("label", driver.findElement(By.xpath("//a[contains(@href, \'/study/\')]")).getText());
    if ((Boolean) js.executeScript("return (arguments[0]===\'Study\')", vars.get("label"))) {
      vars.put("output", js.executeScript("return \"Study\""));
    }
    assertEquals(vars.get("output").toString(), "Study");
    driver.findElement(By.xpath("//a[contains(@href, \'/study/\')]")).click();//
    WebElement parent=driver.findElement(By.xpath("//a[contains(@href, \'/study/\')]"));
    Actions builder=new Actions(driver);
    builder.moveToElement(parent).perform();
    WebElement sub=driver.findElement(By.xpath("//strong[contains(.,\'Study\')]"));
    sub.click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"content\"]/section[4]/div/div/div/section[4]/div/div/div[1]/div/a"));
      assert(elements.size() > 0);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"onetrust-style\"]")));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt=\'Undergraduate\']")));
    //WebElement webElement = driver.findElement(By.cssSelector("p.onetrust-policy-text"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
    //WebElement element1 = driver.findElement(By.xpath("//*[@id=\"onetrust-style\"]"));
    //element1.click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/section[4]/div/div/div/section[4]/div/div/div[1]")).click();
    js.executeScript("window.scrollTo(0,500)");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"content\"]/section[4]/div/div/div/section[1]/div/div/div/div/div/div[2]/div"));
      assert(elements.size() > 0);
    }
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
    //wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class*=\"pc-btn-container\"]")));
    wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\'cf-search-input\']")));
    driver.findElement(By.xpath("//input[@id=\'cf-search-input\']")).click();
    driver.findElement(By.xpath("//input[@id=\'cf-search-input\']")).sendKeys("computer science");
    vars.put("course", driver.findElement(By.xpath("//input[@id=\'cf-search-input\']")).getAttribute("value"));
    vars.put("course_array", js.executeScript("return [\"computer science\",\" artificial intelligence\",\"information technology\"]"));
    ArrayList collectionCourse_array = (ArrayList) vars.get("course_array");
    for (int iIterator = 0; iIterator < collectionCourse_array.size() - 1; iIterator++) {
      vars.put("iterator", collectionCourse_array.get(iIterator));
      if ((Boolean) js.executeScript("return (arguments[0]===arguments[1])", vars.get("iterator"),vars.get("course"))) {
        if ((Boolean) js.executeScript("return (arguments[0]===\'computer science\')", vars.get("iterator"))) {
          vars.put("output", js.executeScript("return \"computer science\""));
        } else {
          System.out.println(vars.get("iterator").toString());
        }
      }
    }
    assertEquals(vars.get("output").toString(), "computer science");
    driver.findElement(By.xpath("//select[@id=\'search-dropdown\']")).click();
    driver.findElement(By.xpath("//input[@id=\'cf-search-input\']")).click();
    {
      WebElement element = driver.findElement(By.xpath("//button[contains(.,\'Search\')]"));
      Actions builder1 = new Actions(driver);
      builder1.moveToElement(element).perform();
    }
    driver.findElement(By.xpath("//button[contains(.,\'Search\')]")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"content\"]/div[3]/div/div[1]/div/form"));
      assert(elements.size() > 0);
    }
    vars.put("input_data", driver.findElement(By.xpath("//*[@id=\"query\"]")).getAttribute("value"));
    if ((Boolean) js.executeScript("return (arguments[0]===\'computer science\')", vars.get("input_data"))) {
      vars.put("correct", js.executeScript("return \"computer science\""));
    } else {
      System.out.println(vars.get("input_data").toString());
    }
    assertEquals(vars.get("correct").toString(), "computer science");
    driver.findElement(By.xpath("//ol[@id=\'search-results\']/li[2]/h3/a")).click();
    driver.findElement(By.xpath("//span[contains(.,\'Back to top\')]")).click();
  }
}
