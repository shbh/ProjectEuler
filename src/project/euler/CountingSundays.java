package project.euler;

import project.euler.base.IProblem;
import project.euler.base.Key;

/**
 * Created by shashi on 1/30/14.
 */
public class CountingSundays implements IProblem{

    


    private int before;

	public Integer solve()
    {


/*
        1 Jan 1900 was a Monday.
            Thirty days has September,
            April, June and November.
        All the rest have thirty-one,
            Saving February alone,
        Which has twenty-eight, rain or shine.
        And on leap years, twenty-nine.
            A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
*/

        int carry =0 ;
        int sunday=0;
        //considering sunday as 0, 1 as monday, 2 as tuesday and so on..
        // for 1990
        int firstDay = 366%7;
        
        for(int i = 1901; i<before;i++)
        {
            int[] temp=Key.NO_OF_DAYS_IN_A_MONTH_FOR_A_NON_LEAP_YEAR;
            if(i%4==0 && i%400>0)
            {
                temp =Key.NO_OF_DAYS_IN_A_MONTH_FOR_A_LEAP_YEAR;
            }

            for(int m=0;m<temp.length;m++)
            {
                if(m-1<0)
                {
                    firstDay = (carry+firstDay)%7;

                }
                else if(m+1<temp.length)
                {
                    firstDay = (temp[m-1]+firstDay)%7;
                }
                else
                {
                    firstDay = (temp[m-1]+firstDay)%7;
                    carry = temp[m];
                }



                if(firstDay%7==0)
                    sunday++;
            }

        }
        return sunday;



    }

	public CountingSundays before(int before) {
		
		this.before= before;
		return this;
	}
}
