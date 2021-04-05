package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.awt.event.KeyEvent;

import static Amazon.amazonWebElements.*;

public class amazonPrime {

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

    public void getHelp() throws InterruptedException {
    driver.findElement(By.xpath(amazonPrimeLink)).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(getHelpLink)).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(getHelpSearch)).sendKeys(getHelpText);
    Thread.sleep(3000);
    robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(3000);

    }
    public void getDelivery() throws InterruptedException {
        driver.findElement(By.xpath(amazonPrimeLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getdeliveryLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getDeliverysearch)).sendKeys(getDeliverysearch);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

    }
    public void getExclusiveDeal() throws InterruptedException {
        driver.findElement(By.xpath(amazonPrimeLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getexclusiveDealLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getExclusiveDealSearch)).sendKeys(getExclusiveDealSearch);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

    }
    public void getTryPrime() throws InterruptedException {
        driver.findElement(By.xpath(amazonPrimeLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getTryPrimeLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getTryPrimeSearch)).sendKeys(getTryPrimeSearch);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

    }
    public void getHomeKitchen() throws InterruptedException {
        driver.findElement(By.xpath(amazonPrimeLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getHomeKitchenLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getHomeKitchenSearch)).sendKeys(getTryPrimeSearch);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
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
