package project.euler;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DistinctPrimesFactors {

	

	public static void main(String[] args) {

		int count = 4;
		Stack<Integer> stack = new Stack<>();
		int firstnumber = 2;
		int number = firstnumber;
		
		while (true) {
			number++;

			if (containPrimeFactor(number)==count) {
				stack.add(number);
			} else {
				stack.removeAllElements();
				firstnumber = number+1;
			}

			if (stack.size() == count ) {

				break;
			}
			

		}
		System.out.println(firstnumber);
	}

	private static int containPrimeFactor(int number) {
		// TODO Auto-generated method stub
		int x =number;
		Set<Integer> divisor = new HashSet<>();
		while(true)
		{
			int factor = smallestFactor(number);
			divisor.add(factor);
			number = number/factor;
			if(number==1)
				break;
		}
		System.out.println(x + "::"+divisor.size());
		
		return divisor.size();
	}
	
	public static int smallestFactor(int C) {

        for (int i = 2; i*i<= C; i++) {   
            if (C % i == 0) return i;
        }
        return C;
    }

}
