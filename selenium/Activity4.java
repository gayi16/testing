import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
class Activity4 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("title is:"+driver.getTitle());
        WebElement element=driver.findElement(By.xpath("//h3[@class='ui yellow header']"));
 System.out.println("the text is:"+element.getText());
        WebElement element1=driver.findElement(By.xpath("//h3[@class='ui yellow header']"));
        System.out.println("the text is:"+element1.getCssValue("color"));
        WebElement element2=driver.findElement(By.xpath("//button[@class='ui violet button']"));
        System.out.println("the text is:"+element2.getAttribute("class"));
        WebElement element3=driver.findElement(By.xpath("//button[@class='ui grey button']"));
        System.out.println("the text is:"+element3.getText());
        // Perform testing and assertions


        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}

//Activity 4
//Java Solution:
//
//public class Activity4 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//
//        // Open the page
//        driver.get("https://www.v1.training-support.net/selenium/target-practice");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Find the 3rd header and print its text
//        String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
//        System.out.println(thirdHeaderText);
//        // Find the 5th header and print its colour
//        String fifthHeaderColor = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
//        System.out.println(fifthHeaderColor);
//
//        // Find the violet button and print its classes
//        String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
//        System.out.println(violetButtonClass);
//        // Find the grey button and print its text
//        String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
//        System.out.println(greyButtonText);
//
//        // Close the browser
//        driver.close();
//    }
//}