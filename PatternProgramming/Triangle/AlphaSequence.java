package PatternProgramming.Triangle;

public class AlphaSequence {
    public static void main(String[] args) {
        int n=5;
        char count='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
            }
            count++;
            System.out.println();
        }
    }
}
// A 
// B B
// C C C
// D D D D
// E E E E E