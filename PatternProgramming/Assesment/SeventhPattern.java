package PatternProgramming.Assesment;

public class SeventhPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(0+" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
// 1 1 1 1 1 
// 0 1 1 1 1 
// 0 0 1 1 1 
// 0 0 0 1 1 
// 0 0 0 0 1