package org.example.My_Way_To_Solve_LeetCode_Problems.string_problem;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
//238. Product of Array Except Self (Medium)
//    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//    You must write an algorithm that runs in O(n) time and without using the division operation.
//
//    Example 1:
//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]
//    Example 2:
//    Input: nums = [-1,1,0,-3,3]
//    Output: [0,0,9,0,0]


        public static int[] productExceptSelf(int[] nums) {
            int lengthNumbs = nums.length;
            int[] output = new int[lengthNumbs];
            int[] output2 = new int[lengthNumbs+1];
            output[0] = 1;
            output2[lengthNumbs] = 1;


           for (int i=1;i<lengthNumbs;i++){
               // pre fix
               output[i] = output[i - 1] * nums[i];

           }
//
            for (int i=lengthNumbs-1;i>=0;i--){
                //postfix
                output2[i] = output2[i+1] * nums[i];
//                System.out.println(output2[i]+" output[i]"+ i);
            }
            for (int i=1;i<lengthNumbs;i++){
                // pre fix
              //  output[i] = output[id] * output2[i+1];

            }
            return output;
        }
    public static void main(String[] args) {
            int[] input = {1,2,3,4};
            int[] output = productExceptSelf(input);
            Arrays.stream(output).forEach(System.out::println);



    }

}
