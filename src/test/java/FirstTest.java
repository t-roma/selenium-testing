import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    private WebDriver driver;

    @Test
    public void start() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.quit();
    }
}
