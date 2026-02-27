package String.SubString;

public class AllPossibleSub {
    public static void main(String[] args) {
        String s="mississippi";
        for(int size=s.length();size>=1;size--)  // This line is only for Substring
        {
            String t="";
            for(int i=0;i<=s.length()-size;i++)
            {
                t="";
                for(int j=i;j<i+size;j++)
                {
                    t+=s.charAt(j);
                }
                if(checkPalindrome(t))
                {
                    System.out.println(t);
                    // break; it will leads to some problem .So iterate the problem or listern the substring video.
                    return;
                }
            }
        }
    }
    static boolean checkPalindrome(String t)
    {
        int i=0;
        int j=t.length()-1;
        while(j>i)
        {
            if(t.charAt(i)==t.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    } 
}
