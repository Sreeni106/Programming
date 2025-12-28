// Print element in an array from start to middle
import java.util.Scanner;
class Tomiddle
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the size:");
        int size=sc.nextInt();       
        int[] arr=new int[size];
        System.out.print("Enter the number: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Upto middle");
        upMiddle(arr,size);
    }
    static void upMiddle(int[] arr,int size)
    {
        int middle=size/2;
        for(int i=0;i<middle;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}