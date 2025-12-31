// Given an array of n integers and an integer value size. Write a program to print the count of subarrays of length size whose sum is equal to K.
import java.util.Scanner;
class SumOfK
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
        int count=0;
        for(int i=0;i<=arr.length-sub;i++)
        {
            int temp=0;
            for(int j=i;j<i+sub;j++)
            {
                temp+=arr[j];
                if(temp==number)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}