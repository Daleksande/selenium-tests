package ru.raiffeisen.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.raiffeisen.annotation.FieldName;
import ru.raiffeisen.util.DriverManager;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class MainPage extends BasePageObject {

    @FindBy(xpath = "//ul[@class='main-menu']//li")
    public List<WebElement> mainMenu;

    @FindBy(xpath = "//a[contains(@class,'menu-section-link')][@href]")
    public List<WebElement> subMenu;

    @FindBy(xpath = "//*[text()='Да']")
    public WebElement acceptRegion;

//    @FindBy(xpath = "//div[text()='В путешествие']/parent::div/following-sibling::a")
//    @FieldName(name = "В путешествие")
//    public WebElement toTravel;

//    public void click(String name) throws Exception {
//        WebElement element = getField(name);
//        click(element);
//    }
//
//    public WebElement getField(String name) throws Exception {
//        Class example = Class.forName("ru.raiffeisen.pages.MainPage");
//        List<Field> fields = Arrays.asList(example.getFields());
//        for (Field field : fields){
//            if (field.getAnnotation(FieldName.class).name().equals(name)){
//                return DriverManager.getDriver().findElement(By.xpath(field.getAnnotation(FindBy.class).xpath()));
//            }
//        }
//        Assert.fail("Не объявлен элемент с наименованием " + name);
//        return null;
//    }

}