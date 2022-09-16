package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestInit {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
//    public void terDown() {
//        driver.quit();
//    }

    public void GoToGoogle() {
        driver.get("https://www.google.com.ua/");
    }

    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@name= 'q']"));
    }

    public void openUrl(String url) {
        driver.get(url);
    }
}

