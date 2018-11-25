package ru.raiffeisen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.raiffeisen.annotation.FieldName;

public class VbcPage extends BasePageObject {

    @FindBy(xpath = "//div[@class='b-intro__block-buttons']/a[text()='Оставить заявку']")
    @FieldName(name = "Оставить заявку")
    public WebElement putTiket;

    @FindBy(xpath = "//h1[@class='e-title e-title--h2']")
    @FieldName(name = "Заголовок")
    public WebElement header;

    @FindBy(xpath = "//div[text()='Продукт']/preceding-sibling::span/span[contains(@class,'ui-selectmenu-text')]")
    @FieldName(name = "Продукт")
    public WebElement product;

    @FindBy(xpath = "//input[@placeholder='Фамилия']")
    @FieldName(name = "Фамилия")
    public WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Имя']")
    @FieldName(name = "Имя")
    public WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Отчество']")
    @FieldName(name = "Отчество")
    public WebElement surname;

    @FindBy(xpath = "//input[@placeholder='Дата Рождения']")
    @FieldName(name = "Дата рождения")
    public WebElement bithdate;

    @FindBy(xpath = "//div[text()='Номер телефона']/preceding-sibling::input")
    @FieldName(name = "Номер телефона")
    public WebElement phone;

    @FindBy(xpath = "//input[@placeholder='Электронная почта']")
    @FieldName(name = "Электронная почта")
    public WebElement email;

    @FindBy(xpath = "//div[text()='Проверочный код']/preceding-sibling::input")
    @FieldName(name = "Проверочный код")
    public WebElement validateCode;

    @FindBy(xpath = "//input[@id='form_f8887a1640']/following-sibling::span")
    @FieldName(name = "Согласие на обработку данных")
    public WebElement confirmCheckbox;

    @FindBy(xpath = "//button[@id='btn_submit']")
    @FieldName(name = "Отправить")
    public WebElement sent;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "ru.raiffeisen.pages.VbcPage");
    }

}
