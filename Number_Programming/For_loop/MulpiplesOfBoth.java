package Number_Programming.For_loop;

public class MulpiplesOfBoth {
    public static void main(String[] args) {
        int n=20;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0 && i%3==0)
            {
                System.out.print(i+" ");  //6 12 18 
            }
        }
    }
}
