package array_based_prob;

public class MatrixMultiplication {

    public static void main(String[] args) {

        int[][] a={{1,2,3},{2,3,1},{1,3,2}};
        int[][] b={{1,2,3},{2,3,1},{1,3,2}};
        int[][] c=new int[3][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                c[i][j]=a[i][j]*b[i][j];
            }
        }

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
