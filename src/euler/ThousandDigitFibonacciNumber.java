package euler;
import java.math.BigInteger;

/**
 * Created by shashi on 1/31/14.
 */
public class ThousandDigitFibonacciNumber {
    public static void main(String[] args)
    {
        BigInteger start = BigInteger.ONE;
        BigInteger next = BigInteger.ONE;
        int answer = 1;

        int length = 1;

        while(length<1000)
        {
            BigInteger result = next.add(start);
            start = next;
            next = result;
            answer++;
            length = next.toString().length();
        }
        System.out.println(answer+1);
    }
}
