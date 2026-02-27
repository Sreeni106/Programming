package String.SubString.My_Experiments;

public class PrintAllSubStrings {
    public static void main(String[] args) {
        String s="Indiaismycountry";
        printSubStrings(s);
    }
    static void printSubStrings(String s)
    {
        String t="";
        for(int size=s.length();size>=1;size--)
        {
            for(int i=0;i<s.length()-size;i++)
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
