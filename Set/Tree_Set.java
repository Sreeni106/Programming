package Set;

import java.util.TreeSet;
import java.util.Scanner;

public class Tree_Set {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String word=sc.next();  // mississippi
        String ch=removeDuplicates(word);
        System.out.print(ch);   //imps (It will give alphabetical non-duplicates)
    }
    static String removeDuplicates(String s)
    {
        String t="";
        TreeSet<Character> ch=new TreeSet<Character>();
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
