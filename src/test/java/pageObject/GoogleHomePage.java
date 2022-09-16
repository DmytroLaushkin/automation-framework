package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage{

    public GoogleHomePage(WebDriver driver){
        super(driver);
    }

    public static WebElement getEnterBtn() {
        return driver.findElement(By.xpath("//a[text()='Картинки']"));
        }
    public WebElement getSearchField() {
        return  driver.findElement(By.xpath("//input[@name= 'q']"));
    }
}
