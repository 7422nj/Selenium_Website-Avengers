package Amazon;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*; //We will be using TestNG to test Amazon

public class amazonTestPage extends AmazonJobs { //testClass extends homePage


    @Test //Always need a @Test on top of method to verify this method will be used for testing purposes

    public void testExample() { //Public void testName+Description(){

        checkSearchBox(); //Call the method you want to test

        String expectedText = " enter expectText "; //Enter what you expect to be shown in your test results

        String actualText = driver.getTitle(); //This will ask the driver (chrome) to verify the title of page

        Assert.assertEquals(actualText, expectedText, "Page Title not match"); //Our result should be equal


    }
    @Test

    public void careers () throws InterruptedException {

        //Method Made In Homepage Class
        FindCareersPage();

        // Action Method From HomePage Class

        //This Is Our Expected Return Value
        String expectedText = "Amazon.com Help: Help & Customer Service";        //ExpectedResult

        //This Will Ask The Driver (Chrome) To Get The Title of The Page
        String actualText = driver.getTitle();                                   //ActualResult

        //Assume That I'm Assuming That X And Y Equals Same Value
        Assert.assertEquals(actualText,expectedText,"\nTest Failed");    //This Will Test And Return Result










    }


}
