// Reverse a given string "Hello" into "olleH"
class Reverse
{
    public static void main(String[]args)
    {
        String s="Madam";
        String t="";
        for(int i=s.length()-1;i>=0;i--)
        {
            t+=s.charAt(i);
        }
        System.out.println(t);
    }
}