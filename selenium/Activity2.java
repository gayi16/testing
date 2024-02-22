import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
class Activity2 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println(("title is:"+driver.getTitle()));
        WebElement element=driver.findElement(By.id("username"));
        element.sendKeys("username");
        WebElement element1=driver.findElement(By.id("password"));
        element1.sendKeys("password");
        WebElement element2=driver.findElement(By.xpath("//button[text()='Log in']"));
element2.click();

driver.quit();

        // Perform testing and assertions


        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
//        driver.quit();
    }
}

