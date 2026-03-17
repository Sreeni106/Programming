package TwoArray;

import java.util.Scanner;

// Given two sorted arrays of integer values. write a program to print the elements which are repeated in both arrays
public class CommonBoth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int[] arr1=new int[size1];
        int size2=sc.nextInt();
        int[] arr2=new int[size2];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        printCommon(arr1, arr2);
    }
    static void printCommon(int[] arr1,int[] arr2)
    {
        int i=0,j=0;
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i]>arr2[j])
            {
                j++;
            }
            else if(arr2[j]>arr1[i])
            {
                i++;
            }
            else
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
         
    }
}
