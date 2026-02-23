// Assesment : H$e2l3lo5 into Hello10 . whatever the number tht should be sum
import java.util.Scanner;
public class OrderArrange {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.next();   // H$e2l3lo5#
        String res=reArrange(s);
        System.out.println(res);
    }
    static String reArrange(String s)
    {
        String st="";
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
            {
                st+=ch;
            }
            else if(ch>='0' && ch<='9')
            {
                num+=ch-'0';
            }
        }
        return st+num;
    }
}
