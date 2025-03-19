package array_based_prob;

public class FindSecondSmallestElement {

    public static void main(String[] args) {

        int[] a={10,20,4,2,-1,5,1,22,113};

        int min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==min)
            {
                second_min=min;
            }else if(a[i]<min)
            {
                second_min=min;
                min=a[i];
            }else if(a[i]<second_min)
            {
                second_min=a[i];
            }
        }

        System.out.println("Second Smallest Element is:"+second_min);

    }
}
