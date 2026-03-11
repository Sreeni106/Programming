package Number_Programming.if_else;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int first=(a>b)?a:b;
        int second=(c>d)?c:d;
        int res=(first>second)?first:second;
        System.out.print(res);
    }
}
