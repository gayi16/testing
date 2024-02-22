import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_1
{
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/");
        System.out.println("Title is "+driver.getTitle());
        WebElement element= driver.findElement(By.linkText("About Us"));
        element.click();
        System.out.println("text is:"+element.getText());
    }
}
