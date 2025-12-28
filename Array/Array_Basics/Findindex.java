// Given an array of n integers and an integer value k.write a program to print the index of k in the array.
import java.util.Scanner;
class Findindex
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
        System.out.println("Enter the element: ");
        int element=sc.nextInt();
        int index=findindex(arr,element);
        System.out.println("The index of"+element+"is : "+index);
}
static int findindex(int[] arr,int element)
{
    int index=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==element)
        {
            index=arr[i];
        }
    }
    return index;
}
}