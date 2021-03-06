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


public class DepositPage extends BasePageObject {

    @FindBy(xpath = "//a[text()='Оставить заявку'][@class='button']")
    @FieldName(name = "Оставить заявку")
    public WebElement requestBtn;

    @FindBy(xpath = "//*[text()='Фамилия']/parent::div/input")
    @FieldName(name = "Фамилия")
    public WebElement surname;

    @FindBy(xpath = "//*[text()='Имя']/parent::div/input")
    @FieldName(name = "Имя")
    public WebElement name;

    @FindBy(xpath = "//*[text()='Отчество']/parent::div/input")
    @FieldName(name = "Отчество")
    public WebElement middleName;

    @FindBy(xpath = "//*[text()='Дата рождения']/parent::div/input")
    @FieldName(name = "Дата рождения")
    public WebElement birthDate;

    @FindBy(xpath = "//*[text()='Телефон']/parent::div/input")
    @FieldName(name = "Телефон")
    public WebElement phone;

    @FindBy(xpath = "//*[text()='Город']/parent::div/div")
    @FieldName(name = "Город")
    public WebElement city;

    @FindBy(xpath = "//*[text()='Отделение банка']/parent::div/div")
    @FieldName(name = "Отделение банка")
    public WebElement bank;

    @FindBy(xpath = "//*[text()='Выслать код']")
    @FieldName(name = "Выслать код")
    public WebElement sentCode;

    @FindBy(xpath = "//div[@class='page-item__invalid'][.//div[text()='Осталось заполнить поля:']]//span[text()='Телефон']")
    @FieldName(name = "Осталось заполнить Телефон")
    public WebElement notFilledField;

    @FindBy(xpath = "//*[contains(text(),'подтверждаю')]/..")
    @FieldName(name = "Я подтверждаю")
    public WebElement acceptCheckBox;

    public void fillField(String name, String value) throws Exception {
        WebElement element = getField(name);
        fillField(element, value);
    }

    public void click(String name) throws Exception {
        WebElement element = getField(name);
        click(element);
    }

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "ru.raiffeisen.pages.DepositPage");
    }

}
