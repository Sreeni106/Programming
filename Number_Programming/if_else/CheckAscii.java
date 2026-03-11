package Number_Programming.if_else;

import java.util.Scanner;

public class CheckAscii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        char ch=(char)(num);
        if((num>='A') && (num<='Z'))
        {
            System.out.println(ch);
        }
        else
        {
            System.out.println("No");
        }
    }
}
