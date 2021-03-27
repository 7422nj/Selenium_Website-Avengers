package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonWebElements {

    //Write WebElements Below
    public static void main(String[] args) throws InterruptedException {

        String example = " enter path here ";

        String amazonUrl = "https://www.amazon.com/";
        String productName = "Gloves";
        String searchBoxLocator = "twotabsearchtextbox";
        String searchButtonLocator = "nav-search-submit-button";
        String signUpName = "Pritam Das";
        String searchBox = "Coffee";

        // ChromeBrowser
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(amazonUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id(searchBoxLocator)).sendKeys(searchBox);
        driver.findElement(By.id(searchButtonLocator)).click();



//        driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
//        driver.findElement(By.cssSelector("fdfsdfsdf")).click();
//        driver.findElement(By.xpath("rerere")).click();
//        driver.findElement(By.tagName("rerere")).click();
//        driver.findElement(By.name("rerere")).click();
//        driver.findElement(By.linkText("rerere")).click();
//        driver.findElement(By.partialLinkText("rerere")).click();


        Thread.sleep(40000); // Wait purpose
        driver.close();


    }
}

