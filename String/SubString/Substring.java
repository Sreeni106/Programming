package String.SubString;

import java.util.Scanner;

// Given a string . write a program to print all the substring of length 4
public class Substring {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s="mississippi";
        int size=sc.nextInt();
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
            System.out.println(t);
        }
    }
}
