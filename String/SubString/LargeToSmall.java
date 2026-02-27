package String.SubString;

public class LargeToSmall {
    public static void main(String[] args) {
        String s="hello";
        for(int size=s.length();size>=0;size--)  // This line is only for Substring
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
}
