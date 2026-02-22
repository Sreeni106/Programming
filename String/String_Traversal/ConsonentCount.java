// Given a string s. Write a program to count the number of consonent in the string
import java.util.Scanner;
class ConsonentCount
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        String s=sc.next();
        int count=vowelCount(s);
        System.out.println(count);
    }
    static int vowelCount(String s)
    {
        int count=0;
        s=s.toLowerCase();   // Or use wrapper class "char ch = Character.toLowerCase(s.charAt(i));"
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>'a' && ch<='z' &&(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
            {
                count++;
            }
        }
        return count;
    }
}