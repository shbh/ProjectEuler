package project.euler.net;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;

import project.euler.base.IProblem;
import project.euler.base.Key;
import project.euler.base.Solution;
import project.euler.util.Learning;

public class EulerEngine {

	private ClassLoader myClassLoader = ClassLoader.getSystemClassLoader();
	List<Class<? extends IProblem>> classes = null;
	List<Solution> failed = new ArrayList<>();

	private int pass = 0;
	private int fail = 0;
	private int timeExceeded = 0;
	long startTime = 0l;
	long stopTime = 0l;
	int noofproblem = 0;

	public static void main(String[] args) {

		EulerEngine engine = new EulerEngine();

		engine.solve(15, 18);

		engine.postProcess();
	}

	private void postProcess() {
		Learning.write(Key.DOUBLEMULTILINE);
		this.stopTime = System.currentTimeMillis();
		this.footer();

	}

	public void solve(boolean isRange, int... numbers) {
		for (int number : numbers) {
			process(classes.get(number - 1));
		}
	}

	public void solve(int startrange, int endrange) {
		List<Class<? extends IProblem>> rangeclasses = classes.subList(
				startrange - 1, endrange);
		for (Class<? extends IProblem> clazz : rangeclasses) {
			process(clazz);
		}
	}

	private void header() {
		Learning.headerformat();
		Learning.write(Key.BLANK);
		Learning.write(Key.DOUBLEMULTILINE);

	}

	private void footer() {

		Learning.write("Total No of Problem Attempt: "
				+ Learning.getNumberLetters(noofproblem).toUpperCase());

		Learning.write("Total Time Taken: " + (stopTime - startTime)
				+ " milliseconds");
		Learning.write("Total Pass: " + pass);
		Learning.write("Total Fail: " + fail);
		Learning.write("Total No Of Problem Failed In Time Boundation: "
				+ timeExceeded);
		Learning.write(Key.DOUBLEMULTILINE);
		for (Solution failProblem : failed) {
			Exception ex = failProblem.getException();

			Learning.error("**************");
			Learning.error("Exception in problem no :" + failProblem.getNo());
			ex.printStackTrace();

		}

	}

	private void process(Class<? extends IProblem> problems) {
		noofproblem = noofproblem + 1;
		Solution solution = new Solution();
		IProblem problem = null;
		String className = problems.getCanonicalName();
		try {
			Class<?> myClass = myClassLoader.loadClass(className);
			Object whatInstance = myClass.newInstance();

			problem = ((IProblem) whatInstance);

			solution.setNo(problem.getNo());
			try {
				long startTime = System.currentTimeMillis();

				Object result = problem.solve();
				long stopTime = System.currentTimeMillis();
				solution.setResult(result);
				solution.setTime(stopTime - startTime);
				solution.setState(Key.ThreeState.PASS);
			} catch (Exception ex) {
				solution.setException(ex);
				solution.setState(Key.ThreeState.FAIL);
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
			Learning.write(Key.BLANK);
		} catch (Exception ex) {
			Learning.error("**************");
			Learning.error("Exception in problem no :" + className);
			ex.printStackTrace();
			Learning.error("**************");
		}
	}

	public EulerEngine() {
		Reflections reflections = new Reflections("project.euler.problem");
		Set<Class<? extends IProblem>> allClasses = reflections
				.getSubTypesOf(IProblem.class);
		this.classes = new ArrayList<Class<? extends IProblem>>(allClasses);

		Collections.sort(this.classes,
				new Comparator<Class<? extends IProblem>>() {

					public int compare(Class<? extends IProblem> clazz,
							Class<? extends IProblem> clajj) {

						return clazz.getSimpleName().compareTo(
								clajj.getSimpleName());
					}
				});

		this.header();
		this.startTime = System.currentTimeMillis();

	}
}
