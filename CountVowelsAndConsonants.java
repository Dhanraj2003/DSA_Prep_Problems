package Java_Array_Practical_Problems;



public class CountVowelsAndConsonants {
    public static void main(String[] args) {

        String str = "This is java programming using intellij idea";
        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // check if it's a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels count: " + vowels);
        System.out.println("Consonants count: " + consonants);
    }
}

