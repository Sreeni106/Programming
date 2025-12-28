// Given an array of n integer.Write a program to print the resultant array with the product of n-1 elements present in the array
import java.util.Scanner;
class ProductArray
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
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
            System.out.print(arr[i]+" ");   // 3 5 2 1 4
        }
        System.out.println();
        int[] product=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            product[i]=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j){
                    product[i]*=arr[j];
                }
            }
        }
        System.out.println("Sum array:");
        for(int i=0;i<product.length;i++)
        {
            System.out.print(product[i]+" ");  // 40 24 60 120 30
        }
        System.out.println();
    }
}