// Exploring 3 Dimensional array traversal
import java.util.Scanner;
class ThreeDimensional
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        int blockSize=sc.nextInt();
        int rowSize=sc.nextInt();
        int columnSize=sc.nextInt();
        int[][][] arr=new int[blockSize][rowSize][columnSize];
        // Getting input
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
        // Print
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.println("The School no "+(i+1)+","+(j+1)+"Class and his roll numbers"+(k+1));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}