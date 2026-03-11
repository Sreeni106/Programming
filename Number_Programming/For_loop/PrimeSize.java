package Number_Programming.For_loop;
// Given an integer value n. Write a program to print the first n prime numbers.
import java.util.Scanner;

public class PrimeSize {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int num=sc.nextInt();
        System.out.println(checkPrime(num));
        sequenceNumber(num);
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
    static void sequenceNumber(int n)
    {
        int count=0,i=2;
        while(count<n)
        {
            if(checkPrime(i))
            {
                count++;
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
