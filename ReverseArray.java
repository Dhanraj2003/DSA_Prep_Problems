package Java_Array_Practical_Problems;

public class ReverseArray {

    public static void main(String[] args) {

        int[] a={10,20,30,40,50};

        int temp=0;
        int start=0;
        int end=a.length-1;

        while(start<end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;

            start++;
            end--;
        }

        System.out.println("After reverse:");
        for(int i:a)
        {
            System.out.print(i+" ");
        }

    }
}
