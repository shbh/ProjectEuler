package project.euler;
/**
 * Created by shashi on 1/28/14.
 */
public class SpecialPythagoreanTriplet {
    public static void main(String[] args)
    {

        int marker = 1000;
            for(int c = 1; c<=marker;c++)
            {

                    int a;
                    int residue = marker-c;
                    for(int b = 1; b<residue;b++)
                    {
                        a = residue-b;
                        if(a*a+b*b==c*c)
                        {
                           System.out.println(a+" "+b+" "+c);
                           System.out.println(a*b*c);
                        }
                        else
                        {
                            if(a==b || a==(b-1))
                            {
                                break;
                            }
                        }
                    }


            }

    }
}
