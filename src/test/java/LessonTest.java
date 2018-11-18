//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class LessonTest extends BaseTest {
//
//    @Test
//    public void testMethod() {
//
//        WebDriver driver = getDriver();
//        driver.get("https://online.raiffeisen.ru/demo/#/favourites");
//        click(driver.findElement(By.xpath("//icon-close")));
//        click(driver.findElement(By.xpath("//span[text()='Перевести']/..")));
//        click(driver.findElement(By.xpath("//div[text()='Клиенту банка']/..")));
//        selectInput(driver.findElement(By.xpath("//span[text()='Выберите…']/..")), "Мой счет в рублях");
//        click(driver.findElement(By.xpath("//*[text()='По номеру телефона']")));
//        fillField(driver.findElement(By.xpath("//input[@id='RcFormControl-27']")), "79031234567");
//
//        Assert.assertEquals("Сидоров П.И.",
//                driver.findElement(By.xpath("//div[@class='rc-row__static-value']")).getText().trim()
//                );
//
//        fillField(driver.findElement(By.xpath("//input[@placeholder='Сумма']")), "0");
//        Assert.assertEquals("Сумма перевода должна быть больше 0",
//                driver.findElement(By.xpath("//ruble-transfer-form-amount//span[@class='simple-error']")).getText().trim()
//        );
//
//        fillField(driver.findElement(By.xpath("//input[@placeholder='Сумма']")), "20000000000");
//        Assert.assertEquals("Введенная сумма превышает максимально допустимую (1 000 000,00 \u20BD)",
//                driver.findElement(By.xpath("//ruble-transfer-form-amount//span[@class='simple-error']")).getText().trim()
//        );
//
//        fillField(driver.findElement(By.xpath("//input[@placeholder='Сумма']")), "100");
//        fillField(driver.findElement(By.xpath("//*[@id='RcFormControl-38']")), "test");
//
//        click(driver.findElement(By.xpath("//span[text()='Перевести']/ancestor::button")));
//
//        Assert.assertEquals("40817810000000001236",
//                driver.findElement(By.xpath("//div[text()='Списать со счета:']/following-sibling::div")).getText().trim()
//        );
//
//        Assert.assertEquals("79031234567",
//                driver.findElement(By.xpath("//div[text()='По номеру телефона:']/following-sibling::div")).getText().trim()
//        );
//
//        Assert.assertEquals("Сидоров Петр Иванович",
//                driver.findElement(By.xpath("//div[text()='ФИО получателя:']/following-sibling::div")).getText().trim()
//        );
//
//        Assert.assertEquals("100,00 \u20BD",
//                driver.findElement(By.xpath("//div[text()='Сумма перевода:']/following-sibling::div")).getText().trim()
//        );
//
//        Assert.assertEquals("Комиссия не взимается",
//                driver.findElement(By.xpath("//div[text()='Комиссия']/following-sibling::div")).getText().trim()
//        );
//
//    }
//
//    public void selectInput(WebElement select, String value) {
//        select.click();
//        click(select.findElement(By.xpath("//*[text()='"+ value +"']")));
//    }
//}