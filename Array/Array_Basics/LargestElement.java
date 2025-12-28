import java.util.Scanner;
class LargestElement
{
    static Scanner sc=new Scanner (System.in);
    public static void main(String[]args)
    {
        System.out.println("Enter the size:");
        int size=sc.nextInt();       
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the number: ");
            arr[i]=sc.nextInt();
        }

        // Find the largest element

        int large=Integer.MIN_VALUE;  // It gives the min value that integer can hold or store.
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        System.out.println("Largest element in an array is:"+large);
        // int compare=arr[0];     we can also compare the elements like this.
        // for(int i=1;i<arr.length;i++)
        // {
        //     if(arr[i]>large)
        //     {
        //         large=arr[i];
        //     }
        // }
    }
}