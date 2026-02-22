// Given a string s. Write a program to print the number of spaces in the string
import java.util.Scanner;
class SpaceFinder
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
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==space)
            {
                count++;
            }
        }
        return count;
    }
}