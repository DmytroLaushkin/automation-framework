import org.openqa.selenium.WebDriver;
import pageObject.BasePage;

public class OlxHome extends BasePage {
    public OlxHome(WebDriver driver) {
        super(driver);
    }


    public void visitOlx() {
        driver.get("https://www.olx.ua/");
    }
}
