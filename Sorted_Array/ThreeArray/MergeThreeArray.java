// Given three arrays of integer values . Write a program to merge these three arrays as shown in the ouyput.
import java.util.Scanner;
class mergeSortedArrays
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the size-1:");
        int size1=sc.nextInt();
        int[] arr1=new int[size1];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size-2:");
        int size2=sc.nextInt();
        int[] arr2=new int[size2];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter the size-3:");
        int size3=sc.nextInt();
        int[] arr3=new int[size3];
        for(int i=0;i<arr3.length;i++)
        {
            arr3[i]=sc.nextInt();
        }
        int[] arr4=mergedArray(arr1,arr2,arr3);
        for(int i=0;i<arr4.length;i++)
        {
            System.out.print(arr4[i]+" ");
        }
    }
    public static int[] mergedArray(int[]arr1,int[]arr2,int[]arr3)
    {
        int size4=arr1.length+arr2.length+arr3.length;
        int[] arr4=new int[size4];
        int i=0,j=0,k=0,l=0;
        while(i<arr1.length && j<arr2.length && k<arr3.length)
        {
            if(arr1[i]<arr2[j] && arr1[i]<arr3[k])
            {
                arr4[l]=arr1[i];
                l++;
                i++;
            }
            else if(arr2[j]<arr3[k] && arr2[j]<arr1[i])
            {
                arr4[l]=arr2[j];
                l++;
                j++;
                
            }else
            {
                arr4[l]=arr3[k];
                l++;
                k++;
            }
        }
        while(j<arr2.length && k<arr3.length)
        {
        if(arr2[j]<=arr3[k])
        {
            arr4[l++]=arr2[j++];
        }
        else
        {
            arr4[l++]=arr3[k++];
        }
        }
        while(i<arr1.length && k<arr3.length)
        {
        if(arr1[i]<=arr3[k])
        {
            arr4[l++]=arr1[i++];
        }
        else
        {
            arr4[l++]=arr3[k++];
        }
        }
        while(i<arr1.length && j<arr2.length)
        {
        if(arr1[i]<=arr2[j])
        {
            arr4[l++]=arr1[i++];
        }
        else
        {
            arr4[l++]=arr2[j++];
        }
        }
        while(i<arr1.length)
        {
        arr4[l++]=arr1[i++];
        }
        while(j<arr2.length)
        {
        arr4[l++]=arr2[j++];
        }
        while(k<arr3.length)
        {
        arr4[l++]=arr3[k++];
        }
        return arr4;
    }
}