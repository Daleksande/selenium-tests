package ru.raiffeisen.steps;

import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.raiffeisen.pages.BasePageObject;

public class ScenarioSteps {

    static String currentPageName;

    @When("загружена страница \"(.*)\"")
    public void stepPageLoaded(String pageName){
        currentPageName = pageName;
    }

    @When("выполнено нажатие на \"(.*)\"")
    public void click(String name) throws Exception {
        Class example = Class.forName("ru.raiffeisen.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.click(name);
        Thread.sleep(3000);
    }

    @When("выпадающий список \"(.*)\" заполняется значением \"(.*)\"")
    public void selectInput(String name, String value) throws Exception {
        Class example = Class.forName("ru.raiffeisen.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.selectInput(name, value);
    }

    @When("проверяю, что элемент \"(.*)\" содержит текст \"(.*)\"")
    public void checkText(String name, String value) throws Exception {
        Class example = Class.forName("ru.raiffeisen.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        Assert.assertEquals(value, page.getField(name).getText());
    }

    @When("поле \"(.*)\" заполняется значением \"(.*)\"")
    public void fillField(String name, String value) throws Exception {
        Class example = Class.forName("ru.raiffeisen.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.fillField(name, value);
    }

    @When("проверяю, что элемент \"(.*)\" доступен")
    public void checkIsEnabled(String name) throws Exception {
        Class example = Class.forName("ru.raiffeisen.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        Assert.assertTrue("Кнопка - "+ name +" не активна", page.getField(name).isEnabled());
    }

}
