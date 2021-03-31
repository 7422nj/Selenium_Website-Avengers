package Amazon.Books;

import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static Amazon.Books.BooksWebElements.*;

public class AmazonBooks {

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


    //Thread.sleep(1000); -> sleepFor(1); [ 1000 milliseconds = 1 second ]
    public static void sleepFor(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Performs Action Before Methods is Operated
    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }// Action Method

    public void findHeadFirstJavaBook() throws InterruptedException {
        driver.findElement(By.xpath(booksLink)).click();
        sleepFor(2);
        driver.findElement(By.xpath(searchBox)).sendKeys(searchText);
        sleepFor(2);
        driver.findElement(By.xpath(confirmSearchButton)).click();
        sleepFor(3);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        driver.findElement(By.xpath(headFirstJavaBookLink)).click();
        sleepFor(3);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        driver.findElement(By.xpath(addToCart)).click();
        sleepFor(3);

    }//100 Books to Read in a Lifetime

    public void hundredBooksToRead() throws InterruptedException, NoAlertPresentException {
        driver.findElement(By.xpath(booksLink)).click();
        sleepFor(2);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        driver.findElement(By.xpath(hundredBooksToReadInLT)).click();
        sleepFor(2);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        driver.findElement(By.xpath(devilInTheWhiteCity)).click();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);


    }//ExplicitWait on New Window Then Confirm Title Is Equal

    public void ExplicitWaitToOpenNewWindow() throws InterruptedException, NoAlertPresentException {
        sleepFor(3);
        driver.quit();
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        // launch Chrome and redirect it to the Base URL
        driver.get(doubleClickUrl);
        sleepFor(5);
        //Maximizes the browser window
        driver.manage().window().maximize();
        sleepFor(5);
        driver.manage().window().setPosition(new Point(0, -2000));

    }//Incognito Mode Then Confirm That Only The Title Displayed is From The Back Window

    public void IncognitoMode() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(doubleClickUrl);
        driver.manage().window().maximize();
        driver.quit();

    }//

    public void test2Books2Windows() throws InterruptedException {
       driver.findElement(By.xpath(booksLink)).click();
       robot.keyPress(KeyEvent.VK_DOWN);
       robot.delay(300);
       robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
       robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
       robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
       robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
       robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
       robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        driver.findElement(By.xpath(faucianBargainBookLink)).click();
        sleepFor(2);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(300);
        driver.findElement(By.xpath(addToCart)).click();
        sleepFor(3);
        WebDriver driver = new ChromeDriver();
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Open WebSite
        driver.get(newWindowPage);
        driver.manage().window().maximize();
        //Find the date time picker control
        sleepFor(5);
        driver.findElement(By.xpath(addToCart)).click();
        sleepFor(3);
        driver.manage().window().setPosition(new Point(0, -2000));

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
