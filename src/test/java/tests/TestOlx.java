package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OlxHomePage;
import pages.OlxSearchResaltsPage;

public class TestOlx extends  TestInit {

    @Test

    public void checkHeader() {
        OlxHomePage olxHomePage = new OlxHomePage(driver);
        olxHomePage.navigateOlx();

        Assert.assertTrue(olxHomePage.getLogo().isDisplayed());
        Assert.assertTrue(olxHomePage.getChangeLangBtn().isDisplayed());
        Assert.assertTrue(olxHomePage.getChangeLangUkrBtn().isDisplayed());
        Assert.assertTrue(olxHomePage.getLikeBtn().isDisplayed());
        Assert.assertTrue(olxHomePage.getSearchField().isDisplayed());
    }
    @Test

    public void checkSearch(){
        OlxHomePage olxHomePage = new OlxHomePage(driver);
        olxHomePage.navigateOlx();

        olxHomePage.getSearchField().sendKeys("cat");
        olxHomePage.getSearchFieldBtn().click();

        Assert.assertTrue(OlxSearchResaltsPage.getResaltsField);
    }
}
