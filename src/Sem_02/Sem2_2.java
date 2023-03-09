package Sem_02;

public class Sem2_2
{
    public static void main(String[] args)
    {
        System.out.println(compress("aaaabbbcdd")); // -> a4b3cd2
    }
    private static String compress(String source)
    {
        String result = "";
        char elem = source.charAt(0);
        int count = 1;
        for (int i = 1; i < source.length(); i++)
        {
            if (elem == source.charAt(i))
            {
                count ++;
            }
            else
            {
                if (count != 1 )
                {
                    result += elem;
                    result += count;
                    elem = source.charAt(i);
                    count = 1;
                }
                else
                {
                    result += elem;
                    elem = source.charAt(i);
                    count = 1;
                }
            }
        }
        if (count != 1 )
        {
            result += elem;
            result += count;
        }
        else
        {
            result += elem;
        }
        return result;
    }
}