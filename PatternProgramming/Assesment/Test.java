package PatternProgramming.Assesment;

public class Test {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            char ch=(char)('F'-i);
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print(ch+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            char ch=(char)('F'-i);
            for(int j=1;j<=i;j++)
            {
                if(i==j || j==1)
                {
                    System.out.print(ch+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
