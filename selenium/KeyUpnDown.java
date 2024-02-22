import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpnDown {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        WebElement element=driver.findElement(By.id("APjFqb"));
        Actions actions=new Actions(driver);
//        element.sendKeys("gayi");
        actions.keyDown(Keys.SHIFT).sendKeys("aaaa").keyUp(Keys.SHIFT).sendKeys("gayi").perform();
//        System.out.println(element.getText());

    }
}
