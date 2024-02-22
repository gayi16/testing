import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Act_7
{
    WebDriver driver;
    @BeforeClass
    public void before_class()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        System.out.println("before");
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println(driver.getTitle());
        Assert.assertEquals("Login Form",driver.getTitle());
    }
//    @Test
//    @DataProvider(name = "Input")
//    public static Object[][] credentials() {
//        return new Object[][] {{ "admin", "password" }};
//    }

    @Test
    @DataProvider(name="Details")
    public static String[][] method() {
        return new String[][]{
                {"admin", "password"}
        };
    }
    @Test(dataProvider ="Details")
    public void testcase1(String username,String password)
    {
        WebElement element=driver.findElement(By.xpath("//input[@id='username']"));
        element.sendKeys(username);
        WebElement element1=driver.findElement(By.id("password"));
        element1.sendKeys(password);
        WebElement element2=driver.findElement(By.xpath("//button[@class='ui button']"));
        element2.click();
        WebElement element3=driver.findElement(By.cssSelector(".ui.massive.green.label"));
        Assert.assertEquals("Welcome Back, admin",element3.getText());

    }

    @AfterClass
    public void after_class()
    {
        driver.quit();
    }
}
