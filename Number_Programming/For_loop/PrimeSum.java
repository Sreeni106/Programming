package Number_Programming.For_loop;

import java.util.Scanner;

public class PrimeSum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            if(checkPrime(i))
            {
                sum+=i;
            }
        }
        System.out.println(sum);
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
