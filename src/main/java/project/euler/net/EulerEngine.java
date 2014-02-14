package project.euler.net;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import project.euler.base.IProblem;
import project.euler.base.KeyConstant;
import project.euler.base.Solution;
import project.euler.problem._001MultiplesOf3And5;
import project.euler.problem._002EvenFibonacciNumbers;
import project.euler.problem._003LargestPrimeFactor;
import project.euler.problem._004LargestPalindromeProduct;
import project.euler.problem._005SmallestMultiple;
import project.euler.problem._006SumSquareDifference;
import project.euler.problem._007TenThousandFirstPrime;
import project.euler.problem._008LargestProductInASeries;
import project.euler.problem._009SpecialPythagoreanTriplet;
import project.euler.problem._010SummationOfPrimes;
import project.euler.problem._011LargestProductInAGrid;
import project.euler.problem._012HighlyDivisibleTriangularNumber;
import project.euler.problem._013LargeSum;
import project.euler.problem._014LongestCollatzSequence;
import project.euler.problem._015LatticePaths;
import project.euler.problem._016PowerDigitSum;
import project.euler.problem._017NumberLetterCounts;
import project.euler.problem._018MaximumPathSumI;
import project.euler.problem._019CountingSundays;
import project.euler.problem._020FactorialDigitSum;
import project.euler.problem._021AmicableNumbers;
import project.euler.problem._022NamesScores;
import project.euler.problem._023NonAbundantSums;
import project.euler.problem._024LexicographicPermutations;
import project.euler.problem._025ThousandDigitFibonacciNumber;
import project.euler.problem._026ReciprocalCycles;
import project.euler.problem._027QuadraticPrimes;
import project.euler.problem._028NumberSpiralDiagonals;
import project.euler.problem._029DistinctPowers;
import project.euler.problem._030DigitFifthPowers;
import project.euler.problem._031CoinSums;
import project.euler.problem._032PandigitalProducts;
import project.euler.problem._033DigitCancelingFractions;
import project.euler.problem._034DigitFactorials;
import project.euler.problem._035CircularPrimes;
import project.euler.problem._036DoubleBasePalindromes;
import project.euler.problem._037TruncatablePrimes;
import project.euler.problem._038PandigitalMultiples;
import project.euler.problem._039IntegerRightTriangles;
import project.euler.problem._040ChampernowneConstant;
import project.euler.problem._041PandigitalPrime;
import project.euler.problem._042CodedTriangleNumbers;
import project.euler.problem._043SubStringDivisibility;
import project.euler.problem._044PentagonNumbers;
import project.euler.problem._045TriangularPentagonalAndHexagonal;
import project.euler.problem._046GoldbachsOtherConjecture;
import project.euler.problem._047DistinctPrimesFactors;
import project.euler.problem._048SelfPowers;
import project.euler.problem._049PrimePermutations;
import project.euler.problem._050ConsecutivePrimeSum;
import project.euler.problem._051NextPrimeDigitReplacements;
import project.euler.problem._052PermutedMultiples;
import project.euler.problem._053CombinatoricSelections;
import project.euler.problem._054PokerHands;
import project.euler.util.NumberText;
import project.euler.util.Writer;

public final class EulerEngine {

	private static final Map<Integer, String> results = new LinkedHashMap<>();
	private static final ClassLoader CLASSLOADER = ClassLoader
			.getSystemClassLoader();
	private static Map<Integer, Class<? extends IProblem>> classes = new LinkedHashMap<>();

	static {
		classes.put(1, _001MultiplesOf3And5.class);
		classes.put(2, _002EvenFibonacciNumbers.class);
		classes.put(3, _003LargestPrimeFactor.class);
		classes.put(4, _004LargestPalindromeProduct.class);
		classes.put(5, _005SmallestMultiple.class);
		classes.put(6, _006SumSquareDifference.class);
		classes.put(7, _007TenThousandFirstPrime.class);
		classes.put(8, _008LargestProductInASeries.class);
		classes.put(9, _009SpecialPythagoreanTriplet.class);
		classes.put(10, _010SummationOfPrimes.class);
		classes.put(11, _011LargestProductInAGrid.class);
		classes.put(12, _012HighlyDivisibleTriangularNumber.class);
		classes.put(13, _013LargeSum.class);
		classes.put(14, _014LongestCollatzSequence.class);
		classes.put(15, _015LatticePaths.class);
		classes.put(16, _016PowerDigitSum.class);
		classes.put(17, _017NumberLetterCounts.class);
		classes.put(18, _018MaximumPathSumI.class);
		classes.put(19, _019CountingSundays.class);
		classes.put(20, _020FactorialDigitSum.class);
		classes.put(21, _021AmicableNumbers.class);
		classes.put(22, _022NamesScores.class);
		classes.put(23, _023NonAbundantSums.class);
		classes.put(24, _024LexicographicPermutations.class);
		classes.put(25, _025ThousandDigitFibonacciNumber.class);
		classes.put(26, _026ReciprocalCycles.class);
		classes.put(27, _027QuadraticPrimes.class);
		classes.put(28, _028NumberSpiralDiagonals.class);
		classes.put(29, _029DistinctPowers.class);
		classes.put(30, _030DigitFifthPowers.class);
		classes.put(31, _031CoinSums.class);
		classes.put(32, _032PandigitalProducts.class);
		classes.put(33, _033DigitCancelingFractions.class);
		classes.put(34, _034DigitFactorials.class);
		classes.put(35, _035CircularPrimes.class);
		classes.put(36, _036DoubleBasePalindromes.class);
		classes.put(37, _037TruncatablePrimes.class);
		classes.put(38, _038PandigitalMultiples.class);
		classes.put(39, _039IntegerRightTriangles.class);
		classes.put(40, _040ChampernowneConstant.class);
		classes.put(41, _041PandigitalPrime.class);
		classes.put(42, _042CodedTriangleNumbers.class);
		classes.put(43, _043SubStringDivisibility.class);
		classes.put(44, _044PentagonNumbers.class);
		classes.put(45, _045TriangularPentagonalAndHexagonal.class);
		classes.put(46, _046GoldbachsOtherConjecture.class);
		classes.put(47, _047DistinctPrimesFactors.class);
		classes.put(48, _048SelfPowers.class);
		classes.put(49, _049PrimePermutations.class);
		classes.put(50, _050ConsecutivePrimeSum.class);
		classes.put(51, _051NextPrimeDigitReplacements.class);
		classes.put(52, _052PermutedMultiples.class);
		classes.put(53, _053CombinatoricSelections.class);
		classes.put(54, _054PokerHands.class);

	}
	private final transient List<Solution> failed = new ArrayList<>();

	private static int pass = 0;
	private static int fail = 0;
	private static int timeExceeded = 0;
	private static int mismatch = 0;
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

	private void readProperties() {
		InputStream input = null;
		Properties props = new Properties();
		try {

			input = EulerEngine.class.getClassLoader().getResourceAsStream(
					"solution.properties");

			// load a properties file from class path, inside static method
			props.load(input);

			props.load(input);
			Enumeration<Object> keys = props.keys();

			while (keys.hasMoreElements()) {
				Object key = (Object) keys.nextElement();
				results.put(Integer.parseInt(key.toString()),
						(String) props.get(key));
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
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
		Writer.write(KeyConstant.DOUBLEMULTILINE);
		stopTime = System.currentTimeMillis();
		this.footer();

	}

	private void solve(final boolean isRange, final int... numbers) {
		for (int number : numbers) {
			process(classes.get(number));
		}
	}

	private void solve(final int startrange, final int endrange) {

		for (Map.Entry<Integer, Class<? extends IProblem>> clazz : classes
				.entrySet()) {
			if (clazz.getKey() >= startrange && clazz.getKey() <= endrange) {
				process(clazz.getValue());
			}
		}

	}

	private void header() {
		Writer.headerformat();
		Writer.write(KeyConstant.BLANK);
		Writer.write(KeyConstant.DOUBLEMULTILINE);

	}

	private void footer() {

		Writer.write("Total No of Problem Attempt: "
				+ NumberText.getNumberLetters(noofproblem).toUpperCase());

		Writer.write("Total Time Taken: " + (stopTime - startTime)
				+ " milliseconds");
		Writer.write("Total Pass: " + pass);
		Writer.write("Total Fail: " + fail);
		Writer.write("Total Mismatch: " + mismatch);
		Writer.write("Total No Of Problem Failed In Time Boundation: "
				+ timeExceeded);
		Writer.write(KeyConstant.DOUBLEMULTILINE);
		for (final Solution failProblem : failed) {
			final Exception exception = failProblem.getException();

			Writer.error("**************");
			Writer.error("Exception in problem no :"
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
				if (result.toString().equals(solution.getActualresult())) {
					solution.setState(KeyConstant.FourState.PASS);
				} else {
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
			Writer.format(solution);
			Writer.write(KeyConstant.BLANK);
		} catch (Exception ex) {
			Writer.error("**************");
			Writer.error("Exception in problem no :" + className);
			ex.printStackTrace();
			Writer.error("**************");
		}
	}

	private EulerEngine() {
		readProperties();

		this.header();

	}
}
