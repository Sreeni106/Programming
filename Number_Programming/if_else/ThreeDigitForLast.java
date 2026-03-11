package Number_Programming.if_else;

import java.util.Scanner;

public class ThreeDigitForLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();  //1153
        if(num%100==53)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
