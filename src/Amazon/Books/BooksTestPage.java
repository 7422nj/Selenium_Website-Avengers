package Amazon.Books;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Amazon.Books.BooksWebElements.*;

public class BooksTestPage extends AmazonBooks {

    //Find Head First Java Book by Searching and Confirming by Text Does Not Equal

    @Test(enabled = false)
    public void testFindHeadFirstJavaBook() throws InterruptedException {
        findHeadFirstJavaBook(); //-> action method
        String expectedText = "Pawri";
        String actualText = driver.findElement(By.xpath(addedToCartConfirmation)).getText();
        Assert.assertNotEquals(actualText, expectedText, "\n*** Test Fail - Try Again ***");


    }
    //Devil In The White City Title Is Displayed

    @Test(enabled = false)
    public void testEx() throws InterruptedException, NoAlertPresentException {
        hundredBooksToRead();
        boolean devil = driver.findElement(By.xpath(DITCityTitle)).isDisplayed();
        Assert.assertTrue(devil,"\n*** Test Fail - Try Again ***");

    }
    //Devil in the White City pt 2 - ExplicitWait on New Window Then Confirm Title Is Equal

    @Test(enabled = false)
    public void testExplicitWaitToOpenNewWindow() throws InterruptedException {
        ExplicitWaitToOpenNewWindow();
        String expectedText = "The Devil in the White City: Murder, Magic, and Madness at the Fair That Changed America: Erik Larson: 0884510967318: Amazon.com: Books";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "\n*** Test Fail - Try Again ***");

    }//Devil in the White City pt 2 - Incognito Mode Then Confirm That Only The Title Displayed is From The Back Window

    @Test(enabled = false)
    public void testIncognitoModeNewWindow() {
        IncognitoMode();
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "\n*** Test Fail - Try Again ***");

    }//Find a Book Then Add to Cart Then Open New Window Then Find New Book And Add to Cart And Confirm Added to Cart

    @Test
    public void testAdd2BooksWith2DifferentWindows() throws InterruptedException {
        test2Books2Windows();
        String expectedText = "Added to Cart";
        String actualText = driver.findElement(By.xpath(addedToCartConfirmation)).getText();
        Assert.assertEquals(actualText, expectedText, "\n*** Test Fail - Try Again ***");

    }

}
