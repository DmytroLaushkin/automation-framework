package tests;

import org.testng.annotations.Test;

public class TestArray {

    @Test
    public void checkArray(){
        int age = 12;
        int age1 = 13;
        int age2 = 14;
        int age3 = 15;
        int age4 = 16;

        int[] arr = {12, 13, 14, 15, 16};
        int ar[] = {12, 13, 14, 15, 16};

        System.out.println(arr[0]);

        arr[0] = 100;

        System.out.println(arr[0]);

        int arrDefault[] = new int[10];

        System.out.println(arrDefault[3]);
    }
}
