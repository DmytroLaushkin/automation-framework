package tests;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class LambdaExample {
    @Test

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(1);

        list.forEach((n) -> {
            System.out.println(n);
        });
    }
}

