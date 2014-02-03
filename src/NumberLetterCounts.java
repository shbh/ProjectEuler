/**
 * Created by shashi on 1/29/14.
 */
public class NumberLetterCounts {

    private static final String SPACE =  " ";
    private static final String HYPHEN =  "-";
    private static final String AND =  "and";

    public enum NUMBER {
        zero(0),one(1), two(2),three(3), four(4), five(5),six(6), seven(7), eight(8), nine(9), ten(10), eleven(11), twelve(12), thirteen(31), fourteen(14), fifteen(15), sixteen(16), seventeen(17),
        eighteen(18), nineteen(19), twenty(20), thirty(30), forty(40), fifty(50), sixty(60), seventy(70), eighty(80), ninety(90),hundred(100), thousand(1000);

        private final int id;
        NUMBER(int id) { this.id = id; }
        public int getValue() { return id; }

    }

    public static String text(int i )
    {
        NUMBER[] number = NUMBER.values();
        for (int j =0; j<number.length;j++)
        {
            if(number[j].getValue()==i)
            {
                return number[j].toString();
            }

        }
        return NUMBER.thousand.toString();

    }



    public static void main(String[] args)
    {
        int length=0;
        for (int i =1;i<=1000;i++)
        {   StringBuffer text = new StringBuffer();
            int remainder = i ;
            int quotient = i/1000;

            if(quotient>0)
            {
                text.append(text(quotient)).append(SPACE).append(NUMBER.thousand).append(SPACE);
                remainder = i%1000;
            }

            quotient = remainder/100;

            if(quotient>0)
            {
                text.append(text(quotient)).append(SPACE).append(NUMBER.hundred).append(SPACE);
                remainder = i%100;
            }


            quotient = remainder/10;

            if(quotient>1)
            {
                if(i>100)
                    text.append(AND).append(SPACE);
                text.append(text(quotient * 10));


                remainder = i%10;
            }
            else if(quotient==1)
            {
                if(i>100)
                    text.append(AND).append(SPACE);
                text.append(text(remainder));
                remainder=0;
            }
            else
            {
                quotient = 0;
            }

            //quotient = i;
            if(remainder>0)
            {
                if(quotient>0)
                {
                    text.append(HYPHEN).append(text(remainder));
                }
                else
                {
                    if(i>100)
                        text.append(AND).append(SPACE);
                    text.append(text(remainder));
                }
            }

            System.out.println(text);
             length+= text.toString().replaceAll("[\\s\\-()]", "").length();

        }
        System.out.println(length);

    }
}
