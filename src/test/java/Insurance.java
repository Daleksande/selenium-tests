//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class Insurance extends BaseTest {
//
//    @Test
//    public void insuranceTest() {
//        WebDriver driver = getDriver();
//        driver.get("https://www.raiffeisen.ru/");
//        click(driver.findElement(By.xpath("//a[text()='Страхование']")));
//        click(driver.findElement(By.xpath("//div[text()='В путешествие']/parent::div/following-sibling::a")));
//        click(driver.findElement(By.xpath("//div[@class='b-intro__block-buttons']/a[text()='Оставить заявку']")));
//        Assert.assertEquals("Форма заявки на страховую программу",
//                driver.findElement(By.xpath("//h1[@class='e-title e-title--h2']")).getText().trim()
//        );
//        Assert.assertEquals("Вояж (Комфорт/Бизнес класс/Первый класс)",
//                driver.findElement(By.xpath("//div[text()='Продукт']/preceding-sibling::span/span[contains(@class,'ui-selectmenu-text')]")).getText().trim()
//        );
//        fillField(driver.findElement(By.xpath("//input[@placeholder='Фамилия']")), "Волынин");
//        fillField(driver.findElement(By.xpath("//input[@placeholder='Имя']")), "Илья");
//        fillField(driver.findElement(By.xpath("//input[@placeholder='Отчество']")), "Павлович");
//        fillField(driver.findElement(By.xpath("//input[@placeholder='Дата Рождения']")), "01.01.1986");
//        fillField(driver.findElement(By.xpath("//div[text()='Номер телефона']/preceding-sibling::input")), "9031234567");
//        fillField(driver.findElement(By.xpath("//input[@placeholder='Электронная почта']")), "test@test.ru");
//        fillField(driver.findElement(By.xpath("//div[text()='Проверочный код']/preceding-sibling::input")), "test");
//        click(driver.findElement(By.xpath("//input[@id='form_f8887a1640']/following-sibling::span")));
//        isEnabled(driver.findElement(By.xpath("//button[@id='btn_submit']")));
//    }
//
//}