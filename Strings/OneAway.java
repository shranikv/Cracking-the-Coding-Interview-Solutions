package chapterOne;

public class OneAway {

    public static boolean isOneEditAway(String s1, String s2)
    {
        if(s1.length() == s2.length())
        {
            return oneEditAway(s1, s2);
        }
        else if(s1.length() + 1 == s2.length())
        {
            return oneInsertAway(s1, s2);
        }
        else if(s1.length() - 1 == s2.length())
        {
            return oneInsertAway(s2, s1);
        }
        return false;
    }

    public static boolean oneEditAway(String s1, String s2)
    {
        boolean moreThanOneDifferent = false;
        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                if(moreThanOneDifferent)
                {
                    return false;
                }
                moreThanOneDifferent = true;
            }
        }
        return true;
    }

    public static boolean oneInsertAway(String s1, String s2)
    {
        int index1 = 0, index2 = 0;
        while(index1 < s1.length() && index2 < s2.length())
        {
            if(s1.charAt(index1) != s2.charAt(index2))
            {
                if(index1 != index2)
                {
                    return false;
                }
                else
                {
                    index2++;
                }
            }
            else
            {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String s1 = "apples";
        String s2 = "applebee";
        System.out.println(isOneEditAway(s1, s2));
    }
}
