// Check whether the given string is palindrome
import java.util.Scanner;
class CheckPalindrome
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        String s=sc.next();  // racecar
        String status=check(s);
        System.out.println(status);
    }
    static String check(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return "Not palindrome";
            }
        }
        return "Palindrome";
    }
}