package org.example.My_Way_To_Solve_LeetCode_Problems.string_problem;

public class To_Lower_Case {
     public static String toLowerCase(String s) {
         //return s.toLowerCase(); // one line solution but if someone restrict to use inbuilt
         // REFER To ASCII table so get idea of value A to Z // a to z
         char[] input = s.toCharArray();
         // char[] output = s.toCharArray(); // removing this as help us ( memory utilization )
             for(int i=0;i<input.length;i++){
                 // as per ASCII table we need to add 32
                 if(input[i]<=90 && input[i]>=65){
                     input[i]= (char) (input[i] +32);
                 }
             }
         return new String(input);
         }

    public static void main(String[] args) {
        String s="Hello"; // test 1
        String s1="LOVELY"; // test 2
        String s2="here"; // test 2
        String output = new String();
        System.out.println(  toLowerCase(s1) +" "+ toLowerCase(s2) +" "+  toLowerCase(s)  );

    }


}
