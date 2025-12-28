// Given a sorted array of n integers. write a program to print all the array without repeating.
import java.util.Scanner;
class Norepeat
{
    static Scanner sc=new Scanner (System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the size:");
        int size=sc.nextInt();       
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");  // 2 2 2 3 4 4 4 23
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length-1;i++)
        {
                if(arr[i]!=arr[i+1])
                {
                    System.out.println(arr[i]);  // It is the extended version of EachOccurance
                }  
        }
        System.out.println(arr[arr.length-1]);  // it shoould be printed. whether, last number is same or not.
    }
}