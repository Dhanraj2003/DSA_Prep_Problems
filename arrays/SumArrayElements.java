package array_based_prob;

public class SumArrayElements {

    public int addElements(int[]a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] a={5,10,15,20};
        SumArrayElements obj=new SumArrayElements();
        int sum = obj.addElements(a);
        System.out.println("Sum of elements present in array is:"+sum);
    }
}
