// Last Occurance index finder
import java.util.Scanner;
class LastOccurance
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
        int number=lastocc(arr);
        System.out.println("The last occurance is: "+number);
    }
    static int lastocc(int[]arr)
    {
        System.out.println("Enter the number to find index:");
        int number=sc.nextInt();
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(number==arr[i])
            {
                index=i;
            }
        }
        return index;
    }
}