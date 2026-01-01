// Given an array of n integers. Write a program to print all the subarrays of the array
import java.util.Scanner;
class AllSubArray
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        int size=sc.nextInt();   // 5
        int[] arr=new int[size]; // 3 5 1 7 2
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int num=1;num<=arr.length;num++)
        {
            for(int i=0;i<=arr.length-num;i++)
            {
                for(int j=i;j<i+num;j++)
                {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
    //! This is not a good way of writing 
    // static void printAll(int[] arr)
    // {
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         System.out.println(arr[i]);
    //     }
    //     int i=0,j=1;
    //     while(j<arr.length)
    //     {
    //         System.out.println(arr[i]+" "+arr[j]);
    //         i++;
    //         j++;
    //     }
    //     int a=0,b=1,c=2;
    //     while(c<arr.length)
    //     {
    //         System.out.println(arr[a]+" "+arr[b]+" "+arr[c]);
    //         a++;
    //         b++;
    //         c++;
    //     }
    //     int d=
    // }
}