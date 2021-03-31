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


}
