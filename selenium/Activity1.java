import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Activity1 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        FirefoxOptions fire=new FirefoxOptions();
        fire.setHeadless(true);

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver(fire);

        // Open the browser
        driver.get("https://v1.training-support.net");
//        WebElement ele = driver.findElement(By.className("ui header"));
        String title = driver.getTitle();
        System.out.println("title is" + title);
        WebElement ele1 = driver.findElement(By.id("about-link"));
        ele1.click();
        String title1 = driver.getTitle();
        System.out.println("title of new page" + title1);
        // Perform testing and assertions


        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}
