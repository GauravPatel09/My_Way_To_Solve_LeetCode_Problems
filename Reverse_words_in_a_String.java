package org.example.My_Way_To_Solve_LeetCode_Problems;

import java.util.Arrays;

public class Reverse_words_in_a_String {
    // 151. Reverse Words in a String (Medium)
//    Given an input string s, reverse the order of the words.
//    A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//    Return a string of the words in reverse order concatenated by a single space.
//    Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
//    Example 1:
//    Input: s = "the sky is blue"
//    Output: "blue is sky the"
//    Example 2:
//    Input: s = "  hello world  "
//    Output: "world hello"
//    Explanation: Your reversed string should not contain leading or trailing spaces.
//    Example 3:
//    Input: s = "a good   example"
//    Output: "example good a"
//    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

    public static String reverseWords(String s) {
        s = s.trim();
        String[] word_arrays = s.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = word_arrays.length - 1; i >= 0; i--) {
            if (word_arrays[i].isEmpty()) {
            } else if (i == 0) {
                output.append(word_arrays[i]);
            } else {
                output.append(word_arrays[i] + " ");
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        reverseWords(" Hello words   ");
        reverseWords("the sky is blue");
        reverseWords("a good   example");
    }
}
