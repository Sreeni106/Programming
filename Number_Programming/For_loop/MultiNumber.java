package Number_Programming.For_loop;

public class MultiNumber {
    public static void main(String[] args) {
        int n=20;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0 || i%3==3)
            {
                System.out.print(i+" ");  //2 4 6 8 10 12 14 16 18 20 
            }
        }
    }
}
