package String.SubString;

import java.util.Scanner;

// Print all palindrome
public class PrintAllPalindrome {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s="mississippi";
        int size=sc.nextInt(); //4
        printString(s,size);
    }
    static void printString(String s,int size)
    {
        String t="";
        for(int i=0;i<=s.length()-size;i++)
        {
            t="";
            for(int j=i;j<i+size;j++)
            {
                t+=s.charAt(j);
            }
            if(CheckPalindrome(t))
            {
                System.out.println(t);
            }
        }
    }
    static boolean CheckPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(j>i)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
