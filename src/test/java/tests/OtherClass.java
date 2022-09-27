package tests;

import org.testng.annotations.Test;
import tests.TeatJavaDemo;

public class OtherClass {

    @Test
    public void doit(){
        TeatJavaDemo teatJavaDemo = new TeatJavaDemo();

        System.out.println(teatJavaDemo.AGE);

        System.out.println(teatJavaDemo.summ(5, 5));
    }
}
