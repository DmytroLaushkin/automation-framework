import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObject.BasePage;
import tests.TestInit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.testng.Assert.assertEquals;

public class AmazonTestException extends TestInit {


   @Test
      public void exceptionTest() {

        AmazonTestException amazonTestException = new AmazonTestException();

      openUrl("https://www.amazon.com/");

          try {
            driver.findElements(By.xpath("//adwd"));
          System.out.println("yes");}
    catch(Exception e){
          System.out.println("no");
    }
   }
    }