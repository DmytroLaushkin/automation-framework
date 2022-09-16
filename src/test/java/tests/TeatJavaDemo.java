package tests;

import org.testng.annotations.Test;

public class TeatJavaDemo {
    public static final boolean AGE = false;

    @Test
    public void doit() {
       int result = summ(5,5);
        System.out.println(result);
    }
        public void run(){
            System.out.println("ranning");
        }

        public int summ(int firstVarieble, int secondVariable){
        return firstVarieble + secondVariable;
        }
    }

