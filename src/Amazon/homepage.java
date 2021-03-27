package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class homepage {

    WebDriver driver;
    String amazonUrl = "https://www.amazon.com/";
    String productName = "Gloves";
    String searchBoxLocator = "twotabsearchtextbox";
    String searchButtonLocator = "nav-search-submit-button";
    String searchBoxBlog = "#trending-now > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(13) > div:nth-child(1) > bsp-newsletter-module:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > label:nth-child(1) > input:nth-child(1)";
    String searchButtonBlog = "/html/body/div[2]/main/div[3]/bsp-tabs/div/div[2]/div[1]/div/div/div/ul/li[13]/div/bsp-newsletter-module/div/form/div[2]/div[1]/button[1]";

    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);
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
    @AfterMethod
    public void tearDown() {
        driver.close();
        //driver.quit();
    }
}
