package Amazon;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class amazonTestPage extends homepage{ //testClass extends homePage

//    homepage home; //objectOfClass referenceName;

    @Test
    public void testSearchAmazon() throws InterruptedException{ //public void testName() throws InterruptedException{}
        String expectedText = "Amazon.com";
        driver.findElement(By.cssSelector("a.nav-a:nth-child(9)")).click();
        driver.findElement(By.cssSelector("div.a-section:nth-child(15) > ul:nth-child(2) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > span:nth-child(1)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

}
