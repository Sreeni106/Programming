// Given an array of n integers. Write a program to print the index of the largest element present in the array
import java.util.Scanner;
class LargestEleIndex
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the size:");
        int size=sc.nextInt();       
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the number: ");
            arr[i]=sc.nextInt();
        }
        int large=arr[0];
        int index=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
                index=i;
            }
        }
    //     int index=0;                 This is not a great method
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(large==arr[i])
    //         {
    //             index=i;
    //         }
    //     }
    //     System.out.println("Largest element index is:"+index);
    // 
    }
}
