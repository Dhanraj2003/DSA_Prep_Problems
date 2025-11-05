package Java_Array_Practical_Problems;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class PrimeNumberInRange {

    public static List<Integer> calculatePrimeInRange(int range) {

        List<Integer> primeNumList=new ArrayList<>();

        for (int num = 1; num <= range; num++) {
            if (num < 2) {
//                System.out.println(num + " is not a prime number.");
                continue;
            }

            boolean isPrime = true;
            int limit = (int) Math.sqrt(num);

            for (int i = 2; i <= limit; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            {
                primeNumList.add(num);
            }

        }
        return primeNumList;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int range= sc.nextInt();

        List<Integer> list = PrimeNumberInRange.calculatePrimeInRange(range);

        System.out.println("Below are the list of prime number in given range:");
        System.out.println(list);


    }
}

