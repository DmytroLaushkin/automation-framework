import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

import static pageObject.BasePage.driver;

public class JabkoPage {
    public JabkoPage(WebDriver driver) {

    }

    public WebElement clickMacBtn() {
        return driver.findElement(new By.ByXPath("//*[@href='https://jabko.ua/lutsk/mac/macbook-air/macbook-air--2020--with-apple-m1/']"));

    }
    public static void mouseMoved (int type){
            Point p = MouseInfo.getPointerInfo().getLocation();
            int width = (int) p.getX() + 30;
            int heigh = (int) p.getY() + 30;
            if(type == 0) {
                width = 10;
                heigh = 15;
            }
            Robot robot;
            try {
                robot = new Robot();
                robot.mouseMove(width,heigh);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
}
