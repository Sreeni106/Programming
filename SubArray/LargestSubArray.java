// Given an array of n integers and an integer value size. Write a program to print the sum of all the subarrays of given length size.
// 5 1 0 1 0 2 3 1 0 5
import java.util.Scanner;
class SumSubArray
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
        for(int i=0;i<=arr.length-sub;i++)
        {
            int temp=0;
            for(int j=i;j<i+sub;j++)
            {
                temp+=arr[j];
            }
            System.out.println(temp);
        }
    }
}