package project.euler.net;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.reflections.Reflections;

import project.euler.base.IProblem;
import project.euler.base.KeyConstant;
import project.euler.base.Solution;
import project.euler.util.Learning;

public final class EulerEngine {

	private static final Map<Integer, String> results = new LinkedHashMap<>();
	private static final ClassLoader CLASSLOADER = ClassLoader
			.getSystemClassLoader();
	private static List<Class<? extends IProblem>> classes;
	private final transient List<Solution> failed = new ArrayList<>();

	private static int pass=0;
	private static int fail=0;
	private static int timeExceeded=0;
	private static int mismatch=0;
	private static long startTime;
	private static long stopTime;
	private static int noofproblem = 0;

	public static EulerEngine getInstance() {
		return new EulerEngine();
	}

	public static void run(final int number) {
		EulerEngine engine = EulerEngine.getInstance();
		
		engine.solve(true, number);
		engine.postProcess();
		
	}
	String line = "";
	String cvsSplitBy = ",";
	private void readProperties()
	{
		InputStream input = null;
		Properties props = new Properties();
		try {
			 
    		
    		input = EulerEngine.class.getResourceAsStream("solution.properties");
    	
 
    		//load a properties file from class path, inside static method
    		props.load(input);
 
    		props.load(input);
    		Enumeration<Object> keys= props.keys();
                
    		while (keys.hasMoreElements()) {
				Object key = (Object) keys.nextElement();
				results.put(Integer.parseInt(key.toString()), (String) props.get(key));
			}
                
 
    	} catch (IOException ex) {
    		ex.printStackTrace();
        } finally{
        	if(input!=null){
        		try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	}
        }
		
		
		
			

	}

	public static void ring(final int... number) {
		EulerEngine engine = EulerEngine.getInstance();
		engine.solve(true, number);
		engine.postProcess();
	}

	public static void range(final int startrange, final int endrange) {
		EulerEngine engine = new EulerEngine();
		startTime = System.currentTimeMillis();
		engine.solve(startrange, endrange);
		engine.postProcess();
	}

	private void postProcess() {
		Learning.write(KeyConstant.DOUBLEMULTILINE);
		stopTime = System.currentTimeMillis();
		this.footer();

	}

	private void solve(final boolean isRange, final int... numbers) {
		for (int number : numbers) {
			process(classes.get(number - 1));
		}
	}

	private void solve(final int startrange, final int endrange) {
		List<Class<? extends IProblem>> rangeclasses = classes.subList(
				startrange - 1, endrange);
		for (Class<? extends IProblem> clazz : rangeclasses) {
			process(clazz);
		}
	}

	private void header() {
		Learning.headerformat();
		Learning.write(KeyConstant.BLANK);
		Learning.write(KeyConstant.DOUBLEMULTILINE);

	}

	private void footer() {

		Learning.write("Total No of Problem Attempt: "
				+ Learning.getNumberLetters(noofproblem).toUpperCase());

		Learning.write("Total Time Taken: " + (stopTime - startTime)
				+ " milliseconds");
		Learning.write("Total Pass: " + pass);
		Learning.write("Total Fail: " + fail);
		Learning.write("Total Mismatch: " + mismatch);
		Learning.write("Total No Of Problem Failed In Time Boundation: "
				+ timeExceeded);
		Learning.write(KeyConstant.DOUBLEMULTILINE);
		for (final Solution failProblem : failed) {
			final Exception exception = failProblem.getException();

			Learning.error("**************");
			Learning.error("Exception in problem no :"
					+ failProblem.getProblemNo());
			exception.printStackTrace();

		}

	}

	private void process(final Class<? extends IProblem> problems) {
		noofproblem = noofproblem + 1;
		final Solution solution = new Solution();
		IProblem problem = null;
		final String className = problems.getCanonicalName();
		try {
			final Class<?> myClass = CLASSLOADER.loadClass(className);
			final Object whatInstance = myClass.newInstance();

			problem = ((IProblem) whatInstance);

			solution.setProblemNo(problem.getNo());
			try {
				final long startTime = System.currentTimeMillis();
				final Object result = problem.solve();
				final long stopTime = System.currentTimeMillis();
				solution.setResult(result);
				solution.setTime(stopTime - startTime);
				solution.setActualResult(results.get(solution.getProblemNo()));
				if(result.toString().equals(solution.getActualresult()))
				{
					solution.setState(KeyConstant.FourState.PASS);
				}
				else
				{
					solution.setState(KeyConstant.FourState.MISMATCH);
				}
			} catch (Exception ex) {
				solution.setException(ex);
				solution.setState(KeyConstant.FourState.FAIL);
			}

			solution.setClassName(problems.getSimpleName());

			switch (solution.getState()) {

			case PASS:
				EulerEngine.pass++;
				break;
			case FAIL:
				EulerEngine.fail++;
				this.failed.add(solution);
				break;
			case TIME_EXCEEDED:
				EulerEngine.timeExceeded++;
				break;
			case MISMATCH:
				EulerEngine.mismatch++;
				break;	
			default:
				break;
			}
			Learning.format(solution);
			Learning.write(KeyConstant.BLANK);
		} catch (Exception ex) {
			Learning.error("**************");
			Learning.error("Exception in problem no :" + className);
			ex.printStackTrace();
			Learning.error("**************");
		}
	}

	private EulerEngine() {
		readProperties();
		final Reflections reflections = new Reflections("project.euler.problem");
		final Set<Class<? extends IProblem>> allClasses = reflections
				.getSubTypesOf(IProblem.class);
		EulerEngine.classes = new ArrayList<Class<? extends IProblem>>(
				allClasses);

		Collections.sort(EulerEngine.classes,
				new Comparator<Class<? extends IProblem>>() {

					public int compare(final Class<? extends IProblem> clazz,
							final Class<? extends IProblem> clajj) {

						final String clazzName = clazz.getSimpleName();
						final String clajjName = clajj.getSimpleName();
						return clazzName.compareTo(clajjName);
					}
				});

		this.header();

	}
}
