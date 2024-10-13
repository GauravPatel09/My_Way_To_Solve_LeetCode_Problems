package org.example.My_Way_To_Solve_LeetCode_Problems.string_problem;

public class License_Key_Formatting {
    //    482. License Key Formatting      (Easy)
//    You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.
//    We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups,
//    ,and you should convert all lowercase letters to uppercase.
//    Return the reformatted license key.
//      Example 1:
//    Input: s = "5F3Z-2e-9-w", k = 4
//    Output: "5F3Z-2E9W"
//    Explanation: The string s has been split into two parts, each part has 4 characters.
//    Note that the two extra dashes are not needed and can be removed.
    public static String  licenseKeyFormatting(String s, int k) {
        String input = s.replaceAll("-", "").toUpperCase();
        int lengthOfString = input.length();
        int counter = k;
        StringBuilder output = new StringBuilder();
        for (int i = lengthOfString - 1; i >= 0; i--) {//
            if (counter == 0) {
                output = output.append("-");
                counter = k;
                System.out.println("");
            }
            counter--;
            output = output.append(String.valueOf(input.charAt(i)));
        }
        String out = (output.reverse()).toString();
        String f1 = " merge ne magaj mari added"; // this line for practicing Git branching only
        return out;
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-5g-3-JAwe", 3));
    }
}
