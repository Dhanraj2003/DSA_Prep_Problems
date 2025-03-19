package array_based_prob;

public class SearchMaxElement {

    public static void main(String[] args) {

        int[] a={10,20,30,40,11,31,46,1,199};
        int maxNum=a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>maxNum)
            {
                maxNum=a[i];
            }
        }
        System.out.println("Maximum element in array is:"+maxNum);
    }
}
