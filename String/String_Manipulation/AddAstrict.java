package String.String_Manipulation;
// Given a string s. Write a program to print '*' before 'a' in s. (i did for vowels)
import java.util.Scanner;
public class AddAstrict {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.nextLine();  // banana
        System.out.println(checkVowels(s));
    }
    // static String addStar(String s)
    // {
    //     String t="";
    //     for(int i=0;i<s.length();i++)
    //     {
    //         char ch=s.charAt(i);
    //         if(ch=='a')
    //         {
    //             t=t+'*'+ch;
    //         }
    //         else
    //         {
    //             t+=ch;
    //         }
    //     }
    //     return t;
    // }
    static String checkVowels(String s)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char cha=s.charAt(i);
            if((cha>='a' && cha<='z' || cha>='A' && cha<='Z')&&((cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u')||(cha=='A'||cha=='E'||cha=='I'||cha=='O'||cha=='U')))
            {
                t=t+'*'+cha;
            }
            else
            {
                t+=cha;
            }
        }
        return t;
    }
}
