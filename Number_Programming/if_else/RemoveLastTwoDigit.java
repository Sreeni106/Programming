package Number_Programming.if_else;
// Print the number except last two digits
import java.util.Scanner;

public class RemoveLastTwoDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=num/100;
        System.out.println(res);
    }
}
