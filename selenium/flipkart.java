import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class flipkart {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.flipkart.com/");
Actions actions=new Actions(driver);
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 15");
        driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
//actions.sendKeys(Keys.RETURN).build().perform();
        List<WebElement> list_title = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        System.out.println(list_title.get(2).getText());

//        List<WebElement> list_price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        List<WebElement> list_price = driver.findElements(By.cssSelector("._30jeq3._1_WHN1"));
        System.out.println(list_price.get(2).getText());

//        String filename=System.currentTimeMillis()+"Test";
//        File screenshot=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
//        File outputFile=new File("Screenshots1/"+filename+".png");
//        System.out.println(outputFile.getAbsolutePath());
//
//        try{
//            FileUtils.copyFile(screenshot,outputFile);
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }


        driver.close();

    }
}