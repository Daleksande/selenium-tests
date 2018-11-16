package ru.raiffeisen.steps;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import ru.raiffeisen.util.DriverManager;
import ru.raiffeisen.util.TestProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {

    public static Properties properties = TestProperties.getInstance().getProperties();

    @Before
    public void startScenario() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(properties.getProperty("app.url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @After
    public void afterScenario() {

    }
}
