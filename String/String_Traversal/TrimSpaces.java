// Given a string s. write a program to trim all the spaces from the starting and ending of the string

import java.util.Scanner;
public class TrimSpaces {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.nextLine();
        String result=trim(s);
        System.out.println(result);
    }
    static int findStarting(String s)
    {
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                start+=i;
                break;
            }
        }
        return start;
    }
    static int findEnding(String s)
    {
        int end=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                end+=i;
                break;
            }
        }
        return end;
    }
    static String trim(String s)
    {
        String t="";
        for(int i=findStarting(s);i<=findEnding(s);i++)
        {
            char ch=s.charAt(i);
            if(ch!=' '||(ch==' ' && s.charAt(i+1)!=' '))   // I tried this line.
            {
                t+=ch;
            }
        }
        return t;
    }
}
