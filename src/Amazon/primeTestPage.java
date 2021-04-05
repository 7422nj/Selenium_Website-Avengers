package Amazon;


import org.testng.Assert;
import org.testng.annotations.Test;

public class  primeTestPage extends amazonPrime{





    @Test  // test Inotation
    public void testGetHelp() throws InterruptedException { // test Method
        getHelp();   // action method
        String expectedText = "Amazon.com Help: Help & Customer Service"; // expected result
        String actualText = driver.getTitle();        // actual result
        Assert.assertEquals(actualText, expectedText, "product not found");    // test if your assumption is true

    }
    @Test  // test Inotation
    public void testGetDelivery() throws InterruptedException { // test Method
        getDelivery();   // action method
        String expectedText = "Amazon.com Delivery: Delivery & Customer Service"; // expected result
        String actualText = driver.getTitle();        // actual result
        Assert.assertEquals(actualText, expectedText, "product Delivered");    // test if your assumption is true

    }
    @Test  // test Inotation
    public void testGetExclusiveDeal() throws InterruptedException { // test Method
        getExclusiveDeal();   // action method
        String expectedText = "Amazon.com ExclusiveDeal: Most popular"; // expected result
        String actualText = driver.getTitle();        // actual result
        Assert.assertEquals(actualText, expectedText, "product missing");    // test if your assumption is true

    }
    @Test  // test Inotation
    public void testGetTryPrime() throws InterruptedException { // test Method
        getExclusiveDeal();   // action method
        String expectedText = "Amazon.com TryPrime: Get the best shopping"; // expected result
        String actualText = driver.getTitle();        // actual result
        Assert.assertEquals(actualText, expectedText, "Enter Email");    // test if your assumption is true

    }
    @Test  // test Inotation
    public void testGetHomeKitchen() throws InterruptedException { // test Method
        getExclusiveDeal();
        getHomeKitchen();   // action method
        String expectedText = "Amazon.com HomeKitchen: Get the best deal"; // expected result
        String actualText = driver.getTitle();        // actual result
        Assert.assertEquals(actualText, expectedText, "product found");    // test if your assumption is true

    }






}



