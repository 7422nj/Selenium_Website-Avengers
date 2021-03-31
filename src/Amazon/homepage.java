package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.awt.event.KeyEvent;

import static Amazon.amazonWebElements.*;


public class homepage {

    //Will Load A New Web Page In The Current Browser Window
    WebDriver driver;

    //Robot Available for All Below Methods
    Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
            System.out.println("\n*** Robot Unable To Perform Action ***");
        }
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Performs Action Before Methods is Operated
    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }

    // Action Method
    public void checkSearchBox() {
        // Enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        // click on searchButton
        driver.findElement(By.id(searchButtonLocator)).click();
    }

    // Action Method
    public void checkSignUp() {
        // Enter product name
        driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("Pritam");

    }

    public void testCustomerService() throws InterruptedException {
        //We want the driver to find an element By -> pathName Then click that element
        driver.findElement(By.xpath(customerServiceButton)).click();
        Thread.sleep(3000);


    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Performs Action After Methods has Operated
    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}

