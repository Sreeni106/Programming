import java.util.Scanner;
public class RearrangeSentence {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.nextLine();
        String result=trim(s);
        System.out.println(result);
    }
    static int findStarting(String s)
    {
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                start+=i;
                break;
            }
        }
        return start;
    }
    static int findEnding(String s)
    {
        int end=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                end+=i;
                break;
            }
        }
        return end;
    }
    static String trim(String s)
    {
        String t="";
        int starting=findStarting(s);
        int ending=findEnding(s);
        for(int i=starting;i<=ending;i++)
        {
            if(s.charAt(i)!=' ' || (s.charAt(i)==' ' && s.charAt(i+1)!=' '))
            {
                t+=s.charAt(i);
            }
        }
        return t;
    }
}
