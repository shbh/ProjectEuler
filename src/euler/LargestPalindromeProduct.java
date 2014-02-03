package euler;
/**
 * Created by shashi on 1/28/14.
 */
public class LargestPalindromeProduct {

    public static void main(String[] args)
    {

        int largestpalindromeproduct=0;
        for(int n = 999;n>99;n--)
        {
            for(int m = 999;m>99;m--)
            {
                int product = n*m;
                if(product>largestpalindromeproduct && isPalindrome(product))
                {
                    largestpalindromeproduct=product;
                }
            }
        }
        System.out.print(largestpalindromeproduct);
    }

    public static boolean isPalindrome(int number)
    {
        String characters = new Integer(number).toString();
        String firstbit = null;
        String secondbit = null;
        int length = characters.length();
        if(length%2==0)
        {
            firstbit = characters.substring(0,(length/2) );
            secondbit = characters.substring(length/2);
        }
        else
        {
            firstbit = characters.substring(0,(length/2) );
            secondbit = characters.substring((length/2)+1);
        }


        secondbit = reverse(secondbit);
        if(firstbit.equals(secondbit))
        {
            return true;

        }
        return false;
    }

    public static String reverse(String characters)
    {
        char[] oldString = characters.toCharArray();
        char[] newString = new char[oldString.length];

        int newindex=0;
        for(int n=oldString.length-1; n>=0;n--)
        {
            newString[newindex]=oldString[n];
            newindex++;
        }
        return new String(newString);
    }
}
