import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//from selenium.webdriver.support.select import Select;
import java.time.Duration;
import java.util.List;


class Activity18{
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Create the Actions object


        // Open the page
        driver.get("https://v1.training-support.net/selenium/selects");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Title" + driver.getTitle());
        Actions builder = new Actions(driver);
        WebElement element=driver.findElement(By.tagName("select"));
        element.click();
        Select select=new Select(element);
        List<WebElement> options=select.getOptions();
        select.selectByVisibleText("JavaScript");
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);
        select.selectByValue("node");
        select.deselectByIndex(4);

        for (WebElement s:options)
        {
            System.out.println(s.getText());

        }
driver.quit();
    }
}
