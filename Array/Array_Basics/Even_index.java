// Print the even index elements
import java.util.Scanner;
class Even_index
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        int[] arr=new int[10];

        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the Numbers");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}