package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getClickableElement(String locator) {
        WebDriverWait waitClick = new WebDriverWait(driver, Duration.ZERO.getSeconds());
        return waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
    public List<WebElement> getClickableElements(String locator) {
        WebDriverWait waitClick = new WebDriverWait(driver, Duration.ZERO.getSeconds());
        return waitClick.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
    }

    public List<WebElement> findElementsByXpath(String xpath) {
        return getClickableElements(xpath);
    }
    public WebElement findElementByXpath(String xpath) {
        return getClickableElement(xpath);
    }

}