package chapterOne;

import java.util.HashMap;

public class CheckPermutation {

    public static boolean checkString(String str1, String str2)
    {
        HashMap<Character, Integer> myCharMap = new HashMap<>();
        for(int i = 0; i < str1.length(); i++)
        {
            myCharMap.put(str1.charAt(i), myCharMap.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for(int i = 0; i < str2.length(); i++)
        {
            if(myCharMap.containsKey(str2.charAt(i)))
            {
                myCharMap.put(str2.charAt(i), myCharMap.get(str2.charAt(i)) - 1);
            }
            else
            {
                myCharMap.put(str2.charAt(i), 1);
            }
        }

        for(int val : myCharMap.values())
        {
            if(val >= 1)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String s1 = "test  ";
        String s2 = "ttes";
        System.out.println(checkString(s1, s2));
    }
}
