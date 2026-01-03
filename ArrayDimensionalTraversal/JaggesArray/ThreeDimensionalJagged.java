// Creating 3D jagged array question writted in tap accademy note.
import java.util.Scanner;
class ThreeDimensionalJagged
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        //School
        int[][][] arr=new int[2][][]; //0

        // Class rooms
        arr[0]=new int[3][];
        arr[1]=new int[2][];

        // Student
        arr[0][0]=new int[2];
        arr[0][1]=new int[3];
        arr[0][2]=new int[3];
        arr[1][0]=new int[2];
        arr[1][1]=new int[3];

        // Store
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