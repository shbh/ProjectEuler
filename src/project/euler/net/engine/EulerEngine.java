package project.euler.net.engine;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EulerEngine {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, ClassNotFoundException,
			InstantiationException {
//46,33,15,17
		ClassLoader myClassLoader = ClassLoader.getSystemClassLoader();
		Class myClass = myClassLoader.loadClass("project.euler.net.GreatEuler");
		int[] problems = {14};
		Object whatInstance = myClass.newInstance();
		for (int i = 0; i <problems.length; i++) {
			System.out.println();
			String methodName ="problem0";
			if(problems[i]<10)
			{
				methodName+="0"+problems[i];
			}
			else
			{
				methodName+=problems[i];
			}
			Method method = myClass.getMethod(methodName, null);
			long startTime = System.currentTimeMillis();
			method.invoke(whatInstance, null);
			long stopTime = System.currentTimeMillis();
			long elapsedTime = stopTime - startTime;
			System.out.print("::"+problems[i]+"::"+elapsedTime);
		}
	}

}
