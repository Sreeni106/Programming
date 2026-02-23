// Check whether the given character is vowels or consonents
import java.util.Scanner;
class CheckAlphabets
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        String s=sc.nextLine();
        countAlphabets(s);
    }
    static void countAlphabets(String s)
    {
        int CountVowel=0;
        int CountConsonent=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if(ch>'a' && ch<='z' &&  !(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
                {
                    CountConsonent++;
                }
                else
                {
                    CountVowel++;
                }
            }
        }
        System.out.println("The vowel count is "+CountVowel);
        System.out.println("The consonent count is "+CountConsonent);
    }
}