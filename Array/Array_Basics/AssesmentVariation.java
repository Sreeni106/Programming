import java.util.Scanner;
class AssesmentVariation{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the size:");
        int size=sc.nextInt();       
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the number: ");  // 3 5 2 1 4
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int[] resultant=ProductArray(arr,size);
        System.out.println("Sum array:");
        for(int i=0;i<resultant.length;i++)
        {
            System.out.print(resultant[i]+" ");  // 40 24 60 120 30
        }
        System.out.println();
}
static int[] ProductArray(int[]arr,int size){
    int[] product=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            product[i]=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j){
                    product[i]*=arr[j];
                }
            }
        }
        return product;
}
}