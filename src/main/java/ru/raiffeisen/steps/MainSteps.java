package ru.raiffeisen.steps;

import ru.raiffeisen.pages.MainPage;

public class MainSteps {

    MainPage mainPage = new MainPage();

    @When("выбран пункт меню \"(.*)"")
    public void selectMenuItem(String itemName){
        mainPage.selectMenuItem(mainPage.mainMenu, itemName);
    }

    public void selectSubMenuItem(String itemName){
        mainPage.selectMenuItem(mainPage.subMenu, itemName);
    }

    public void acceptRegion() {
        mainPage.click(mainPage.acceptRegion);
    }

}
