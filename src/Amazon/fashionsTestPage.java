package Amazon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class fashionsTestPage extends amazonFashion{

    @Test
    public void testWomensNewArrival(){
        womensNewArrivals();
        String expectedText = "Romwe Women's Short Sleeve Button Front Solid Collar Polo Crop Tops T Shirt at Amazon Women’s Clothing store";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "No Iteam Found");

    }

    @Test
    public void testDresses(){
        dresses();
       String expectedText = " Amazon.com: $50 to $100 - Free Shipping by Amazon / Fit & Flare / Dresses / Clothing: Clothing, Shoes & Jewelry";
       String actualText = driver.getTitle();
       Assert.assertEquals(actualText, expectedText, "Iteam Found");

    }

    @Test
    public void testSalesAndDeals() throws InterruptedException {
        salesAndDeals();
        String expectedText = "Vince Camuto womens Maxi crossbody, Black, Small US: Handbags: Amazon.com";
        String acutalText= driver.getTitle();
        Assert.assertEquals(acutalText, expectedText, "Bag is found");


    }

    @Test
    public void testShoes() throws InterruptedException {
        shoes();
        String expectedText = "Amazon.com | Giuseppe Zanotti Women's Metal Strap Sandals | Sandals";
        String acutalText = driver.getTitle();
        Assert.assertEquals(acutalText, expectedText, "Sandals not found");

    }

    @Test
    public void testTops() throws InterruptedException {
        tops();
        String expectedText = "Milumia Women's Floral Print Cut Out V Neck Cap Sleeve Office Work Blouse Shirt Top at Amazon Women’s Clothing store";
        String acutalText = driver.getTitle();
        Assert.assertEquals(acutalText, expectedText, "floral top found");

    }









}
