package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlxHomePage extends BasePage {
    public OlxHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateOlx(){
        driver.get("https://www.olx.ua/");
    }

    public WebElement getLogo() {
        return driver.findElement(By.xpath("//a[@id='headerLogo']"));
    }

    public WebElement getChangeLangBtn() {
        return driver.findElement(By.xpath("//*[text()='язык']"));
    }

    public WebElement getChangeLangUkrBtn() {
        return driver.findElement(By.xpath("//a[@id='changeLang']"));
    }

    public WebElement getLikeBtn() {
        return driver.findElement(By.xpath("//a[@id='observed-search-link']"));
    }

    public WebElement getSearchFieldBtn(){
        return driver.findElement(By.xpath("//input[@id='submit-searchmain']"));
    }

    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@id='headerSearch']"));
    }
}

