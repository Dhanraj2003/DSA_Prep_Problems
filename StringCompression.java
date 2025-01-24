package JavaStrings;

public class StringCompression {

    public static String compressString(String str)
    {
        StringBuilder compressString=new StringBuilder();
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }else{
                compressString.append(str.charAt(i)).append(count);
                count=1;
            }
        }

        return compressString.length()<str.length() ?compressString.toString():str;
    }

    public static void main(String[] args) {

        String input = "aabcccccaaa"; // Example input
        String compressed = compressString(input);
        System.out.println("Original string: " + input);
        System.out.println("Compressed string: " + compressed);

    }
}
