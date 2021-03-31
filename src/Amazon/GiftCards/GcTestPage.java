package Amazon.GiftCards;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GcTestPage extends amazonGiftCards {
    @Test //Always need a @Test on top of method to verify this method will be used for testing purposes

    public void testExample() { //Public void testName+Description(){

        checkSearchBox(); //Call the method you want to test

        String expectedText = " enter expectText "; //Enter what you expect to be shown in your test results

        String actualText = driver.getTitle(); //This will ask the driver (chrome) to verify the title of page

        Assert.assertEquals(actualText, expectedText, "Page Title not match"); //Our result should be equal

    }

    @Test(priority = 2)
    public void testEGiftCards() {
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");
    }

    @Test(priority = 3)
    public void testCoolGiftCards() {
        String expectedText = "Amazon.com: Books";
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 4)
    public void testBookGiftCards() {
        String expectedText = "Gold Box Deals | Today's Deals - Amazon.com";
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 5)
    public void testGiftCards() {
        String expectedText = "Amazon.com Shopping Cart";
        driver.findElement(By.cssSelector("#nav-cart")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 6)
    public void testEbayGiftCards() {
        String expectedText = "Amazon Sign-In";
        driver.findElement(By.cssSelector("#nav-link-prime")).click();
        driver.findElement(By.cssSelector("#prime-header-CTA > span > input")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 7)
    public void testPictureGiftCards() throws InterruptedException {
        String expectedText = "Amazon.com: Prime Video: Prime Video";
        driver.findElement(By.cssSelector("#nav-hamburger-menu > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(7) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(6) > a")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }
}