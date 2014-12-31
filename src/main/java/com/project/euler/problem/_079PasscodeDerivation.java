package com.project.euler.problem;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;
import com.project.euler.feature.Reader;

/**
 * Created by shashi on 1/30/14.
 */
public class _079PasscodeDerivation implements IProblem {

	static Logger logger = Logger.getLogger(_079PasscodeDerivation.class);

	public String solve() {

		
		int[] texts = new int[50];
		
		List<String> datas = Reader.getInstance().readFile("p079_keylog.txt");
		int n = 0;
		for (Iterator<String> iterator = datas.iterator(); iterator.hasNext();) {
			String data = (String) iterator.next();
			texts[n++] =Integer.valueOf( data);
		}
		
		

	//	Arrays.sort(texts);

		int[] passcode = new int[10];
		int[] bulb = new int[10];
		for (int i = 0; i < passcode.length; i++) {
			passcode[i]=i;
			bulb[i]=0;
		}
		//passcode[passcode.length-1]=0;
		
		for (int i = 0; i < texts.length; i++) {
			int number = texts[i];

			int f = number / 100;
			int s = (number % 100) / 10;
			int t = number % 10;
			int fPosition = getPosition(f,passcode,bulb);
			int sPosition = getPosition(s,passcode,bulb);
			int tPosition = getPosition(t,passcode,bulb);
			
			if(fPosition>sPosition)
			{
				int temp = passcode[fPosition];
			//	System.out.println(temp);
				for (int j = fPosition; j > sPosition ; j--) {
					passcode[j]=passcode[j-1];
				}
				passcode[sPosition]=temp;
			}
			if(sPosition>tPosition)
			{
				int temp = passcode[sPosition];
			//	System.out.println(temp);
				for (int j = sPosition; j > tPosition ; j--) {
					passcode[j]=passcode[j-1];
				}
				passcode[tPosition]=temp;
			}
		//	System.out.println(Arrays.toString(passcode));
			//break;
			
		}

		String output ="";
		for (int i = 0; i < passcode.length; i++) {
			if(bulb[passcode[i]]==1)
			output = output + passcode[i];
		}
		
		return output;

	}

	private int getPosition(int no, int[] passcode, int[] bulb) {
		// TODO Auto-generated method stub
		int position = 0;
		for (int i = 0; i < passcode.length; i++) {
			if(passcode[i]==no)
			{
				bulb[no]=1;
				position = i;
				break;
			}
		}
		return position;
	}

}
