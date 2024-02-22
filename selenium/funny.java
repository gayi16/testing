import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


class funny {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();


        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        WebElement element= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        element.sendKeys("cheese");
driver.get("https://www.google.com/search?q=cheese&sca_esv=ba846a2fd35e5017&source=hp&ei=D3O7ZZ2XJPuP2roPy6yQgAQ&iflsig=ANes7DEAAAAAZbuBHwmAJOOhuappgKg2acEbrmKfh3n8&ved=0ahUKEwjd2sKD-ImEAxX7h1YBHUsWBEAQ4dUDCA0&uact=5&oq=cheese&gs_lp=Egdnd3Mtd2l6IgZjaGVlc2UyCBAAGIAEGLEDMgsQLhiABBixAxiDATIOEAAYgAQYigUYsQMYgwEyCBAAGIAEGLEDMggQABiABBixAzILEAAYgAQYsQMYgwEyCBAAGIAEGLEDMggQABiABBixAzIFEAAYgAQyCBAAGIAEGLEDSMBSUABYFXACeACQAQKYAaMBoAHmBKoBAzAuNLgBA8gBAPgBAQ&sclient=gws-wiz");
        WebElement element1=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/button"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Create the Actions object
        WebElement el= driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        String txt=el.getText();
        System.out.println(txt);
        String arr[]=txt.split(" ") ;
        System.out.println(arr[1]);

        Actions builder = new Actions(driver);
        element1.sendKeys(Keys.ENTER);
    }
}
