// Given s sorted array of n integers. Write a program to print the occurrence of each element present in the array.
import java.util.Scanner;
class EachOccurance
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
        int count=1;
        for(int i=0;i<arr.length-1;i++)
        {
                if(arr[i]==arr[i+1])
                {
                    count+=1;
                }
                else
                {
                    System.out.println(arr[i]+"-"+count);  // if you haven't understand , do trace the program.
                    count=1;
                }   
        }
        System.out.println(arr[arr.length-1]+"-"+count);
    }

}