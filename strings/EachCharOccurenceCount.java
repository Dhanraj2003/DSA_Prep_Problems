package JavaStrings;

public class EachCharOccurenceCount {

    public static void main(String[] args) {

        String str="dhana";
        int[] frequency=new int[256];

        for(int i=0;i<str.length();i++)
        {
            char currentChar=str.charAt(i);
            frequency[currentChar]++;
            int x=0;
        }

        for(int i=0;i<256;i++)
        {
            if(frequency[i]>0)
            {
                System.out.println( (char)i + " : " + frequency[i]);
            }
        }





    }
}
