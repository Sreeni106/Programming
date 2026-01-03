import java.util.Scanner;
class ArrayObjects
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
        System.out.println("Enter the number of object: ");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            Dog d[i]=new Dog();
        }
        // insert object into an array
        Dog[] arr=new Dog[number];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=d[i+1];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the "+(i+1)+"st Dog name");
            arr[i].name=sc.next();
            System.out.println("Enter the "+(i+1)+"st Dog bread");
            arr[i].bread=sc.next();
            System.out.println("Enter the "+(i+1)+"st Dog age");
            arr[i].age=sc.nextInt();
        }
        // Printing inside object
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("This is "+(i+1)+"st Dog Details");
            System.out.println(arr[i].name+" "+arr[i].bread+" "+arr[i].age);
        }
    }
}