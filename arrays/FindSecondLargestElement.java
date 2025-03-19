package array_based_prob;

public class FindSecondLargestElement {

    public static void main(String[] args) {

        int[] a={10,20,1,31,24,45,81,9,91};

        int firstLargestElement=Integer.MIN_VALUE;
        int secondLargestElement=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>firstLargestElement)
            {
                secondLargestElement=firstLargestElement;
                firstLargestElement=a[i];
            }
        }

        System.out.println("Second largest element of array is:"+secondLargestElement);
    }
}
