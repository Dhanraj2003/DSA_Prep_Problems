package Java_Array_Practical_Problems;

import java.util.Arrays;

public class ThirdLargest {

    public static int thirdLargestElement(int[] a)
    {
        int size=a.length;

        Arrays.sort(a);

        return a[size-3];
    }


    public static void main(String[] args) {

        int[] a={10,24,242,1,22,53};

        int result = ThirdLargest.thirdLargestElement(a);

        System.out.println("Third largest element of array is:"+result);

    }
}
