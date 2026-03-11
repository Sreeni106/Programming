package Number_Programming.if_else;

import java.util.Scanner;

// Check whether the number is 3 digit
public class CheckRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=100 && num<=999)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
