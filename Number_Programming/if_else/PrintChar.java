package Number_Programming.if_else;

import java.util.Scanner;

public class PrintChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        char ch=(char)(num);
        if((num>=65) && (num<=90))
        {
            System.out.println(ch);
        }
        else if(num>=97 && num<=122)
        {
            System.out.println(ch);
        }
        else if(num>=48 && num<=57)
        {
            System.out.println(num);
        }
        else
        {
            System.out.println("NA");
        }
    }
}
