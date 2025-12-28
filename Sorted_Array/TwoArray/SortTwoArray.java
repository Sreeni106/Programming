//Given two sorted arrays of integer values . Write a program to merge these two arrays such that the resultant array is sorted.
import java.util.Scanner;
class SortTwoArray
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        int firstSize=sc.nextInt();
        int[] arr1=new int[firstSize];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int secondSize=sc.nextInt();
        int[] arr2=new int[secondSize];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int[] res=mergeSortedArrays(arr1,arr2);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] mergeSortedArrays(int[]arr1,int[]arr2)
    {
        int i=0,j=0,k=0;
        int[] res=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                res[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                res[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(j<arr2.length)
        {
            res[k]=arr2[j];
            j++;
            k++;
        }
        while(i<arr1.length)
        {
            res[k]=arr1[i];
            i++;
            k++;
        }
        return res;
    }
}