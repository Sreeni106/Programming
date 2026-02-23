// Check the given string s. write a program to count the number of vowels,consonants,numerics and special character in the string
import java.util.Scanner;
public class CheckCharacter {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.next();
        checkGiven(s);
    }
    static void checkGiven(String s)
    {
        int vc=0,cc=0,nc=0,sp=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            {
                if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') || (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
                {
                    vc++;
                }else{
                    cc++;
                }
            }
            else if(ch>='0' && ch<='9')
            {
                nc++;
            }
            else{
                sp++;
            }
        }
        System.out.println("Vocal count "+vc);
        System.out.println("Consonent count"+cc);
        System.out.println("Numerical coount"+nc);
        System.out.println("Special count "+sp);
    }
}
