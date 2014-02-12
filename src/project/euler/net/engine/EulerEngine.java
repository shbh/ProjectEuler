package project.euler.net.engine;

import java.lang.reflect.Method;

import project.euler.base.Key;
import project.euler.base.Problem;
import project.euler.base.Key.ThreeState;
import project.euler.util.Learning;

public class EulerEngine {

	Object whatInstance;
	Class<?> myClass;

	public static void main(String[] args) {

		EulerEngine e = new EulerEngine();
		e.range(22,22);
	}

	@SuppressWarnings("unused")
	private void only(int number) {
		range(number, number);
	}

	private void range(int lower, int higher) {

		long startTime = System.currentTimeMillis();

		
		Learning.headerformat();
		Learning.write(Key.BLANK);
		Learning.write(Key.MULTISTAR);
		
		int pass = 0;
		int fail = 0;
		int timeExceeded = 0;
		for (int i = lower; i <= higher; i++) {
			Problem p = execute(i);
			switch (p.getState()) {

			case PASS:
				pass++;
				break;
			case FAIL:
				fail++;
				break;
			case TIME_EXCEEDED:
				timeExceeded++;
				break;
			default:
				break;
			}
			Learning.format(p);
			Learning.write(Key.BLANK);
			
		}
		Learning.write(Key.MULTISTAR);
		long stopTime = System.currentTimeMillis();
		Learning.write(Key.NEWLINE);
		Learning.write(Key.MULTISTAR);
		Learning.write("Total No of Problem Attempt: "
				+ Learning.getNumberLetters(higher - lower + 1).toUpperCase());
		Learning.write("Total Time Taken: " + (stopTime - startTime)
				+ " milliseconds");
		Learning.write("Total Pass: " + pass);
		Learning.write("Total Fail: " + fail);
		Learning.write("Total No Of Problem Failed In Time Boundation: "
				+ timeExceeded);
		Learning.write(Key.MULTISTAR);

	}

	private Problem execute(int number) {
		Problem p = null;
		try {

			if (myClass == null) {
				clazz();
			}

			String methodName = "problem0";
			if (number < 10) {
				methodName += "0" + number;
			} else {
				methodName += number;
			}

			Method method = myClass.getMethod(methodName, new Class[] {});

			p = (Problem) method.invoke(whatInstance, new Object[] {});

			if (p != null) {
				p.setNumber(number);
			}
			if (p.getException() != null) {
				throw p.getException();
			}

		} catch (Exception ex) {
			Learning.error("**************");
			Learning.error("Exception in problem no :" + number);
			ex.printStackTrace();
			Learning.error("**************");
		}
		return p!=null?p:new Problem(number,ThreeState.FAIL);
	}

	private void clazz() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {

		ClassLoader myClassLoader = ClassLoader.getSystemClassLoader();
		myClass = myClassLoader.loadClass("project.euler.net.GreatEuler");
		whatInstance = myClass.newInstance();

	}

}
