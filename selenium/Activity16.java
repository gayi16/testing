import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class Activity16 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Title" + driver.getTitle());
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element=driver.findElement(By.id("multi-select"));
        Select obj=new Select(element);
        obj.selectByVisibleText("Angular");
        System.out.println("selected");
        obj.selectByIndex(2);
        System.out.println("selected");
        obj.selectByValue("design");
        System.out.println("selected");
        List<WebElement> options=obj.getOptions();
        for (WebElement s:options)
 {
     System.out.println(s.getText());

 }
 driver.quit();

    }
}