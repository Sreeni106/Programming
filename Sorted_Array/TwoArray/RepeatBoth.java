// Given two sorted arrays of integer values. Write a program to print the elements which are repeated in both arrays.
import java.util.Scanner;
class RepeatBoth
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.println("Enter the first array size: ");
        int firstSize=sc.nextInt();
        int[] arr=new int[firstSize];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("First array:"); // 3 5 6 8 9
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the Second array size: ");
        int secondSize=sc.nextInt();
        int[] arr1=new int[secondSize];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Second array:");  // 2 3 4 6 7 8 8 
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int i=0,j=0;
        while(i<arr.length && j<arr1.length)
        {
            if(arr[i]==arr1[j])
            {
                System.out.println(arr[i]);
                i++;
                j++;
            }
            else if(arr[i]>arr1[j])
            {
                j++;
            }
            else
            {
                i++;
            }
        }
    }
}