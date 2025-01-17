package array_based_prob;

// time complexity:
//best case:O(1)
//average case:O(n)
//worst case:O(n)

//space complexity:O(1)
public class LinearSearch {

    public static int linearSearch(int[] a,int target)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                return i;

            }
        }
        return -1;

    }


    public static void main(String[] args) {

        int[] a={1,30,40,10,301,13};
        int target=10;

        int i = linearSearch(a, target);
        if(i!=-1)
        {
            System.out.println("value "+target+" found at index "+i);
        }
        else{
            System.out.println("value "+target+" not found!!!");
        }


    }
}
