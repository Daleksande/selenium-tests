//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class LessonTest2 extends BaseTest {
//
//    @Test
//    public void testMethod() {
//
//        WebDriver driver = getDriver();
//
//        driver.get("https://online.raiffeisen.ru/demo/#/favourites");
//
//        click(driver.findElement(By.xpath("//icon-close")));
//
//        click(driver.findElement(By.xpath("//span[text()='Шаблоны и автоплатежи']/..")));
//        selectInput(driver.findElement(By.xpath("//span[text()='Выберите операцию']/..")), "Мобильная связь");
//
//        click(driver.findElement(By.xpath("//button[text()='Создать']")));
//
//        fillField(driver.findElement(By.xpath("//input[contains(@class,'phone__input')]")), "79031234567");
//
//        selectInput(driver.findElement(By.xpath("//span[text()='Выберите…']/..")), "Кредитка Visa");
//
//        fillField(driver.findElement(By.xpath("//input[@placeholder='Сумма']")), "29.98");
//
//        Assert.assertEquals("Введенная сумма меньше минимальной разрешенной (30,00 \u20BD)",
//                driver.findElement(By.xpath("//span[@class='simple-error']")).getText().trim()
//        );
//
//        fillField(driver.findElement(By.xpath("//input[@placeholder='Сумма']")), "16000");
//
//        Assert.assertEquals("Введенная сумма превышает максимально допустимую (14 999,99 \u20BD)",
//                driver.findElement(By.xpath("//span[@class='simple-error']")).getText().trim()
//        );
//
//
//    }
//
//    public void selectInput(WebElement select, String value) {
//        select.click();
//        click(select.findElement(By.xpath("//*[text()='"+ value +"']")));
//    }
//}