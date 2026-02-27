package String.String_Manipulation;
// Given two string s and t, check whether string t can be found as a subsequence in string s

import java.util.Scanner;
public class Subsequence {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s="hereiamstackerrank";
        String t="hackerrank";
        System.out.println(checkSequence(s, t));
    }
    static String checkSequence(String s,String t)
    {
        int i=0;
        int j=0;
        while((i<=s.length()-1) && (j<=t.length()-1))
        {
            if(t.charAt(j)==s.charAt(i))
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        return (j==t.length()) ? "Yes": "No";
    }
}
