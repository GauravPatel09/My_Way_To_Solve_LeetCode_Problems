package org.example.My_Way_To_Solve_LeetCode_Problems;


public class Reverse_Vowels_of_a_String {
//    345. Reverse Vowels of a String  (Easy)
//    Given a string s, reverse only all the vowels in the string and return it.
//    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//    Example 1:
//    Input: s = "hello"
//    Output: "holle"
//
//    Example 2:
//    Input: s = "leetcode"
//    Output: "leotcede"


        public static String reverseVowels(String s) {
            char[] ch = s.toCharArray();
            StringBuilder output = new StringBuilder();
            for(int i =0; i<ch.length;i++){
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'||
                        ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'){
                    output.append(ch[i]);
                }
            }
            output.reverse();
            char[] rev_vowels = output.toString().toCharArray();
            int count =0;
            for(int i =0; i<ch.length;i++){
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'||
                        ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
                {
                    ch[i] = rev_vowels[count]; // replace value on that vowels index as we already have reverse vowels array
                    count++; // going to next vowels by adding plus one
                }
            }
            return String.valueOf(ch);
        }

    public static void main(String[] args) {
        System.out.println( reverseVowels("hello"));
        System.out.println( reverseVowels("leetCODE"));
    }


}
