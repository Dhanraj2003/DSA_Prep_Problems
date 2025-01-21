package string_based_programs;

import java.util.Scanner;
import java.util.Arrays;

public class CheckAnagram {

    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();


        if (a.length() != b.length()) {
            return false;
        }

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();


        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        return Arrays.equals(arrayA, arrayB);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String a = scanner.nextLine();

        System.out.println("Enter the second string:");
        String b = scanner.nextLine();


        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        scanner.close();
    }
}

