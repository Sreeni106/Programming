package PatternProgramming.Triangle;

public class FlipFlopHollow {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int count=i;
            for(int j=1;j<=(n-i)+1;j++)
            {
                if(i==1 || j==1 || j==(n-i)+1)
                {
                    System.out.print(count+" ");
                }
                else
                {
                    System.out.print("  ");
                }
                count++;
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5 
// 2     5
// 3   5
// 4 5
// 5