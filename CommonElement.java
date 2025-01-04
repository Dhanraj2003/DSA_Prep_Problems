package array_based_prob;

public class CommonElement {

    public static void main(String[] args) {

        int[] a={1,2,5,5,8,9,7,10};
        int[] b={1,0,6,15,6,4,7,0};

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println("common element:"+b[j]);
                }
            }
        }
    }
}
