package array_based_prob;

import java.util.Scanner;

public class Reverse2DArray {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of rows:");
        int row=sc.nextInt();

        System.out.println("Enter the size of columns:");
        int col=sc.nextInt();

        int[][] a=new int[row][col];

        System.out.println("Enter the elements into two-d array:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        for(int i=row-1;i>=0;i--)
        {
            for(int j=col-1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
