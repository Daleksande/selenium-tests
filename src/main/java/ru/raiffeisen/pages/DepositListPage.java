package ru.raiffeisen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DepositListPage extends BasePageObject {

    @FindBy(xpath = "//div[@class='b-card__content']")
    public List<WebElement> depositCollection;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "ru.raiffeisen.pages.DepositListPage");
    }
}