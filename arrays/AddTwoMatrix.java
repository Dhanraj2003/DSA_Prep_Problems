package array_based_prob;

public class AddTwoMatrix {

    public static void addTwoMatrix(int[][]a,int[][] b,int[][] c)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        int[][] a={{10,20,30},{40,50,60},{70,80,90}};

        int[][] b={{1,2,3},{4,5,6},{7,8,9}};

        int[][] c=new int[3][3];


        addTwoMatrix(a,b,c);

    }
}
