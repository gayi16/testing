import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity22 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/popups");
        Actions act=new Actions(driver);
        System.out.println("Title" + driver.getTitle());
        WebElement element= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/button"));
        act.moveToElement(element).perform();
    }
}

