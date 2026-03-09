package Set;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Linked_Hashset {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String word=sc.next();  // mississippi
        String ch=removeDuplicates(word);
        System.out.print(ch);   //misp (Non duplicates)
    }
    static String removeDuplicates(String s)
    {
        String t="";
        LinkedHashSet<Character> ch=new LinkedHashSet<Character>();
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
