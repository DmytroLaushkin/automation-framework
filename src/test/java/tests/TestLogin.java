package tests;

import org.testng.annotations.Test;

public class TestLogin {

    @Test
    public void checkLogin() {

        summ(1, 2);
        vidnimanja(2, 1);
        mnozenja(3, 3);
        dilenja(4, 2);

    }

    private void summ(int i, int b) {
        println(i + b);
    }

    private void println(int namber) {
        System.out.println(namber);
    }

    private void vidnimanja(int i, int b) {
        println(i - b);
    }

    private void mnozenja(int i, int b) {
        println(i * b);
    }

    private void dilenja(int i, int b) {
        println(i / b);
    }
}