package ru.raiffeisen.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.raiffeisen.annotation.FieldName;
import ru.raiffeisen.util.DriverManager;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public abstract class BasePageObject {
    WebDriverWait wait  = new WebDriverWait(DriverManager.getDriver(), 60);

    public BasePageObject() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public void fillField(WebElement field, String value) throws InterruptedException {
//        field.clear();
//        field.sendKeys(value);
//        field.sendKeys(Keys.TAB);
        field.click();
        field.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        field.sendKeys(Keys.DELETE);
        field.sendKeys(value);
        field.sendKeys(Keys.TAB);
    }

    public void fillField(String name, String value) throws Exception {
        WebElement element = getField(name);
        fillField(element, value);
    }

    public void click(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void click(String name) throws Exception {
        WebElement element = getField(name);
        click(element);
    }

    public void selectMenuItem(List<WebElement> menuItems, String itemName){
        for (WebElement item : menuItems ){
            if (item.getText().equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элмент коллеции - " + itemName);
    }

    public boolean hasClass(WebElement element) {
        String classes = element.getAttribute("class");
        for (String c : classes.split(" ")) {
            if (c.equals("loading")) {
                return true;
            }
        }
        return false;
    }

    public void selectInput(String name, String value) throws Exception  {
        WebElement element = getField(name);
//        Thread.sleep(3000);
        boolean isDisplay = true;
        int i = 0;
        while(isDisplay == true || i == 100) {
            isDisplay =  hasClass(element.findElement(By.xpath("//div[contains(@class,'helpers-params')]")));
            i = i++;
        }
        element.click();
        element.findElement(By.xpath("//li/div[contains(text(),'" + value + "')]")).click();
    }

    public void scrollAndClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("return arguments[0].scrollIntoView(false);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public abstract WebElement getField(String name) throws Exception;

    public WebElement getField(String name, String className) throws Exception {
        Class example = Class.forName(className);
        List<Field> fields = Arrays.asList(example.getFields());
        for (Field field : fields){
            if (field.getAnnotation(FieldName.class).name().equals(name)){
                return DriverManager.getDriver().findElement(By.xpath(field.getAnnotation(FindBy.class).xpath()));
            }
        }
        Assert.fail("Не объявлен элемент с наименованием " + name);
        return null;
    }

}