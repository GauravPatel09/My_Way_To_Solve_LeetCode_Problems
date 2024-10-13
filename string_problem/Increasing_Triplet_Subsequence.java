package org.example.My_Way_To_Solve_LeetCode_Problems.string_problem;

public class Increasing_Triplet_Subsequence {
//    Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
//    Example 1:
//    Input: nums = [1,2,3,4,5]
//    Output: true
//    Explanation: Any triplet where i < j < k is valid.
//    Example 2:
//    Input: nums = [5,4,3,2,1]
//    Output: false
//    Explanation: No triplet exists.
//    Example 3:
//    Input: nums = [2,1,5,0,4,6]
//    Output: true
//    Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
    public static boolean increasingTriplet(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] < nums[i + 1]) {
                if (nums[i + 1] < nums[i + 2]) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int nums[] = new int[5];
        nums = new int[]{2, 1, 5, 0, 4, 6};
        System.out.println(increasingTriplet(nums));
    }
}
