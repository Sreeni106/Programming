package String.SubString;

import java.util.Scanner;
// Given two string s1 and s2. Write a program to print the number of occurance of string s2 in String s1
public class CountSubstring {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(checkPresent(s1, s2));
    }
    static int checkPresent(String s1,String s2)
    {
        String t="";
        int count=0;
        for(int i=0;i<=s1.length()-s2.length();i++)
        {
            t="";
            for(int j=i;j<i+s2.length();j++)
            {
                t+=s1.charAt(j);
            }
            if(s2.equals(t))
            {
                count++;
            }
        }
        return count;
    }
    
}
