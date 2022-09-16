import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.ArrayList;
import java.util.List;

public class TestRozetkaPhone extends TestInit {

@Test
public  void checkHomePage() throws InterruptedException {
    RozetkaPage rozetkaPage = new RozetkaPage(driver);
    openUrl("https://rozetka.com.ua/ua/");
    rozetkaPage.getSearchField().sendKeys("iPhone");
    rozetkaPage.getSearchFieldBtn().click();

    Thread.sleep(1000);

    ArrayList<Integer> priceList = new ArrayList<>();
    for (WebElement element : rozetkaPage.allPrice()) {
        String textPrice = element.getText();
        String replaceText = textPrice.replaceAll(" ", "").replaceAll("₴", "");
        Integer parseTexToInteger = Integer.parseInt(replaceText);
        priceList.add(parseTexToInteger);
    }
    int min = priceList.get(0);
    int max = priceList.get(0);

    for (Integer priceElement : priceList) {
        if (priceElement < min) min = priceElement;
        if (priceElement > max) max = priceElement;
    }
    System.out.println("min" + " " + min);
    System.out.println("max" + " " + max);
}
  }


