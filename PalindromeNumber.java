package Java_Array_Practical_Problems;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int inputNum=num;       //131
        int rev=0;

        if(num<0)
        {
            System.out.println("Invalid Number");
        }
        else {
            while(num>0)
            {
                int rem=num%10;      //1
                rev=rev*10+rem;
                num=num/10;
            }

            if(inputNum==rev)
            {
                System.out.println("Given number is palindrome number.");
            }
            else {
                System.out.println("Given number is not palindrome number");
            }
        }

    }
}
