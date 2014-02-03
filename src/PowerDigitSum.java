import java.math.BigInteger;

/**
 * Created by shashi on 1/29/14.
 */
public class PowerDigitSum {

    public static void main(String[] args)
    {
        int n =2;
        int limit = 1000;

        BigInteger hugesum = new BigInteger("2").pow(limit);

        int length = hugesum.toString().length();
        int sum = 0;
        System.out.println(hugesum);
        while(hugesum.compareTo(new BigInteger("0"))!=0)
        {

            BigInteger remainder = hugesum.divide(BigInteger.TEN.pow(length-1));

            hugesum=hugesum.subtract(BigInteger.TEN.pow(length-1).multiply(remainder));

            length = hugesum.toString().length();

            sum +=remainder.intValue();

        }
        System.out.println(sum);


    }
}
