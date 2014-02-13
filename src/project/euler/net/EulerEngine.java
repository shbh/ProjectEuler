package project.euler.net;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;

import project.euler.base.IProblem;
import project.euler.base.KeyConstant;
import project.euler.base.Solution;
import project.euler.util.Learning;

public final class EulerEngine {

	private final  ClassLoader myClassLoader = ClassLoader.getSystemClassLoader();
	private  List<Class<? extends IProblem>> classes = null;
	private final transient List<Solution> failed = new ArrayList<>();

	private int pass = 0;
	private  int fail = 0;
	private  int timeExceeded = 0;
	private long startTime = 0l;
	private long stopTime = 0l;
	private int noofproblem = 0;

	public static EulerEngine getInstance()
	{
		return new EulerEngine();
	}
	
	public static void run(int number)
	{
		EulerEngine engine = EulerEngine.getInstance();
		engine.solve(true, number);
		engine.postProcess();
	}
	
	public static void ring(int... number)
	{
		EulerEngine engine = EulerEngine.getInstance();
		engine.solve(true, number);
		engine.postProcess();
	}
	
	public static void range(int startrange, int endrange)
	{
		EulerEngine engine = new EulerEngine();
		engine.solve(startrange, endrange);
		engine.postProcess();
	}

	private final void postProcess() {
		Learning.write(KeyConstant.DOUBLEMULTILINE);
		this.stopTime = System.currentTimeMillis();
		this.footer();

	}

	private final void solve(boolean isRange, int... numbers) {
		for (int number : numbers) {
			process(classes.get(number - 1));
		}
	}

	private final void solve(int startrange, int endrange) {
		List<Class<? extends IProblem>> rangeclasses = classes.subList(
				startrange - 1, endrange);
		for (Class<? extends IProblem> clazz : rangeclasses) {
			process(clazz);
		}
	}

	private final void header() {
		Learning.headerformat();
		Learning.write(KeyConstant.BLANK);
		Learning.write(KeyConstant.DOUBLEMULTILINE);

	}

	private final void footer() {

		Learning.write("Total No of Problem Attempt: "
				+ Learning.getNumberLetters(noofproblem).toUpperCase());

		Learning.write("Total Time Taken: " + (stopTime - startTime)
				+ " milliseconds");
		Learning.write("Total Pass: " + pass);
		Learning.write("Total Fail: " + fail);
		Learning.write("Total No Of Problem Failed In Time Boundation: "
				+ timeExceeded);
		Learning.write(KeyConstant.DOUBLEMULTILINE);
		for (final Solution failProblem : failed) {
			Exception ex = failProblem.getException();

			Learning.error("**************");
			Learning.error("Exception in problem no :" + failProblem.getProblemNo());
			ex.printStackTrace();

		}

	}

	private final void process(final Class<? extends IProblem> problems) {
		noofproblem = noofproblem + 1;
		final Solution solution = new Solution();
		IProblem problem = null;
		final String className = problems.getCanonicalName();
		try {
			final Class<?> myClass = myClassLoader.loadClass(className);
			final Object whatInstance = myClass.newInstance();

			problem = ((IProblem) whatInstance);

			solution.setProblemNo(problem.getNo());
			try {
				long startTime = System.currentTimeMillis();

				Object result = problem.solve();
				long stopTime = System.currentTimeMillis();
				solution.setResult(result);
				solution.setTime(stopTime - startTime);
				solution.setState(KeyConstant.ThreeState.PASS);
			} catch (Exception ex) {
				solution.setException(ex);
				solution.setState(KeyConstant.ThreeState.FAIL);
			}

			solution.setClassName(problems.getSimpleName());

			switch (solution.getState()) {

			case PASS:
				this.pass++;
				break;
			case FAIL:
				this.fail++;
				this.failed.add(solution);
				break;
			case TIME_EXCEEDED:
				this.timeExceeded++;
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
		final Reflections reflections = new Reflections("project.euler.problem");
		final Set<Class<? extends IProblem>> allClasses = reflections
				.getSubTypesOf(IProblem.class);
		this.classes = new ArrayList<Class<? extends IProblem>>(allClasses);

		Collections.sort(this.classes,
				new Comparator<Class<? extends IProblem>>() {

					public int compare(final Class<? extends IProblem> clazz,
							final Class<? extends IProblem> clajj) {

						return clazz.getSimpleName().compareTo(
								clajj.getSimpleName());
					}
				});

		this.header();
		this.startTime = System.currentTimeMillis();

	}
}
