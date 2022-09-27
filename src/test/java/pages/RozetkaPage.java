package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class RozetkaPage extends BasePage {


    public RozetkaPage(WebDriver driver) {
        super(driver);
    }

    //public void rozetkaHomePage(){driver.get("https://rozetka.com.ua/ua/");}


    public WebElement getSearchField() {

        return driver.findElement(By.xpath("//input[@name=\"search\"]"));
    }

    public WebElement getSearchFieldBtn() {
        return driver.findElement(By.xpath("//button[text()=\" Знайти \"]"));
    }

    public List<WebElement> allPrice() {
        return findElementsByXpath("//*[@class='goods-tile__price-value']");
    }
}