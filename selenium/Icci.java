import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class Icci {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.icicibank.com/");
        Actions actions = new Actions(driver);
        WebElement element= driver.findElement(By.xpath("//*[@id=\"new-header-v2\"]/div[1]/div[3]/div[1]/div/nav/ul/li[4]/a"));
        actions.moveToElement(element).build().perform();
        WebElement element1= driver.findElement(By.xpath("//*[@id=\"new-header-v2\"]/div[1]/div[3]/div[1]/div/nav/ul/li[4]/div/div[1]/ul/li[4]/a"));
       element1.click();
        System.out.println("done");
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='content-wrapper']"));
        System.out.println("they are:"+list.size());
driver.quit();
    }
}