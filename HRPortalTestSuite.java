
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class HRPortalTestSuite {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) {
        tc01_validLogin();
        tc02_invalidPassword();
        tc03_emptyFields();
    }

    static WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", "E:/accenture/Mini_testing/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    static void login(WebDriver driver, String user, String pass) {
        driver.get(baseUrl);
        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    static void tc01_validLogin() {
        WebDriver driver = initDriver();
        login(driver, "Admin", "admin123");
        if (driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("✅ TC01: Valid Login Passed");
        }
        driver.quit();
    }

    static void tc02_invalidPassword() {
        WebDriver driver = initDriver();
        login(driver, "Admin", "wrongpass");
        WebElement msg = driver.findElement(By.className("oxd-alert-content-text"));
        System.out.println("✅ TC02: Invalid Password Alert: " + msg.getText());
        driver.quit();
    }

    static void tc03_emptyFields() {
        WebDriver driver = initDriver();
        driver.get(baseUrl);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        WebElement msg = driver.findElement(By.className("oxd-input-field-error-message"));
        System.out.println("✅ TC03: Empty Fields Validation: " + msg.getText());
        driver.quit();
    }
}
