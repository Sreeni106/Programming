// Given an array of n integers. Write a program to print all the pairs present in the array.
import java.util.Scanner;
class Printpairs
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
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}