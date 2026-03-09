package PatternProgramming;

import java.util.Scanner;

public class StepByStep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            count=i+1;
            for(int j=0;j<n;j++)
            {
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
    
}
