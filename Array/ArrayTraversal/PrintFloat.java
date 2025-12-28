import java.util.Scanner;
class PrintFloat
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the size:");
        int size=sc.nextInt();       
        float[] arr=new float[size];
        System.out.print("Enter the number: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextFloat();
        }
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}