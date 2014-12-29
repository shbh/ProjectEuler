package com.project.euler.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;

/**
 * Created by shashi on 1/30/14.
 */
public class _079PasscodeDerivation implements IProblem {

	static Logger logger = Logger.getLogger(_079PasscodeDerivation.class);

	public Long solve() {

		InputStream input = _079PasscodeDerivation.class.getClassLoader().getResourceAsStream("p079_keylog.txt");

		int[] texts = new int[50];
		try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {

			String sCurrentLine;

			int x = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				texts[x++] = Integer.valueOf(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

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
		System.out.println(output);
		return null;

	}

	private int getPosition(int no, int[] passcode, int[] bulb) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < passcode.length; i++) {
			if(passcode[i]==no)
			{
				bulb[no]=1;
				return i;
			}
		}
		return 0;
	}

}
