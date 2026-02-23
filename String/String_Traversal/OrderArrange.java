// Assesment : H$e2l3lo5 into Hello10 . whatever the number tht should be sum. First uppercase->
import java.util.Scanner;
public class OrderArrange {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.next();   // H$e2l3lo5#
        String res=reArrange(s);
        System.out.println(res);
    }
    // static String reArrange(String s)
    // {
    //     String st="";
    //     int num=0;
    //     for(int i=0;i<s.length();i++)
    //     {
    //         char ch=s.charAt(i);
    //         if(ch>='A'&&ch<='Z')
    //         {
    //             st+=ch;
    //         }
    //     }
    //     for(int i=0;i<s.length();i++)
    //     {
    //         char ch=s.charAt(i);
    //         if(ch>='a'&&ch<='z')
    //         {
    //             st+=ch;
    //         }
    //     }
    //     for(int i=0;i<s.length();i++)
    //     {
    //         char ch=s.charAt(i);
    //         if(ch>='0' && ch<='9')
    //         {
    //             st+=ch;
    //         }
    //     }
    //     return st+num;
    // }
    static String reArrange(String s)
    {
        String Up="",Lo="";
        int In=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                Up+=ch;
            }
            else if(ch>='a'&&ch<='z')
            {
                Lo+=ch;
            }
            else if(ch>='0' && ch<='9')
            {
                In+=ch-'0';
            }
        }
        return Up+Lo+In;
    }
}
