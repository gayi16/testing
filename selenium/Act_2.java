import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Act_2
{
    WebDriver driver;
    @BeforeClass
    public void before_class()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        System.out.println("before");
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }
    @Test
    public void testcase1()
    {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target Practice",driver.getTitle());

    }
    @Test
    public void testcase2()
    {
        WebElement element= driver.findElement(By.cssSelector(".ui.black.button"));
        WebElement element1= driver.findElement(By.cssSelector("ui.black.button"));
        Assert.assertEquals("Black",element.getText());
        Assert.assertFalse(element1.isDisplayed());
    }
    @Test(enabled = false)
    public void testcase3()
    {

    }

    @Test
    public void testcase4 () throws SkipException
    {
    throw  new SkipException("it's Skipped exception");
    }
    @AfterClass
    public void after_class()
    {
        driver.quit();
    }
}
/*
public class Activity2 {
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefox().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void testCase1() {
        //This test case will pass
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test
    public void testCase2() {
        //This test case will Fail
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }

    @Test(enabled = false)
    public void testCase3() {
        //This test will be skipped and not counted
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }

    @Test
    public void testCase4() {
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");
    }

    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}*/