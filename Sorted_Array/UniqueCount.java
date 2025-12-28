// Given a sorted array of n integers. Write a program to count the number of unique elements present in the array.
import java.util.Scanner;
class UniqueCount
{
    static Scanner sc=new Scanner (System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the size:");
        int size=sc.nextInt();       
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");  // 2 2 2 3 4 4 4 23
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int unique=0;
        int count=1;
        for(int i=0;i<arr.length-1;i++)
        {
                if(arr[i]==arr[i+1])
                {
                    count+=1;
                }
                else
                {
                    if(count==1){
                        System.out.println(arr[i]);
                        unique+=1;
                    }
                    count=1;
                }   
        }
        if(count==1){
        unique++;
        System.out.println("Unique count is:"+unique);
        }
    }
}