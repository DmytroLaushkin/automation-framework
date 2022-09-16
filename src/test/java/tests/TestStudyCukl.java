package tests;

import org.testng.annotations.Test;

public class TestStudyCukl {

    @Test
    public void studyCukl() {

        //     for (int i=1; i>=100; ++i){
        //       System.out.println(i);
        //   }
        //       String name = "Dima";
//
        //      for (int a = 0; a < name.length(); a ++){
        //           System.out.println(name.charAt(a));
        //      }
        int[] nums = {12, 21, 3, 32, 32, 43, 89};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
        int[] nums1 = {12, 21, 3, 32, 32, 43, 89};

        for (int elements : nums) {
            System.out.println(elements);

        }
    }
}