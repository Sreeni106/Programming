package Array.Consecutive_Subarrays;

import java.util.Scanner;
//Given an array of n integers, write a program to print the length of the longest consecutive subarray
public class LargestConsecutive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt(); //10
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt(); //5 12 13 14 9 2 3 4 5 8
        }
        printConsecutive(arr);
    }
    static void printConsecutive(int[] arr)
    {
        int count=1,largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            int sum=arr[i+1]-arr[i];
            if(sum==1)
            {
                //System.out.print(arr[i]+" ");
                count++;
            }
            else
            {
                //System.out.print(arr[i]);
                //System.out.println(count);
                if(count>largest)
                {
                    largest=count;
                }
                count=1;
            }
        }
        if(count>largest)
        {
            largest=count;
        }
        System.out.print(largest);
    }
}
