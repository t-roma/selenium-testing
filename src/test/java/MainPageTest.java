import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPageTest extends BaseTest {

    @BeforeClass
    public static void enterMainPage() {
        driver.get("http://localhost/litecart/");
    }

    @Test
    public void checkProductStickers() {

        List<WebElement> popularProducts = driver.findElements(By.cssSelector("div#box-most-popular li"));
        List<WebElement> campaignProducts = driver.findElements(By.cssSelector("div#box-campaigns li"));
        List<WebElement> latestProducts = driver.findElements(By.cssSelector("div#box-latest-products li"));

        for (WebElement popularProduct : popularProducts) {
            List<WebElement> stickers = popularProduct.findElements(By.cssSelector("div.sticker"));
            Assert.assertEquals(stickers.size(), 1);
        }
        for (WebElement campaignProduct : campaignProducts) {
            List<WebElement> stickers = campaignProduct.findElements(By.cssSelector("div.sticker"));
            Assert.assertEquals(stickers.size(), 1);
        }
        for (WebElement latestProduct : latestProducts) {
            List<WebElement> stickers = latestProduct.findElements(By.cssSelector("div.sticker"));
            Assert.assertEquals(stickers.size(), 1);
        }
    }
}
