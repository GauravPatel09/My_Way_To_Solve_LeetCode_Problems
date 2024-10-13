package org.example.My_Way_To_Solve_LeetCode_Problems.string_problem;

import java.util.ArrayList;
import java.util.List;
public class Kids_With_the_Greatest_Number_of_Candies {
    //    1431. Kids With the Greatest Number of Candies (Easy)
//    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//    Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//    Note that multiple kids can have the greatest number of candies.
//    Example 1:
//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]
//    Explanation: If you give all extraCandies to:
//              - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//              - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//              - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//              - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//              - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
    static class Solution {
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> result = new ArrayList<>();
            int max_candy = 0;
            for (int candy : candies) {
                max_candy = Math.max(max_candy, candy);
            }
            for (int candy : candies) {
                result.add(max_candy <= extraCandies + candy);
//               this line same works as bellow Code
//                if (max_candy <= extraCandies + candy) {
//                    result.add(true);
//                } else {
//                    result.add(false);
//                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        List<Boolean> result = Solution.kidsWithCandies(candies, 3);
        System.out.println(result);

    }

}
