import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdminPageTest extends BaseTest {

    @BeforeClass
    public static void enterAdminPage() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

    @Test
    public void menuTest() {
        List<WebElement> listMenu = driver.findElements(By.cssSelector("li#app-"));

        for (int i = 0; i<listMenu.size(); i++) {
            listMenu = driver.findElements(By.cssSelector("li#app-"));
            listMenu.get(i).click();
            Assert.assertTrue(isElementPresent(driver, By.cssSelector("h1")));

            List<WebElement> nestedElements = driver.findElements(By.cssSelector("li#app- li"));
            for (int j = 0; j < nestedElements.size(); j++) {
                nestedElements.get(j).click();
                Assert.assertTrue(isElementPresent(driver, By.cssSelector("h1")));
                nestedElements = driver.findElements(By.cssSelector("li#app- li"));
            }
        }
    }
}
