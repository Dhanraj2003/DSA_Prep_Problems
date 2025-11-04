package Java_Array_Practical_Problems;
import java.util.Scanner;
public class PrimeNumber {

    public static boolean checkNumberISPrimeOrNot(int num)
    {
        boolean flag=true;

        if(num==2)
        {
            return true;
        }
        else {
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    flag=false;
                    break;
                }
            }
            return flag;
        }
    }


    public static void main(String[] args) {

        System.out.println("Enter any number to check it is prime or not:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        boolean result = PrimeNumber.checkNumberISPrimeOrNot(num);

        if(result)
        {
            System.out.println("Given number is prime number");
        }
        else{
            System.out.println("Given number is not prime number");
        }
    }
}
