package Number_Programming.For_loop;

import java.util.Scanner;

public class MultiplesOfN {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int x=sc.nextInt();
        int multi=sc.nextInt();
        multiNum(multi, x);
    }
    static void multiNum(int multi,int x)
    {
        for(int i=multi;i<=x;i=i+multi)
        {
            System.out.print(i+" ");
        }
    }
}
