package String.String_Manipulation;
// Given a string s and character k,Write a program to print the index of the k in s.
import java.util.Scanner;
public class FindIndex {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.nextLine();
        char k=sc.nextLine().charAt(0);
        System.out.println(checkIndex(s,k));
    }
    static int checkIndex(String s,char k)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==k)
            {
                count++;
            }
            if(ch==k && count==2)
            {
                return i;
            }
        }
        return -1;
    }
    
}
