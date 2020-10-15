package chapterOne;

public class StringRotation {

    public static boolean checkString(String str1, String str2)
    {
        if(str1.length() == str2.length() && str1.length() > 0)
        {
            String concat = str1 + str1;
            return concat.contains(str2);
        }
        return false;
    }

    public static void main(String[] args)
    {
        String str1 = "waterbottle";
        String str2 = "erbottlewaw";
        System.out.println(checkString(str1, str2));
    }
}
