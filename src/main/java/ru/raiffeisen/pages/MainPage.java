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
    @FieldName(name = "Пункт меню")
    public List<WebElement> mainMenu;

    @FindBy(xpath = "//a[contains(@class,'main-menu__link')]")
    @FieldName(name = "Подпункт меню")
    public List<WebElement> subMenu;

    @FindBy(xpath = "//*[text()='Да']")
    @FieldName(name = "Подтвердить регион")
    public WebElement acceptRegion;

    @FindBy(xpath = "//div[text()='В путешествие']/parent::div/following-sibling::a")
    @FieldName(name = "В путешествие")
    public WebElement goToTravel;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "ru.raiffeisen.pages.MainPage");
    }
}