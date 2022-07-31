import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    private WebDriver driver;

    @Test
    public void firstTest() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.quit();
    }
}
