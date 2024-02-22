import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_2
{
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Title is "+driver.getTitle());
        WebElement element= driver.findElement(By.id("username"));
        element.sendKeys("admin");
        WebElement element1= driver.findElement(By.id("password"));
        element1.sendKeys("password");
        WebElement element2= driver.findElement(By.className("ui button"));
        element2.click();
        System.out.println("text is:"+element2.isDisplayed());
        driver.quit();

    }
}
