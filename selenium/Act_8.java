import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Act_8
{
    WebDriver driver;
    @BeforeClass
    public void before_class()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        System.out.println("before");
        Reporter.log("Starting Test |");
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opened Browser |");
        Reporter.log("Page title is " + driver.getTitle() + " |");
    }
    @Test

    public void simpleAlertTestCase()
    {
        WebElement element=driver.findElement(By.cssSelector(".ui.inverted.red.button"));
        element.click();
        Reporter.log("Simple Alert opened |");
        Alert alert=driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");
        String alertText =alert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Alert!", alertText);
        System.out.println(alertText );
        alert.accept();
        Reporter.log("Alert closed");

        Reporter.log("Test case ended |");



    }
    @Test
    public void promptAlertTestCase()
    {
        WebElement element=driver.findElement(By.cssSelector(".ui.inverted.green.button"));
        element.click();
        Reporter.log("prompt Alert opened |");
        Alert alert=driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");
        String alertText =alert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Prompt!", alertText);
        System.out.println(alertText );
        Reporter.log("Type in a message");
        alert.sendKeys("hi");
        Reporter.log("Text entered in prompt alert |");
        alert.accept();
        Reporter.log("Alert closed");

        Reporter.log("Test case ended |");


    }
    @BeforeMethod
    public void defaultContent()
    {
        Reporter.log("Test Case Setup started |");
        driver.switchTo().defaultContent();
    }
    @Test
    public void confirmAlertTestCase()
    {
        WebElement element=driver.findElement(By.cssSelector(".ui.inverted.blue.button"));
        element.click();
        Reporter.log("confirm Alert opened |");
        Alert alert=driver.switchTo().alert();
        String alertText =alert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);
        System.out.println(alertText );
        Reporter.log("Switched foucs to alert |");
        String alet=alert.getText();
        System.out.println(alet);
        alert.accept();
        Reporter.log("Alert closed");

        Reporter.log("Test case ended |");


    }
    @AfterClass
    public void after_class()
    {
        Reporter.log("Ending Test |");
        driver.quit();
    }
}
/*
public class Activity9 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the Firefox driver
        WebDriverManager.firefox().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        Reporter.log("Starting Test |");
        //Open browser
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opened Browser |");

        //Print title of page
        Reporter.log("Page title is " + driver.getTitle() + " |");
    }

    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("Test Case Setup started |");
        driver.switchTo().defaultContent();
    }

    @Test(priority = 0)
    public void simpleAlertTestCase() {
        Reporter.log("simpleAlertTestCase() started |");
        //Click the button to open a simple alert
        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple Alert opened |");

        //Switch to alert window
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");

        //Get text in the alert box and print it
        String alertText = simpleAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Alert!", alertText);

        simpleAlert.accept();
        Reporter.log("Alert closed");

        Reporter.log("Test case ended |");
    }

    @Test(priority = 1)
    public void confirmAlertTestCase() {
        Reporter.log("confirmAlertTestCase() started |");
        //Click the button to open a simple alert
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Confirm Alert opened |");

        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");

        //Get text in the alert box and print it
        String alertText = confirmAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);

        confirmAlert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }

    @Test(priority = 2)
    public void promptAlertTestCase() {
        Reporter.log("promptAlertTestCase() started |");
        //Click the button to open a simple alert
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened |");

        //Switch to alert window
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");

        //Get text in the alert box and print it
        String alertText = promptAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        promptAlert.sendKeys("Awesome!");
        Reporter.log("Text entered in prompt alert |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Prompt!", alertText);

        promptAlert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }

    @AfterClass
    public void tearDown() {
        Reporter.log("Ending Test |");
        //Close the driver
        driver.close();
    }
}
 */