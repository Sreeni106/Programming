package Word_Manipulation;

import java.util.Scanner;

public class Reverse {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.nextLine();
        String[] arr=Split(trim(s));
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(reverse(arr[i])+" ");
        }
    }
    static String[] Split(String s)
    {
        String[] ar=new String[countWords(s)];
        String t="";
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                t+=s.charAt(i);
            }
            else
            {
                ar[j]=t;
                j++;
                t="";
            }
        }
        ar[j]=t;
        return ar;
    }
    static int countWords(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return s.charAt(0)==' ' ? count:count+1;
    }
    static String trim(String s)
    {
        int start=0,end=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                start=i;
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                end=i;
                break;
            }
        }
        String t="";
        for(int i=start;i<=end;i++)
        {
            if(s.charAt(i)!=' ' || s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                t+=s.charAt(i);
            }
        }
        return t;
    }
    static String reverse(String s)
    {
        String t="";
        for(int i=s.length()-1;i>=0;i--)
        {
            t+=s.charAt(i);
        }
        return t;
    }
}
