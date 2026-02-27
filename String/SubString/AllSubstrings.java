package String.SubString;
// Given a string s.Write a program to print all the substrings
public class AllSubstrings {
    public static void main(String[] args) {
        String s="hello";
        for(int i=1;i<=s.length();i++)  // We can also print largest to smallest
        {
            printAll(s, i);
        }
    }
    static void printAll(String s,int size)
    {
        String t="";
        for(int i=0;i<=s.length()-size;i++)
        {
            t="";
            for(int j=i;j<i+size;j++)
            {
                t+=s.charAt(j);
            }
            System.out.println(t);
        }
    }
}
