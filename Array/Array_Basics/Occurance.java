// Given an array of n integers and an integer value k.Write a program to print the number of occurance of k in the array.
import java.util.Scanner;
class Occurance
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
        System.out.println("Enter the value for occurance:"); //2
        int occ=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(occ==arr[i])
            {
                count++;
            }
        }
        System.out.println("Count :"+count);   // it will print occording to the occurance number.
    }
}