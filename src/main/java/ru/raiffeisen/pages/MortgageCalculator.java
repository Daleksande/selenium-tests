package ru.raiffeisen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.raiffeisen.annotation.FieldName;

public class MortgageCalculator extends BasePageObject {
    @FindBy(xpath = "//h1")
    @FieldName(name = "Заголовок первого уровня")
    public WebElement mainHeader;

    @FindBy(xpath = "//div[contains(text(),'Город')]/preceding-sibling::span")
    @FieldName(name = "Город")
    public WebElement cityList;

    @FindBy(xpath = "//div[contains(text(),'Вид ипотечной программы')]/parent::div")
    @FieldName(name = "Вид ипотечной программы")
    public WebElement mortgageProgrammType;

    @FindBy(xpath = "//div[contains(text(),'Я являюсь')]/preceding-sibling::span")
    @FieldName(name = "Я являюсь")
    public WebElement clientTypeList;

    @FindBy(xpath = "//div[contains(text(),'Уровень доходов подтверждаю')]/preceding-sibling::span")
    @FieldName(name = "Уровень доходов подтверждаю")
    public WebElement salaryConfirm;

    @FindBy(xpath = "//*[@id='form_is_program']/following-sibling::span")
    @FieldName(name = "Знаю свою ипотечную программу")
    public WebElement iKnowMyMortgageProgramm;

    @FindBy(xpath = "//div[contains(text(),'В банке возьму')]/preceding-sibling::input")
    @FieldName(name = "В банке возьму")
    public WebElement blackMoney;

    @FindBy(xpath = "//div[contains(text(),'Первоначальный взнос')]/preceding-sibling::input")
    @FieldName(name = "Первоначальный взнос")
    public WebElement firstRepay;

    @FindBy(xpath = "//div[contains(text(),'Срок кредита')]/preceding-sibling::input")
    @FieldName(name = "Срок кредита")
    public WebElement loanTime;

    @FindBy(xpath = "//input[@value='Рассчитать']")
    @FieldName(name = "Рассчитать")
    public WebElement calculateBtn;

    @FindBy(xpath = "//span[contains(text(),'Ежемесячный платеж')]/following::span[@class='monthly-payment']")
    @FieldName(name = "Ежемесячный платеж")
    public WebElement monthlyPay;

    @FindBy(xpath = "//div[contains(text(),'Общая сумма выплат')]/following-sibling::div")
    @FieldName(name = "Общая сумма выплат")
    public WebElement allPay;

    @FindBy(xpath = "//div[contains(text(),'Cумма выплат по процентам')]/following-sibling::div")
    @FieldName(name = "Cумма выплат по процентам")
    public WebElement allPayPc;

    @FindBy(xpath = "//div[contains(text(),'Процентная ставка')]/following-sibling::div")
    @FieldName(name = "Процентная ставка")
    public WebElement pcValue;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "ru.raiffeisen.pages.MortgageCalculator");
    }
}
