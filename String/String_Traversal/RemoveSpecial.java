// Given a string s .write a program to remove all the spcial characters from the string
import java.util.Scanner;
public class RemoveSpecial {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.next();
        String Final=check(s);
        System.out.println(Final);
    }
    static String check(String s)
    {
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
            {
                temp+=ch;
            }
        }
        return temp;
    }
}
