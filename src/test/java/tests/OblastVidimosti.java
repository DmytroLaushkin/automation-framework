package tests;

import org.testng.annotations.Test;

public class OblastVidimosti {

    double age = 33;
    String name = "Dima" + " is here";
    boolean www = true;
    int a = 5;
    int b = 7;


    @Test
    public void doit(){
        System.out.println(name + ". Or not?");
        System.out.println(12.0/5.0);
        System.out.println("a" == "b");
 }

    @Test
    public void doitTo(){
        System.out.println(age);
        age = 20.5;
        System.out.println(age);
    }
}

