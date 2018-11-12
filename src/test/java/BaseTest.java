import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriverWait wait;

    private static WebDriver driver;

    static WebDriver getDriver() { return driver; }

    @Before
    public void startScenario() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 60);

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void afterMethod() {
        driver.quit();
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void present (WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }

    public void isEnabled (WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
        element.sendKeys(Keys.TAB);
    }

    public void scrollBottom() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

//    assertEquals () {
//
//    }

}
