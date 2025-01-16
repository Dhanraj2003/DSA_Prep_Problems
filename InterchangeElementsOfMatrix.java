package array_based_prob;

import java.util.Scanner;

public class InterchangeElementsOfMatrix {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of row:");
        int row= sc.nextInt();

        System.out.println("Enter the size of column");
        int col=sc.nextInt();
        int[][]a=new int[row][col];

        System.out.println("Enter the elements into array");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("After interchanging elements of ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=a[i].length-1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
