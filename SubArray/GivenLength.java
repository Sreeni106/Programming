// Given an array of n integers and an integer value size. Write a program to print all the subarrays of given length size.
import java.util.Scanner;
class GivenLength
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
            for(int j=i;j<i+sub;j++)
            {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}