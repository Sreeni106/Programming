package PatternProgramming.Assesment;

public class SixthPattern {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n+2;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i%2==0)
                {
                    System.out.print("01"+" ");
                }
                else
                {
                    System.out.print("10"+" ");
                }
            }
            System.out.println();
        }
    }
}
