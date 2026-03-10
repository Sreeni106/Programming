package PatternProgramming.Triangle;

public class SumOfNatural {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int count=i*(i+1)/2;  // Formula for sum of i natural numbers
            for(int j=1;j<=i;j++)
            {
                if(i==j)  //j<=i-1
                {
                    System.out.print(count-j+1 +" ");
                }
                else
                {
                System.out.print(count-j+1 +"*");
                }
            }
            System.out.println();
        }
    }
}
