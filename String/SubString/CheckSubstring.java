package String.SubString;

import java.util.Scanner;

// Given two string s1 and s2. Write a program to check whether string s2 is present in s1.
public class CheckSubstring {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(checkPresent(s1, s2));
    }
    static String checkPresent(String s1,String s2)
    {
        String t="";
        for(int i=0;i<=s1.length()-s2.length();i++)
        {
            t="";
            for(int j=i;j<i+s2.length();j++)
            {
                t+=s1.charAt(j);
            }
            if(s2.equals(t))
            {
                return "Yes";
            }
        }
        return "No";
    }
}
