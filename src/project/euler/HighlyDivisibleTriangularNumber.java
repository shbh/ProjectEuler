package project.euler;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/29/14.
 */
public class HighlyDivisibleTriangularNumber implements IProblem {

	private int total = 0;

	public Long solve() {
		long trianglenumber = 0;
		int lastnumber = 1;
		total = total/2;
		
		while (true) {
			trianglenumber = trianglenumber + lastnumber;
			lastnumber++;

			int count = Learning.countdivisor(trianglenumber);
			if (count >= total) {
				break;
			}
		}
		return trianglenumber;

	}
	
	public HighlyDivisibleTriangularNumber total(int total)
	{
		this.total = total;
		return this;
	}

}
