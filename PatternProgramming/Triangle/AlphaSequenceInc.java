package PatternProgramming.Triangle;

public class AlphaSequenceInc {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            char count='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
