import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Act_10 {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setup() {
//        to make the browser invisible
        FirefoxOptions fire=new FirefoxOptions();
        fire.setHeadless(true);
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(fire);
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }

    public static List<List<Object>> readExcel(String filePath) {
        List<List<Object>> data = new ArrayList<>();
        try {
            // Read the file as a stream
            FileInputStream file = new FileInputStream(filePath);

            // Create the workbook
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Get first sheet from that workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through all the rows one by one
            for (Row row: sheet) {
                // Temp var
                List<Object> rowData = new ArrayList<>();
                // Iterate over all the cells one by one
                for(Cell cell: row) {
                    if(cell != null) {
                        switch (cell.getCellType()) {
                            case STRING -> rowData.add(cell.getStringCellValue());
                            case NUMERIC -> rowData.add(cell.getNumericCellValue());
                            case BOOLEAN -> rowData.add(cell.getBooleanCellValue());
                        }
                    }
                }
                data.add(rowData);
            }
            file.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @DataProvider(name = "Registration")
    public static Object[][] signUpInfo() {
        String filePath = "C:\\Users\\GAYATHRIBOGGALA\\IdeaProjects\\Selenium\\src\\test\\java\\Act_10.excel.xlsx";
        List<List<Object>> data = readExcel(filePath);
        return new Object[][] {
                { data.get(1) },
                { data.get(2) },
                { data.get(3) },
        };
    }

    @Test(dataProvider = "Registration")
    public void registrationTest(List<Object> rows) {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement phoneNumberField = driver.findElement(By.id("number"));

        // Clear the fields
        firstNameField.clear();
        lastNameField.clear();
        emailField.clear();
        phoneNumberField.clear();

        // Enter the data
        firstNameField.sendKeys(rows.get(1).toString());
        lastNameField.sendKeys(rows.get(2).toString());
        emailField.sendKeys(rows.get(3).toString());
        phoneNumberField.sendKeys(rows.get(4).toString());

//        String filename=System.currentTimeMillis()+"Test";
//        File screenshot=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
//        File outputFile=new File("ALERTS/"+filename+".png");
//        System.out.println(outputFile.getAbsolutePath());
//
//        try{
//            FileUtils.copyFile(screenshot,outputFile);
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }

        // Wait for the alert to show up
        wait.until(ExpectedConditions.alertIsPresent());


        // Click on the submit button
        driver.findElement(By.cssSelector("input.green")).click();
        // Switch to Alert
        Alert message = driver.switchTo().alert();
        // Get the alert message

        System.out.println("Alert Message: " + message.getText());
        Reporter.log("Alert Message: " + message.getText());

        message.accept();
        //________SCREENSHOTS_____

        // Refresh the page
        driver.navigate().refresh();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}

