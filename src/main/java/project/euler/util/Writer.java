package project.euler.util;

import project.euler.base.KeyConstant;
import project.euler.base.Solution;

public class Writer extends KeyConstant {
	public static void headerformat() {
		write(DOUBLEMULTILINE);
		System.out.format("%1s%10s%1s%40s%1s%15s%1s%30s%1s%30s%1s%13s%1s", "|",
				"Problem No", "|", "Problem Class Name", "|", "Result", "|",
				"Actual Result", "|", "Time Taken(In Milliseconds)", "|",
				"State", "|");
	}

	public static void format(final Solution solution) {
		System.out.format("%1s%10s%1s%40s%1s%15s%1s%30s%1s%30s%1s%13s%1s", "|",
				solution.getProblemNo(), "|", solution.getClassName(), "|",
				solution.getResult(), "|", solution.getActualresult(), "|",
				solution.getTime(), "|", solution.getState(), "|");
	}

	public static void write(final String text) {
		System.out.println(text);
	}

	public static void error(final String text) {
		System.err.println(text);
	}

	public static void write(final String... texts) {
		StringBuilder message = new StringBuilder();
		for (String text : texts) {
			message.append(text).append(COMMA);
		}
		
		System.out.println(message.substring(0, message.length()-1));
		
	}
	
	

	public static void error(final String... texts) {
		StringBuilder error = new StringBuilder();
		for (String text : texts) {
			error.append(text).append(COMMA);
		}
		
		System.out.println(error.substring(0, error.length()-1));
		
	}
}
