// Convert Upper case string into lower without in-Build method
import java.util.Scanner;
public class ConvertUpper {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.nextLine();
        String Upper=convert(s);
        System.out.println(Upper);
    }
    static String convert(String s)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z')
            {
                t+=(char)(ch-32);  // Look at this there is a difference between t+=ch+32 and t=t+ch+32;
            }
            else
            {
                t+=ch;
            }
        }
        return t;
    }
}

