package Number_Programming.if_else;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println("A "+a+" B "+b);
        // int temp;
        // temp=a;    with the help of temp
        // a=b;
        // b=temp;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A "+a+" B "+b);
    }
}
