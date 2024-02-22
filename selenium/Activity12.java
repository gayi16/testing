import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


class Activity12 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Create the Actions object
        Actions builder = new Actions(driver);

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Title" + driver.getTitle());
        WebElement element= driver.findElement(By.id("dynamicText"));
//        boolean check=element.isDisplayed();
//        System.out.println(check);
        System.out.println("b4"+element.isEnabled());

        WebElement element1= driver.findElement(By.id("toggleInput"));
//        boolean check1=element1.isDisplayed();
//        System.out.println("enabled field display"+check1);
        WebDriverWait wa = new WebDriverWait(driver, Duration.ofSeconds(10));
        builder.click(element1).perform();
        boolean enable=element1.isEnabled();
//        System.out.println("enabled"+enable);
        System.out.println("after"+element.isEnabled());

    }
}

//public class Activity12 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Wait object
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Open the page
//        driver.get("https://www.v1.training-support.net/selenium/dynamic-controls");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Find the text field
//        WebElement textbox = driver.findElement(By.id("input-text"));
//        // Check if it is enabled
//        System.out.println("Input field is enabled: " + textbox.isEnabled());
//        // Click the toggle button to enable it
//        driver.findElement(By.id("toggleInput")).click();
//        // Check if the text field is enabled
//        System.out.println("Input field is enabled: " + textbox.isEnabled());
//
//        // Close the browser
//        driver.close();
//    }
//}