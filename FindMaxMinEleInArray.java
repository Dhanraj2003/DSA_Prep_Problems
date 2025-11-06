package Java_Array_Practical_Problems;

public class FindMaxMinEleInArray {

    public static void main(String[] args) {

        int[] a={10,3,2,42,12,5,3,1,8};

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            if(a[i]>max)
            {
                max=a[i];
            }
        }

        System.out.println("Maximum element of given array is:"+max);
        System.out.println("Minimum element of given array is:"+min);
    }
}
