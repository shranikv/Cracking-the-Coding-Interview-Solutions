package chapterOne;

import java.util.HashMap;

public class PalindromePermutation {

    public static boolean checkPalindrome(String str)
    {
        HashMap<Character, Integer> myCharMap = new HashMap<>();
        boolean foundOdd = false;

        for(int i = 0; i < str.length(); i++)
        {
            if(Character.getNumericValue(str.charAt(i)) >= Character.getNumericValue('a') && Character.getNumericValue(str.charAt(i)) <= Character.getNumericValue('z'))
            {
                myCharMap.put(str.charAt(i), myCharMap.getOrDefault(str.charAt(i), 0) + 1);
            }
        }

        for(int val : myCharMap.values()) {
            if (val % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str = "taco cow";
        boolean ans = checkPalindrome(str);
        System.out.println(ans);
    }
}
