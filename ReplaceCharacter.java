package string_based_programs;

public class ReplaceCharacter {

    public static void main(String[] args) {


        String str = "Geeks Gor Geeks";


        int index = 8;


        char ch = 'F';


        System.out.println("Original String = " + str);

        str = str.substring(0, index) + ch
                + str.substring(index + 1);


        System.out.println("Modified String = " + str);
    }
}
