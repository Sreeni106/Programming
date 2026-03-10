package PatternProgramming.Assesment;

public class TenthPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int count=1;
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
                count++;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
