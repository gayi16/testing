import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

//public class Act_5
//{
//    WebDriver driver;
//    @BeforeClass
//    public void before_class()
//    {
//        WebDriverManager.firefoxdriver().setup();
//        driver=new FirefoxDriver();
//        System.out.println("before");
//        driver.get("https://v1.training-support.net");
//    }
//    @Test(groups = {"HeaderTests"})
//    public void testcase()
//    {
//        WebElement element= driver.findElement(By.id("third-header"));
//        Assert.assertEquals("Third header",element.getText());
//    }
//    @Test(groups = {"HeaderTests"})
//    public void testcase1()
//    {
//        WebElement element= driver.findElement(By.cssSelector(".ui.green.header"));
//        Assert.assertEquals("green",element.getCssValue("color"));
//    }
//    @Test(groups = {"ButtonTests"})
//    public void testcase2()
//    {
//        WebElement element= driver.findElement(By.id("third-header"));
//        Assert.assertEquals("Third header",element.getText());
//    }
//    @Test(groups = {"ButtonTests"})
//    public void testcase3()
//    {
//        WebElement element= driver.findElement(By.cssSelector(".ui.green.header"));
//        Assert.assertEquals("green",element.getCssValue("color"));
//    }
//    @AfterClass
//    public void after_class()
//    {
//        driver.quit();
//    }
//}


public class Act_5 {
    WebDriver driver;
    //Include alwaysRun property on the @BeforeTest
    //to make sure the page opens
    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void pageTitleTest() {
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
    public void HeaderTest1() {
        WebElement header3 = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(header3.getText(), "Third header");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
    public void HeaderTest2() {
        WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
    public void ButtonTest1() {
        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(button1.getText(), "Olive");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
    public void ButtonTest2() {
        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
    }

    //Include alwaysRun property on the @AfterTest
    //to make sure the page closes
    @AfterTest(alwaysRun = true)
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}