package PatternProgramming.Assesment;

public class TwentythPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            char ch='A';
            for(int k=1;k<=i;k++)
            {
                System.out.print("  ");
                ch++;
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
