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


class Activity14 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Create the Actions object
        Actions builder = new Actions(driver);

        // Open the page
        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println("Title" + driver.getTitle());
        String table=driver.findElement(By.id("sortableTable")).toString();
        List<WebElement> element= driver.findElements(By.xpath(table+"/thead/tr/th"));
        System.out.println("columns"+element.size());
        List<WebElement> element1= driver.findElements(By.xpath(table+"/tbody/td"));
        System.out.println("rows"+element.size());

driver.quit();

    }
}
//public class Activity14 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Wait object
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Open the page
//        driver.get("https://www.v1.training-support.net/selenium/tables");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Print the number of columns
//        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
//        System.out.println("Number of columns: " + cols.size());
//        // Print the number of rows
//        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
//        System.out.println("Number of rows: " + rows.size());
//
//        // Print the cell value of the second row and second column
//        WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
//        System.out.println("Second row, second cell value: " + cellValue.getText());
//
//        // Sort the table
//        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
//
//        // Print the cell value of the second row and second column again
//        cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
//        System.out.println("Second row, second cell value: " + cellValue.getText());
//
//        // Print the cell values of the footer
//        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
//        System.out.println("Cell values of the footer: ");
//        for(WebElement cell : footer) {
//            System.out.println(cell.getText());
//        }
//
//        // Close the browser
//        driver.quit();
//    }
//}
//<suite name="Suite" parallel="classes">
//    <test name="Tests">
//        <classes>
//            <class name="Package.Class1" />
//            <class name="Package.Class2" />
//            <class name="Package.Class3" />
//            <class name="Package.Class4" />
//        </classes>
//    </test>
//</suite>