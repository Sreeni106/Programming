package Set;

import java.util.HashSet;
import java.util.Scanner;

public class Hash_Set {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String word=sc.next();  // mississippi
        String ch=removeDuplicates(word);
        System.out.print(ch);   //psim (Random Non-duplicates)
    }
    static String removeDuplicates(String s)
    {
        String t="";
        HashSet<Character> ch=new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            ch.add(s.charAt(i));
        }
        for(Character i:ch)
        {
            t+=i;
        }
        return t;
    }
}
