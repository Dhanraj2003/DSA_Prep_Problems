package string_based_programs;

import java.util.Scanner;

public class RemoveLeadingZeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading zeros: ");
        String input = scanner.nextLine();


        String result = removeLeadingZeros(input);


        System.out.println("String after removing leading zeros: " + result);

        scanner.close();
    }

    public static String removeLeadingZeros(String str) {

        String result = str.replaceFirst("^0+", "");


        return result.isEmpty() ? "0" : result;
    }
}

