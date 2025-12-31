// Given an array of n integers and an integer value size. Write a program to print the subarrays of length size whose sum is equal to K.
import java.util.Scanner;
class SumOfKSubArray
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sub=sc.nextInt();
        int number=sc.nextInt();
        for(int i=0;i<=arr.length-sub;i++)
        {
            int temp=0;
            for(int j=i;j<i+sub;j++)
            {
                temp+=arr[j];
                if(temp==number)
                {
                    for(int k=i;k<i+sub;k++)
                    {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}