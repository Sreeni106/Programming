// Given a string s. Write a program to count the number of words in the string

import java.util.Scanner;
class CountWords
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        String s=sc.nextLine(); //how are you
        int count=finder(s);
        System.out.println(count);
    }
    static int finder(String s)
    {
        int count=0;
        char space=' ';
        for(int i=0;i<s.length()-1;i++)    // if we give length()-1 then StringOutOfBoundsException will not accure
        {
            if(s.charAt(i)==space && s.charAt(i+1)!=space)   // look at this instruction 
            {
                count++;
            }
        }
        return s.charAt(0)==' ' ? count : count+1;  // this is written for "if the sentence has space at the start"
    }
}