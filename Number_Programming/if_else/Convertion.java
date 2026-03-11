package Number_Programming.if_else;


import java.util.Scanner;

public class Convertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0)
        {
            System.out.println(-num);
        }
        else
        {
            System.out.println(num);
        }
    }
}
