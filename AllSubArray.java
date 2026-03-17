import java.util.Scanner;

public class AllSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        printSubArray(arr);
    }
    static void printSubArray(int[] arr)
    {
        for(int size=1;size<=arr.length;size++)
        {
            for(int i=0;i<=arr.length-size;i++)
            {
                for(int j=i;j<i+size;j++)
                {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
