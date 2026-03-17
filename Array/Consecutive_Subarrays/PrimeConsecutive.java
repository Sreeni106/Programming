package Array.Consecutive_Subarrays;

import java.util.Scanner;

public class PrimeConsecutive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt(); //10
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt(); //1 2 3 4 8 7 11 10
        }
        printConsecutive(arr);
    }
    static void printConsecutive(int[] arr)
    {
        boolean inGroup=false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(checkPrime(arr[i]))
            {
                System.out.print(arr[i]+" ");
                inGroup=true;
            }
            else
            {
                if(inGroup)
                {
                    System.out.println();
                    inGroup=false;
                }
            }
        }
        if(checkPrime(arr[arr.length-1]))
        {
            System.out.print(arr[arr.length-1]);
        }
    }
    static boolean checkPrime(int a)
    {
        if(a<=1)
        {
                return false;
        } 
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
