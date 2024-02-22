import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Act_4
{
    WebDriver driver;
    @BeforeClass
    public void before_class()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        System.out.println("before");
        driver.get("https://v1.training-support.net");
    }
    @Test
    public void testcase()
    {
        Assert.assertEquals("Training Support",driver.getTitle());
    }
    @AfterClass
    public void after_class()
    {
        driver.quit();
    }
}

