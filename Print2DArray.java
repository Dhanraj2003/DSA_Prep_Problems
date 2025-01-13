package array_based_prob;

public class Print2DArray {

    public static void print2DArraY(int[][] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] a={{10,20,30},{40,50,60},{70,80,90}};

        print2DArraY(a);
    }
}
