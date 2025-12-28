// the starting number should be even.  Like this in interview they can ask any variations
import java.util.Scanner;
class Evenpair
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
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The pairs are:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]%2==0){
                System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}

// Given an array of integers count the number of inversion. arr[i]> arr[j] and i < j . you should not write and in the statement because it already doing the work.
// public static void main(String [] args)
//     {
//         System.out.println("Enter the size:");
//         int size=sc.nextInt();       
//         int[] arr=new int[size];
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println("Enter the number: ");
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Original array:");
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         System.out.println("The pairs are:");
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[i] > arr[j]){  
//                 System.out.println(arr[i]+" "+arr[j]);
//                 }
//             }
//         }
//     }