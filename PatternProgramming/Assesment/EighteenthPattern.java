package PatternProgramming.Assesment;

public class EighteenthPattern {
    public static void main(String[] args) {
        int n=5;
        char ch=(char)(('A'+n)-1);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print(ch+" ");
            }
            ch--;
            System.out.println();
        }
    }
}
