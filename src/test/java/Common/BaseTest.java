package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void createDriver() {
        driver = new ChromeDriver();
        // Get the screen resolution for the second monitor
        GraphicsDevice[] screens = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();

        if (screens.length > 1) {
            // If there's more than one screen, use the second screen
            Rectangle secondScreenBounds = screens[1].getDefaultConfiguration().getBounds();
            // Set the browser window's position to the second screen
            driver.manage().window().setPosition(new org.openqa.selenium.Point(
                    secondScreenBounds.x + 100,
                    secondScreenBounds.y + 100));
        } else {
            System.out.println("Only one screen detected, opening browser on the primary screen.");
        }
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}
