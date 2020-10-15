package chapterOne;

public class URLify {

    public static void main(String[] args)
    {
        String test = "Mr John Smith";
        int num_of_spaces = 0;

        for(int i = 0;i<test.length();i++)
        {
            if(test.charAt(i) == ' ')
            {
                num_of_spaces++;
            }
        }

        char[] all_chars = new char[test.length() + (num_of_spaces*2)];
        int walker = 0;

        for(int i = 0;i<test.length();i++)
        {
            if(test.charAt(i) == ' ')
            {
                all_chars[walker++] = '%';
                all_chars[walker++] = '2';
                all_chars[walker++] = '0';
            }
            else
            {
                all_chars[walker++] = test.charAt(i);
            }
        }
        System.out.println(String.valueOf(all_chars));
    }
}
