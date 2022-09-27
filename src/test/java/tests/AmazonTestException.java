package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

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