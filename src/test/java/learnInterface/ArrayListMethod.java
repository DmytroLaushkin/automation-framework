package learnInterface;

import java.util.ArrayList;

public interface ArrayListMethod {
    public class Main{
        public static void main (String[] args){
            ArrayList<Integer> myNumbers = new ArrayList<Integer>();
            myNumbers.add(1);
            myNumbers.add(1);
            myNumbers.add(1);
            myNumbers.add(1);
            myNumbers.add(1);
            myNumbers.add(1);
            myNumbers.add(1);
            myNumbers.add(1);
            myNumbers.add(1);
            myNumbers.add(1);
            int sum = 0;
            for (int number : myNumbers){
                sum += number;
            }
            System.out.println(sum);
        }
    }
}
