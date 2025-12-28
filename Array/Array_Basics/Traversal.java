import java.util.Scanner;
class Traversal{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}