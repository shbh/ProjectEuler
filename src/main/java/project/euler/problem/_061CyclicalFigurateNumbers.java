package project.euler.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import project.euler.IProblem;

public class _061CyclicalFigurateNumbers implements IProblem {
	public static HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
	public static HashMap<Integer, ArrayList<Integer>> ht_commons = new HashMap<Integer, ArrayList<Integer>>();

	static Logger logger = Logger.getLogger(_061CyclicalFigurateNumbers.class);

	private List<Integer> triangles = new ArrayList<>();
	private List<Integer> square = new ArrayList<>();
	private List<Integer> pentagonal = new ArrayList<>();
	private List<Integer> hexagonal = new ArrayList<>();
	private List<Integer> heptagonal = new ArrayList<>();
	private List<Integer> octagonal = new ArrayList<>();

	public Integer solve() {
		figurates(10000, 1000, FIGURATES.TRIANGLE, triangles);
		figurates(10000, 1000, FIGURATES.SQUARE, square);
		figurates(10000, 1000, FIGURATES.PENTAGON, pentagonal);
		figurates(10000, 1000, FIGURATES.HEXAGONAL, hexagonal);
		figurates(10000, 1000, FIGURATES.HEPTAGONAL, heptagonal);
		figurates(10000, 1000, FIGURATES.OCTAGONAL, octagonal);

		for (int i = 0; i < octagonal.size(); i++) {

			int[] outputs = new int[6];
			
			int output = -1;
			int number = octagonal.get(i);
			
			outputs[0]=1281;
			List<Integer> tnumbers = findPairs(number, triangles);
			if(tnumbers.size()>0)
			{
			// change
			output = checkAll(number,tnumbers, square, pentagonal, hexagonal,
					heptagonal, outputs);
			}
			if(output==-1)
			{
				List<Integer> snumbers = findPairs(number, square);
				if(snumbers.size()>0)
				{
				output = checkAll(number,snumbers, triangles, pentagonal, hexagonal,
						heptagonal,outputs);
				}
			}
			else 
			{
				
				
				return sum(outputs);
			}

			if(output==-1)
			{
				List<Integer> pnumbers = findPairs(number, pentagonal);
				if(pnumbers.size()>0)
				{
				
				output = checkAll(number,pnumbers, triangles, square, hexagonal,
						heptagonal,outputs);
				}
			}
			else
			{
				return sum(outputs);
			}
			
			if(output==-1)
			{
				List<Integer> hxnumbers = findPairs(number, hexagonal);
				if(hxnumbers.size()>0)
				{
				
				output = checkAll(number,hxnumbers, triangles, pentagonal, square,
						heptagonal,outputs);
				}
			}
			else
			{
				return sum(outputs);
			}
			
			
			if(output==-1)
			{
				List<Integer> hpnumbers = findPairs(number, heptagonal);
				if(hpnumbers.size()>0)
				{
				
				output = checkAll(number,hpnumbers, triangles, pentagonal, hexagonal,
						square,outputs);
				}
			}
			else
			{
				return sum(outputs);
			}


			

			

		}

		return 0;
	}

	private Integer sum(int[] outputs) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < outputs.length; i++) {
			sum+=outputs[i];
		}
		return sum;
	}

	private int checkAll(int number, List<Integer> fiver, List<Integer> first,
			List<Integer> second, List<Integer> third, List<Integer> fourth, int[] outputs) {

		int output = checkFive(number,fiver, first, second, third, fourth, outputs);
		if (output == -1) {
			output = checkFive(number,fiver, second, first, third, fourth, outputs);
		} else {
			return output;
		}

		if (output == -1) {
			output = checkFive(number,fiver, third, first, second, fourth, outputs);
		} else {
			return output;
		}

		if (output == -1) {
			output = checkFive(number,fiver, fourth, first, third, second, outputs);
		} else {
			return output;
		}
		return -1;
	}

	private List<Integer> findPairs(Integer number, List<Integer> values) {
		List<Integer> list = new ArrayList<>();
		int firsttwo = number % 100;

		for (Iterator<Integer> iterator = values.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			int lasttwo = integer / 100;

			if (lasttwo == firsttwo) {
				list.add(integer);
			}

		}
		return list;
	}

	private Integer checkThree(int number,int value, List<Integer> firstlist,
			List<Integer> secondlist, List<Integer> thirdlist, int[] outputs) {
		
		if(firstlist.size()==0)
		{
			return -1;
		}
		List<Integer> first = findPairs(value, firstlist);
		
		
		
		for (int l = 0; l < first.size(); l++) {

			outputs[3] = first.get(l);
			List<Integer> second = findPairs(first.get(l), secondlist);
			
			if(second.size()==0)
			{
				continue;
			}
			
			for (int m = 0; m < second.size(); m++) {

				outputs[4] = second.get(m);
				List<Integer> third = findPairs(second.get(m), thirdlist);
				if(third.size()==0)
				{
					continue;
				}
				for(int n =0; n< third.size();n++)
				{
					outputs[5] = third.get(n);
					int output = third.get(0);
					
					
					int firsttwo = number/100;
					
					int lasttwo = output%100;
					
					if(firsttwo == lasttwo)
					{
						return output;
					}
				}

				

			}

			List<Integer> fourth = findPairs(first.get(l), thirdlist);
			if(fourth.size()==0)
			{
				continue;
			}
			for (int m = 0; m < fourth.size(); m++) {
				
				outputs[4] = fourth.get(m);
				List<Integer> fifth = findPairs(fourth.get(m), secondlist);
				
				if(fifth.size()==0)
				{
					continue;
				}
				for(int n =0; n< fifth.size();n++)
				{
					outputs[5] = fifth.get(n);
					
					int output = fifth.get(0);
		
					int firsttwo = number/100;
					
					int lasttwo = output%100;
					
					if(firsttwo == lasttwo)
					{
						return output;
					}
				}
			

			}

		}

		return -1;
	}

	private Integer checkFour(int number, List<Integer> filter, List<Integer> first,
			List<Integer> second, List<Integer> third, int[] outputs) {
		
		if(filter.size()==0)
		{
			return -1;
		
		}
		for (int k = 0; k < filter.size(); k++) {

			outputs[2] = filter.get(k);
			int output = checkThree(number,filter.get(k), first, second, third, outputs);

			if (output == -1) {
				output = checkThree(number,filter.get(k), second, third, first, outputs);

			} else {
				return output;
			}
			if (output == -1) {
				output = checkThree(number,filter.get(k), third, first, second, outputs);

			} else {
				return output;
			}

		}
		return -1;
	}

	private Integer checkFive(int number,List<Integer> fiver, List<Integer> second,
			List<Integer> third, List<Integer> fourth, List<Integer> fifth, int[] outputs) {
		
		if(fiver.size()==0)
		{
			return -1;
		}
		
		for (int j = 0; j < fiver.size(); j++) {
			
			List<Integer> filter = findPairs(fiver.get(j), second);
			
			if(filter.size()==0)
			{
				return -1;
			}
			outputs[1] = fiver.get(j);
			
			int output = checkFour(number,filter, third, fourth, fifth, outputs);
			if (output > -1) {
				return output;
			}

		}

		return -1;

	}

	enum FIGURATES {
		TRIANGLE, SQUARE, PENTAGON, HEXAGONAL, HEPTAGONAL, OCTAGONAL
	}

	/*
	 * 
	 * Triangle P3,n=n(n+1)/2 1, 3, 6, 10, 15, ... Square P4,n=n2 1, 4, 9, 16,
	 * 25, ... Pentagonal P5,n=n(3n−1)/2 1, 5, 12, 22, 35, ... Hexagonal
	 * P6,n=n(2n−1) 1, 6, 15, 28, 45, ... Heptagonal P7,n=n(5n−3)/2 1, 7, 18,
	 * 34, 55, ... Octagonal P8,n=n(3n−2) 1, 8, 21, 40, 65, ...
	 */

	private List<Integer> figurates(int max, int min, FIGURATES figurates,
			List<Integer> values) {

		int n = 1;
		int number = 0;
		while (number < max) {

			switch (figurates) {

			case TRIANGLE:
				number = n * (n + 1) / 2;
				break;

			case SQUARE:
				number = n * n;
				break;

			case PENTAGON:
				number = n * (3 * n - 1) / 2;
				break;

			case HEXAGONAL:
				number = n * (2 * n - 1);
				break;

			case HEPTAGONAL:
				number = n * (5 * n - 3) / 2;
				break;

			case OCTAGONAL:
				number = n * (3 * n - 2);
				break;

			}
			
			if (number >= min) {
				values.add(number);
			}
			n++;
		}

		return values;

	}

}