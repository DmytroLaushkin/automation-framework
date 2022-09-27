package tests;

import org.testng.annotations.Test;
import pages.GoogleHomePage;

public class TestWebDriver extends TestInit {

    public void setUp() {

    }

    @Test

    public void runGoogle() {
        GoToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchField().sendKeys("dogs\n");
        googleHomePage.getSearchField().click();
    }


    @Test
    public void clickEnterBtn() {
        driver.get("https://www.google.com.ua/");
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        GoogleHomePage.getEnterBtn().click();
    }
}
