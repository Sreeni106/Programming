package Array.Consecutive_Subarrays;

import java.util.Scanner;
import java.util.Arrays;

public class FindMissingElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        findMissing(arr);
    }
    static void findMissing(int[] arr)  // Easy and efficient
    {
        int sum1=0;
        for(int i=0;i<arr.length;i++)
        {
            sum1+=arr[i];
        }
        int n=arr.length+1;
        int sum2=n*(n+1)/2;
        System.out.println(sum2-sum1);
    }
    // static void findMissing(int[] arr)
    // {
    //     Arrays.sort(arr);
    //     for(int i=0;i<arr.length-1;i++)
    //     {
    //         int sum=arr[i+1]-arr[i];
    //         if(sum!=1)
    //         {
    //             System.out.print(arr[i]+1);
    //             break;
    //         }
    //     }
    // }
    // static void findMissing(int[] arr)
    // {
    //     Arrays.sort(arr);
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]!=i+1)
    //         {
    //             System.out.println(i+1);
    //             break;
    //         }
    //     }
    // }
    // static void findMissing(int[] arr)
    // {
    //     for(int i=1;i<arr.length;i++)
    //     {
    //         boolean flag=true;
    //         for(int j=0;j<arr.length;j++)
    //         {
    //             if(i==arr[j])
    //             {
    //                 flag=false;
    //                 break;
    //             }
    //         }
    //         if(flag)
    //         {
    //             System.out.print(i);
    //         }
    //     }
    // }
}
