// WAJP to sum the n-1 length of elements in an array for every possible. And print the max and min sum of the elements.
import java.util.Scanner;
class SumArray
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        int count=0;
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
        int[] sum=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j){
                    sum[i]+=arr[j];
                }
            }
        }
        System.out.println("Sum array:");
        for(int i=0;i<sum.length;i++)
        {
            System.out.print(sum[i]+" ");
        }
        System.out.println();
        // Find largest element.
        int large=Integer.MIN_VALUE; 
        for(int i=0;i<sum.length;i++)
        {
            if(sum[i]>large)
            {
                large=sum[i];
            }
        }
        System.out.println("largest:"+large);
        // Minn value
        int small=Integer.MAX_VALUE; 
        for(int i=0;i<sum.length;i++)
        {
            if(sum[i]<large)
            {
                small=sum[i];
            }
        }
        System.out.println("Smallest:"+small);
    }
}

