package JavaStrings;

public class SpecificEleOccurenceCount {

    public static void main(String[] args) {

        String input="dhana";
        char target='a';
        int count=0;

        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==target)
            {
                count++;
            }
        }

        System.out.println("The occurence of given character "+target+" is:"+count);
    }
}
