package Amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;

import static Amazon.amazonWebElements.careers;

public class jobTestPage extends AmazonJobs {

    @Test
    public void testExample() {

        checkSearchBox();

        String expectedText = " Amazon QA Jobs ";

        String actualText = driver.getTitle();

        Assert.assertEquals(actualText, expectedText, " HTTP 404 ");
    }

    @Test

    public void testCareerPage() throws InterruptedException {

        FindCareersPage();

        String expectedText = "Amazon.jobs: Help us build Earth’s most customer-centric company.";

        String actualText = driver.getTitle();

        Assert.assertEquals(actualText, expectedText, "\nTest Failed");


    }

    @Test
    public void testJobsSearch() throws InterruptedException {
        driver.findElement(By.xpath(careers)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[.='View open jobs']")).click();
        Thread.sleep(5000);

        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(5000);

        String expectedText = "Job search | Amazon.jobs";

        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "\nTest Failed");

    }

    @Test
    public void verifyAmazonLogo() {
        boolean logo = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
        Assert.assertTrue(logo);

    }

    @Test
    public void testCareer() {
        String expectedText = "Amazon.jobs: Help us build Earth’s most customer-centric company.";
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div[1]/ul/li[1]/a")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");


    }
}