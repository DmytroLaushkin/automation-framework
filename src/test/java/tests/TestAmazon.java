package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonHomePageHelper;
import pages.AmazonSearchResaltsPage;

public class TestAmazon extends TestInit{

    @Test
    public  void checkHeader(){
        AmazonHomePageHelper amazonHomePageHelper = new AmazonHomePageHelper(driver);
        amazonHomePageHelper.navigateAmazon();
        Assert.assertTrue(amazonHomePageHelper.getLogoImage().isDisplayed());
        Assert.assertTrue(amazonHomePageHelper.getDeliverTo().isDisplayed());
        Assert.assertTrue(amazonHomePageHelper.getSearchField().isDisplayed());
        Assert.assertTrue(amazonHomePageHelper.getSearchImageBtn().isDisplayed());
    }
     @Test
    public void checkSearch(){
        AmazonHomePageHelper amazonHomePageHelper = new AmazonHomePageHelper(driver);
        amazonHomePageHelper.navigateAmazon();

        amazonHomePageHelper.getSearchField().sendKeys("cats");
        amazonHomePageHelper.getSearchImageBtn().click();

         AmazonSearchResaltsPage amazonSearchResaltsPage = new AmazonSearchResaltsPage(driver);
        Assert.assertTrue(amazonSearchResaltsPage.getResultsField().isDisplayed());

    }

    @Test
    public void checkSearchPen(){
        AmazonHomePageHelper amazonHomePageHelper = new AmazonHomePageHelper(driver);
        amazonHomePageHelper.navigateAmazon();

        AmazonSearchResaltsPage amazonSearchResaltsPage = amazonHomePageHelper.search("pen");

        Assert.assertTrue(amazonSearchResaltsPage.getResultsField().isDisplayed());
        Assert.assertTrue(amazonSearchResaltsPage.getElementsWithTextPen().size() > 10);

    }
}

