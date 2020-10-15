package chapterOne;

import java.util.HashSet;

public class IsUnique {

    public static boolean stringCheck(String str)
    {
        HashSet<Character> mySet = new HashSet<>();
        for(int i = 0; i < str.length(); i++)
        {
            boolean unique = mySet.add(str.charAt(i));
            if(!unique)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean stringCheckTwo(String str)
    {
        boolean unique = true;
        for(int i = 0; i < str.length()-1; i++)
        {
            for(int j = i+1; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    unique = false;
                    break;
                }
            }
            if(!unique)
            {
                break;
            }
        }
        return unique;
    }

    public static void main(String[] args)
    {
        String checker = "bbkevines";
        System.out.println(stringCheck(checker));
        System.out.println(stringCheckTwo(checker));
    }
}
