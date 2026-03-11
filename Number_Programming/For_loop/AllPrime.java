package Number_Programming.For_loop;

import java.util.Scanner;

public class AllPrime {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(checkPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    static boolean checkPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
