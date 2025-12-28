import java.util.Scanner;
class Average
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        int count=0;
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
        int average=findAverage(arr);
        System.out.println("The average of array is :"+average);
}
static int findAverage(int[]arr)
{
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
    }
    int average=sum/arr.length;
    return average;
}
}