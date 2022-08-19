import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class RegistrationTest {


    @Test
    void basicRegistrationTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("https://automationexercise.com/login");
        driver.findElement(By.cssSelector("[data-qa='signup-name']")).sendKeys("Test Name");
        sleep(1500);
        driver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys("1random_test1@gmail.com");
        sleep(1500);
        driver.findElement(By.cssSelector("[data-qa='signup-button']")).click();
        sleep(1500);
    }
}
