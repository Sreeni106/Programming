package Array.Consecutive_Subarrays;

import java.util.Scanner;

public class IncreasingOrder {
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
        int count=1,largest=Integer.MIN_VALUE,ei=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                // System.out.print(arr[i]+" ");
                count++;
            }
            else
            {
            //     //System.out.print(arr[i]);
            //     //System.out.println(count);
                if(count>largest)
                {
                    largest=count;
                    ei=i;
                }
                count=1;
            }
        }
        if(count>largest)
        {
            largest=count;
            ei=arr.length-1;
        }
        int start=(ei-largest)+1;
        for(int i=start;i<=ei;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
