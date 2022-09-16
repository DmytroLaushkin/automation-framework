package tests;

import org.testng.annotations.Test;

public class TestStrings {

    @Test

    public void testString(){
        String sourseStr = "hello it is me";
        System.out.println(sourseStr.length());

        System.out.println(sourseStr.charAt(0));

        System.out.println(sourseStr.substring(3));

        System.out.println(sourseStr.substring(sourseStr.length()-3));

        System.out.println(sourseStr.contains("is"));
    }
}
