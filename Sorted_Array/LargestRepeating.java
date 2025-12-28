// Given a sorted array of n integere. Write a program to print the largest repeating element present in the array.
import java.util.Scanner;
class LargestRepeating
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
        System.out.println("Original array:");  // 2 3 3 3 4 5 7 7  9 11
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int count=1;
        int largestelement=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
                if(arr[i]==arr[i+1])
                {
                    count+=1;
                    largestelement=arr[i+1]; // This is correct , but not best.
                }
                else
                {
                    count=1;
                }   
        }
        System.out.println("Largest element: "+largestelement);
    }
    // public static int largeRepeat(int[]arr)      // It will take less time to coomplete the code.
    // {
    //     for(int i=arr.length-2;i>=0;i--)
    //     {
    //         if(arr[i]==arr[i+1])
    //         {
    //             return arr[i];
    //         }
    //     }
    // return 0;
    // }
}

