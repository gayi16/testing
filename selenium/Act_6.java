import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Act_6
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
    @Test
    @Parameters({ "Username", "Password" })
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
/*
public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        // Set up the Firefox driver
        WebDriverManager.firefox().setup();
        // Initialize the Firefox driver
        driver = new FirefoxDriver();
        // Initialize the wait object
        wait = new WebDriverWait(driver, 10);

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"username", "password"})
    public void loginTestCase(String username, String password) {
        //Find username and pasword fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        //Enter values
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }

}
 */