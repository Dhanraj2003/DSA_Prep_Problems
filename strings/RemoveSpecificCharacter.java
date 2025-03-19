package string_based_programs;

import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any string:");
        String input=sc.nextLine();

        System.out.println("Enter character to remove:");
        char charToRemove=sc.nextLine().charAt(0);

        String result = removeCharacter(input, charToRemove);

        System.out.println("Output: " + result);
    }

    public static String removeCharacter(String str, char charToRemove) {

        StringBuilder result = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);


            if (currentChar != charToRemove) {
                result.append(currentChar);
            }
        }


        return result.toString();
    }
}

