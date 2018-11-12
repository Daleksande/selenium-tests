import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TransferTest extends BaseTest {

    @Test
    public void transferTest() {

        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");
        click(driver.findElement(By.xpath("//a[text()='Сервисы']")));
        click(driver.findElement(By.xpath("//div[@id='menu6']//a[text()='Переводы по карте/телефону']")));
        present(driver.findElement(By.xpath("//h1[contains(text(),'Перевод с карты на карту / по номеру телефона')]")));
        fillField(driver.findElement(By.xpath("//input[@placeholder=\"Номер карты отправителя\"]")), "5406571518194617");
        fillField(driver.findElement(By.xpath("//input[@placeholder=\"Номер карты получателя\"]")), "5367433138590699");
        fillField(driver.findElement(By.xpath("//input[@placeholder=\"ММ\"]")), "01");
        fillField(driver.findElement(By.xpath("//input[@placeholder=\"ГГ\"]")), "21");
        fillField(driver.findElement(By.xpath("//input[@placeholder=\"CVC2\"]")), "512");
        fillField(driver.findElement(By.xpath("//input[contains(@placeholder,'Сумма перевода')]")), "5");
        present(driver.findElement(By.xpath("//div[@class='c2c__error' and text()='Минимальная сумма перевода – 10 р.']")));

    }

}
