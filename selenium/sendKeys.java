import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sendKeys
{
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        WebElement element= driver.findElement(By.id("APjFqb"));
        Actions actions=new Actions(driver);

//        actions.sendKeys(element,"cheese").perform();
//        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
          actions.sendKeys(element, "Selenium!")
                .sendKeys(Keys.ARROW_LEFT)
                .keyDown(Keys.SHIFT)
                .sendKeys(Keys.ARROW_UP)
                .keyUp(Keys.SHIFT)
                .keyDown(Keys.CONTROL)
                .sendKeys("xvv")
                .keyUp(Keys.CONTROL)
                .perform();
        WebElement element1= driver.findElement(By.xpath("//div[contains(@id,'result-stats')]"));
        System.out.println(element1.isDisplayed());
        System.out.println("string is"+element1.getText());


    }
}
