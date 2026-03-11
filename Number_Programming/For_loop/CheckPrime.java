package Number_Programming.For_loop;
//1) 2 to n/2 , 2) 2 to squareroot of n --> i**2=squareroot of n**2 (2 and square root get cancelled)-->i*i<=n --> it is much efficient than n/2
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkNumber(n));
    }
    static String checkNumber(int n)
    {
        if(n<=1)
        {
            return "Not Prime";
        }
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                return "Not a Prime";
            }
        }
        return "Prime";
    }
    // static String checkNumber(int n)
    // {
    //     for(int i=1;i<=n;i++)
    //     {
    //         if(countFactor(n)==2)
    //         {
    //             return "Prime";
    //         }
    //     }
    //     return "Not Prime";
    // }
    // static int countFactor(int n)
    // {
    //     int count=0;
    //     for(int i=1;i<=n;i++)
    //     {
    //         if(n%i==0)
    //         {
    //             count++;
    //         }
    //     }
    //     return count;
    // }
}
