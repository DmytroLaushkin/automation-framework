package tests;

import org.testng.annotations.Test;

import static java.lang.Math.*;


public class TestMathOperation {

    @Test
    private void Test (String[] args){
            double b = Math.random();
            System.out.println(b);
        }
    }


    //    public class MathOperation {
//        public static void main(String[] args) {
//            double a = Math.random();
//            System.out.println(a);
//        }
//    }
//    public class Test {
//        public static void main(String[] args) {
//            double a = Math.random() * 3;
//
//            System.out.println(a);
//        }
//    }



    //@Test
    //  public void checkSumm(){
    // summ(4,5) == 9 expected 9
    //     Assert.assertTrue(summ(4, 5) == 9);
    // summ(2,6) == 8 expected 8
    //   Assert.assertTrue(summ(2, 6) == 10);
    // summ(40,5) ==  45 expected 45
    // Assert.assertTrue(summ(40, 5) == 45);

    //   }

//    @Test
//    public void checkMult(){
//        Assert.assertTrue(mult(2,5) == 1);
//        Assert.assertTrue(mult(2,6) == 12);
//        Assert.assertTrue(mult(2,7) == 14);
//    }
//
//    public int summ(int a, int b){
//        return a + b;
//    }
//    public int mult(int a, int b){
//        return a * b;
//    }
//}

