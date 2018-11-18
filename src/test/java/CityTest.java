//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//
//public class CityTest extends BaseTest {
//
//    @Test
//    public void cityTest() {
//
//        WebDriver driver = getDriver();
//        driver.get("https://www.raiffeisen.ru/");
//        click(driver.findElement(By.xpath("//span[contains(@class,'city-icon')]")));
//        click(driver.findElement(By.xpath("//a[text()='Владимир']")));
//        present(driver.findElement(By.xpath("//a[contains (text(),'Владимир') and contains (@class, 'region-active' )]")));
//        scrollBottom();
//        present(driver.findElement(By.xpath("//a[text()='Карьера в банке']")));
//        present(driver.findElement(By.xpath("//a[text()='Реквизиты']")));
//        present(driver.findElement(By.xpath("//a[text()='Качество обслуживания']")));
//        present(driver.findElement(By.xpath("//a[text()='Противодействие коррупции']")));
//    }
//
//}