package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;

import static Amazon.amazonWebElements.*;

public class amazonFashion {

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
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
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
    public void womensNewArrivals(){
        driver.findElement(By.xpath(fashionLink)).click();
        driver.findElement(By.cssSelector(womensNewArrivalLink)).click();
        driver.findElement(By.xpath(featuredNewArrivalThisMonthLink)).click();
        driver.findElement(By.xpath(last30DaysLink)).click();
        driver.findElement(By.xpath(womensShortSleeveLink)).click();

    }


    public void dresses(){
        driver.findElement(By.xpath(fashionLink)).click();
        driver.findElement(By.xpath(dresseslink)).click();
        driver.findElement(By.xpath(eligibileForFreeShipping)).click();
        driver.findElement(By.xpath(price50to100)).click();
        driver.findElement(By.xpath(dressStyle)).click();
       driver.findElement(By.xpath(hemDressWithPockets)).click();

    }

    public void salesAndDeals() throws InterruptedException {
        driver.findElement(By.xpath(fashionLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(saleAndDeals)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(handbags)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(color)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(blackBag)).click();
        Thread.sleep(3000);

    }

    public void shoes() throws InterruptedException {
        driver.findElement(By.xpath(fashionLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(shoes)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(premiumBrands)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(shoeSize)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(sandals)).click();
        Thread.sleep(3000);

    }

    public void tops() throws InterruptedException {
        driver.findElement(By.xpath(fashionLink)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(tops)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(blousesAndShirts)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(generalSize)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(floralTop)).click();
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


