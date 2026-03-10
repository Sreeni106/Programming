package PatternProgramming.Assesment;

public class SeventeenPattern {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++)
        {
            int countRev=(count+i)-1;
            for(int j=1;j<=i;j++)
            {
                if(i%2==0)
                {
                    System.out.print(countRev-- +" ");
                    count++;
                }
                else
                {
                    System.out.print(count++ +" ");
                }
            }
            System.out.println();
        }
    }
}
