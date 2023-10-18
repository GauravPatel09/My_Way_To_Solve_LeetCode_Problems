package org.example.leetcode75.My_Way_To_Solve_LeetCode_Problems;

public class License_Key_Formatting {
    public static String  licenseKeyFormatting(String s, int k) {
        String input = s.replaceAll("-", "").toUpperCase();
        int lengthOfString = input.length();
        int counter = k;
        StringBuilder output = new StringBuilder();
        for (int i = lengthOfString - 1; i >= 0; i--) {//
            if (counter == 0) {
                output = output.append("-");
                counter = k;
            }
            counter--;
            output = output.append(String.valueOf(input.charAt(i)));
        }
        String out = (output.reverse()).toString();
        return out;
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-5g-3-JAwe", 3));
    }
}
