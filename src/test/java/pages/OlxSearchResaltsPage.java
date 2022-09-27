package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlxSearchResaltsPage extends BasePage {
    public static boolean getResaltsField;

    public OlxSearchResaltsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultsField(){
       return driver.findElement(By.xpath("//*[text()='Фильтры']"));
    }
}
