package array_based_prob;

public class CountEvenAndOdd {

    public static void main(String[] args) {

        int a[]={10,3,1,4,6,8,10};
        int evenCount=0;
        int oddCount=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Count of the even number:"+evenCount);
        System.out.println("Count of the odd number:"+oddCount);
    }
}
