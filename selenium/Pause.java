import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Pause
{
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        WebElement element=driver.findElement(By.id("APjFqb"));

        Actions act=new Actions(driver);
//        act.moveToElement(element).pause(Duration.ofSeconds(1)).clickAndHold().pause(Duration.ofSeconds(1)).build().perform();
        act.click(element).sendKeys("gayi").build().perform();
        System.out.println("performed");
        WebElement element1=driver.findElement(By.xpath("//input[@class,'gNO89b]"));
        act.click(element1).build().perform();
        System.out.println("performed");
        driver.quit();

    }
}