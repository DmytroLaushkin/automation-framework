import org.testng.annotations.Test;
import tests.TestInit;

import static java.lang.Math.random;
import static java.util.Collections.fill;

public class TestJabko extends TestInit {

    @Test
    public void findMac(){
        JabkoPage jabkoPage = new JabkoPage(driver);
        openUrl("https://jabko.ua/");
        jabkoPage.mouseMoved(10);




    }


}
