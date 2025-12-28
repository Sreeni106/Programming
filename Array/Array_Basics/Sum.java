// Write a program to print the summ of all elements present in the array
import java.util.Scanner;
class Sum{
    static Scanner sc=new Scanner (System.in);
    public static void main(String [] args)
    {
        int sum=0;
        int[] arr=new int[5];

    for(int i=0;i<arr.length;i++){
        System.out.println("Enter the elements:");
        arr[i]=sc.nextInt();
    }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        System.out.println("The sum is:"+sum);
        for(int i=arr.length-1;i>=0;i--)    // It is to traverse the array from the last
        {
            System.out.print(arr[i]);
        }
    }
}