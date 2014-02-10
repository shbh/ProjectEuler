package project.euler;
import java.math.BigInteger;

/**
 * Created by shashi on 1/30/14.
 */
public class FactorialDigitSum {

    public static void main(String[] args)
    {
        BigInteger sum = BigInteger.ZERO;
        BigInteger integer = BigInteger.ONE;

        for (int i =1;i<=100;i++)
        {
            integer = integer.multiply(BigInteger.valueOf(i));
        }
        System.out.println(integer);
        while(integer.compareTo(BigInteger.ZERO)!=0)
        {
            BigInteger fact = integer.mod(BigInteger.TEN);
            integer = integer.divide(BigInteger.TEN);
            sum = sum.add(fact );

        }
        System.out.println(sum);
    }
}
