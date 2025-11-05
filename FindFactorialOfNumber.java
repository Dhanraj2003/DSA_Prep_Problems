package Java_Array_Practical_Problems;
import java.util.*;
public class FindFactorialOfNumber {

    public static int findFactorial(int num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {

        System.out.println("Enter any number to find the Factorial:");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        int factorial = FindFactorialOfNumber.findFactorial(num);
        System.out.println("Factorial of "+num+" is: "+factorial);



    }
}
