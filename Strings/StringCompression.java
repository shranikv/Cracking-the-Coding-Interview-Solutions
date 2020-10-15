package chapterOne;

public class StringCompression {

    public static String compress(String str1)
    {
        char previous = str1.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < str1.length(); i++)
        {
            if(previous == str1.charAt(i))
            {
                count++;
            }
            else
            {
                sb.append(previous);
                sb.append(count);
                previous = str1.charAt(i);
                count = 1;
            }
        }
        sb.append(previous);
        sb.append(count);
        return sb.toString();
    }

    public static void main(String[] args)
    {
        String comp = "aaaaabbbcccdde";
        System.out.print(compress(comp));
    }

}
