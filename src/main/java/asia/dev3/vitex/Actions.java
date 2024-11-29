package asia.dev3.vitex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions {

        private static WebDriver driver;

        public Actions(WebDriver driver) {
            this.driver = driver;
        }

        public static void clickElement(By by) {
            System.out.println("Click on element " + by);
waitForElementVisible(by);
            waitForElementToBeClickable(by);
            driver.findElement(by).click();
    }
        public static void setText(By by, String text) {
            System.out.println("Set text " + text + " on element " + by);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            driver.findElement(by).sendKeys(text);
        }

        public static void clearText(By by) {
            System.out.println("Clear text on element " + by);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            driver.findElement(by).clear();
        }

        public static String getTextElement(By by) {
            System.out.println("Get text of element " + by);
            waitForElementVisible(by);
            String text = driver.findElement(by).getText();
            System.out.println("==> Text: " + text);
            return driver.findElement(by).getText();
        }

        public static void waitForElementVisible(By by) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }

        public static void waitForElementVisible(By by, int second) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }

        public static void waitForElementToBeClickable(By by) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }
    public static void waitForElementToBeClickable(By by, int second) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void waitForOverlaysToDisappear(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));

    }
    }


