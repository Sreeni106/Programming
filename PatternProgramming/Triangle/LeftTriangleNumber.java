package PatternProgramming.Triangle;


public class LeftTriangleNumber {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
// pattern i
// 1 
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// pattern j
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5