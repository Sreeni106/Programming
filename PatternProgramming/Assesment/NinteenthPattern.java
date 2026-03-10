package PatternProgramming.Assesment;

public class NinteenthPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=1;j<=n;j++)
            {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
