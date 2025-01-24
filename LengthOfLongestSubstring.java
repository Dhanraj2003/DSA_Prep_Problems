package JavaStrings;

import java.util.HashSet;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String str)
    {
        int start=0; //start of current substring
        int maxLength=0;

        HashSet<Character> seen=new HashSet<>(); //store character in current substring

        for(int end=0;end<str.length();end++)
        {
            char currentChar=str.charAt(end);

            while (seen.contains(currentChar))
            {
                seen.remove(str.charAt(start));
                start++;
            }

            // Add the current character to the set
            seen.add(currentChar);

            // Update maximum length
            maxLength=Math.max(maxLength,end-start+1);
        }

        return maxLength;
    }



    public static void main(String[] args) {

        String str="abaacaabbcbb";
        System.out.println("Length of Longest Substring WithOut Repeating charaters:"+lengthOfLongestSubstring(str));
    }
}
