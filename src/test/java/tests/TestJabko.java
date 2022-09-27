package tests;

import org.testng.annotations.Test;
import pages.JabkoPage;
import tests.TestInit;

public class TestJabko extends TestInit {

    @Test
    public void findMac(){
        JabkoPage jabkoPage = new JabkoPage(driver);
        openUrl("https://jabko.ua/");
        jabkoPage.mouseMoved(10);




    }


}
