package project.euler.net;

import project.euler.AmicableNumbers;
import project.euler.ChampernowneConstant;
import project.euler.CircularPrimes;
import project.euler.CodedTriangleNumbers;
import project.euler.CoinSums;
import project.euler.ConsecutivePrimeSum;
import project.euler.CountingSundays;
import project.euler.DigitCancelingFractions;
import project.euler.DigitFactorials;
import project.euler.DigitFifthPowers;
import project.euler.DistinctPowers;
import project.euler.DistinctPrimesFactors;
import project.euler.DoubleBasePalindromes;
import project.euler.EvenFibonacciNumbers;
import project.euler.FactorialDigitSum;
import project.euler.GoldbachsOtherConjecture;
import project.euler.HighlyDivisibleTriangularNumber;
import project.euler.IntegerRightTriangles;
import project.euler.LargeSum;
import project.euler.LargestPalindromeProduct;
import project.euler.LargestPrimeFactor;
import project.euler.LargestProductInAGrid;
import project.euler.LargestProductInASeries;
import project.euler.LatticePaths;
import project.euler.LexicographicPermutations;
import project.euler.LongestCollatzSequence;
import project.euler.MaximumPathSumI;
import project.euler.MultiplesOf3And5;
import project.euler.NamesScores;
import project.euler.NonAbundantSums;
import project.euler.NumberLetterCounts;
import project.euler.NumberSpiralDiagonals;
import project.euler.PandigitalMultiples;
import project.euler.PandigitalPrime;
import project.euler.PandigitalProducts;
import project.euler.PentagonNumbers;
import project.euler.PowerDigitSum;
import project.euler.PrimePermutations;
import project.euler.QuadraticPrimes;
import project.euler.ReciprocalCycles;
import project.euler.SelfPowers;
import project.euler.SmallestMultiple;
import project.euler.SpecialPythagoreanTriplet;
import project.euler.SubStringDivisibility;
import project.euler.SumSquareDifference;
import project.euler.SummationOfPrimes;
import project.euler.TenThousandFirstPrime;
import project.euler.ThousandDigitFibonacciNumber;
import project.euler.TriangularPentagonalAndHexagonal;
import project.euler.TruncatablePrimes;
import project.euler.base.IProblem;
import project.euler.base.Key;
import project.euler.base.Problem;

public class GreatEuler {

	private Problem execute(IProblem problem) {

		Problem p = new Problem();
		try {
			long startTime = System.currentTimeMillis();
			Object result = problem.solve();
			long stopTime = System.currentTimeMillis();
			p.setResult(result);
			p.setTime(stopTime - startTime);
			p.setState(Key.ThreeState.PASS);
		} catch (Exception ex) {
			p.setException(ex);
			p.setState(Key.ThreeState.FAIL);
		}

		return p;
	}

	public Object problem001() {
		IProblem problem = new MultiplesOf3And5().limit(1000);
		return execute(problem);
	}

	public Object problem002() {
		IProblem problem = new EvenFibonacciNumbers().limit(4000000);
		return execute(problem);
	}

	public Object problem003() {
		IProblem problem = new LargestPrimeFactor().inputnumber(600851475143l);
		return execute(problem);
	}

	public Object problem004() {
		IProblem problem = new LargestPalindromeProduct().upper(1000)
				.lower(100);
		return execute(problem);
	}

	public Object problem005() {
		IProblem problem = new SmallestMultiple().divisor(20);
		return execute(problem);
	}

	public Object problem006() {
		IProblem problem = new SumSquareDifference().limit(100);
		return execute(problem);
	}

	public Object problem007() {
		IProblem problem = new TenThousandFirstPrime().number(10001);
		return execute(problem);
	}

	public Object problem008() {
		IProblem problem = new LargestProductInASeries().factor(5);
		return execute(problem);
	}

	public Object problem009() {
		IProblem problem = new SpecialPythagoreanTriplet().marker(1000);
		return execute(problem);
	}

	public Object problem010() {
		IProblem problem = new SummationOfPrimes().limit(2000000);
		return execute(problem);
	}

	public Object problem011() {
		IProblem problem = new LargestProductInAGrid();
		return execute(problem);
	}

	public Object problem012() {
		IProblem problem = new HighlyDivisibleTriangularNumber().total(500);
		return execute(problem);
	}

	public Object problem013() {
		IProblem problem = new LargeSum();
		return execute(problem);
	}

	public Object problem014() {
		IProblem problem = new LongestCollatzSequence().limit(1000000);
		return execute(problem);
	}

	public Object problem015() {
		IProblem problem = new LatticePaths().limit(20);
		return execute(problem);
	}

	public Object problem016() {
		IProblem problem = new PowerDigitSum().limit(1000);
		return execute(problem);
	}

	public Object problem017() {
		IProblem problem = new NumberLetterCounts();
		return execute(problem);
	}

	public Object problem018() {
		IProblem problem = new MaximumPathSumI();
		return execute(problem);
	}

	public Object problem019() {
		IProblem problem = new CountingSundays().before(2001);
		return execute(problem);
	}

	public Object problem020() {
		IProblem problem = new FactorialDigitSum().limit(100);
		return execute(problem);
	}

	public Object problem021() {
		IProblem problem = new AmicableNumbers().limit(10000);
		return execute(problem);
	}

	public Object problem022() {
		IProblem problem = new NamesScores().path("C:\\names.txt");
		return execute(problem);
	}

	public Object problem023() {
		IProblem problem = new NonAbundantSums();
		return execute(problem);
	}

	public Object problem024() {
		IProblem problem = new LexicographicPermutations().position(1000000);
		return execute(problem);
	}

	public Object problem025() {
		IProblem problem = new ThousandDigitFibonacciNumber().limit(1000);
		return execute(problem);
	}

	public Object problem026() {
		IProblem problem = new ReciprocalCycles().limit(1000);
		return execute(problem);
	}

	public Object problem027() {
		IProblem problem = new QuadraticPrimes().limit(1000);
		return execute(problem);
	}

	public Object problem028() {
		IProblem problem = new NumberSpiralDiagonals().limit(1001);
		return execute(problem);
	}

	public Object problem029() {
		IProblem problem = new DistinctPowers().a(2, 100).b(2, 100);
		return execute(problem);
	}

	public Object problem030() {
		IProblem problem = new DigitFifthPowers().digit(5);
		return execute(problem);
	}

	public Object problem031() {
		IProblem problem = new CoinSums().target(200);
		return execute(problem);
	}

	public Object problem032() {
		IProblem problem = new PandigitalProducts();
		return execute(problem);
	}

	public Object problem033() {
		IProblem problem = new DigitCancelingFractions().numerator(100)
				.denominator(100);
		return execute(problem);
	}

	public Object problem034() {
		IProblem problem = new DigitFactorials();
		return execute(problem);
	}

	public Object problem035() {
		IProblem problem = new CircularPrimes().limit(1000000);
		return execute(problem);
	}

	public Object problem036() {
		IProblem problem = new DoubleBasePalindromes().limit(1000000);
		return execute(problem);
	}

	public Object problem037() {
		IProblem problem = new TruncatablePrimes().limit(11);
		return execute(problem);
	}

	public Object problem038() {
		IProblem problem = new PandigitalMultiples();
		return execute(problem);
	}

	public Object problem039() {
		IProblem problem = new IntegerRightTriangles().limit(1000);
		return execute(problem);
	}

	public Object problem040() {
		IProblem problem = new ChampernowneConstant().limit(7);
		return execute(problem);
	}

	public Object problem041() {
		IProblem problem = new PandigitalPrime();
		return execute(problem);
	}

	public Object problem042() {
		IProblem problem = new CodedTriangleNumbers().path("C:\\words.txt");
		return execute(problem);
	}

	public Object problem043() {
		IProblem problem = new SubStringDivisibility();
		return execute(problem);
	}

	public Object problem044() {
		IProblem problem = new PentagonNumbers();
		return execute(problem);
	}

	public Object problem045() {
		IProblem problem = new TriangularPentagonalAndHexagonal();
		return execute(problem);
	}

	public Object problem046() {
		IProblem problem = new GoldbachsOtherConjecture();
		return execute(problem);
	}

	public Object problem047() {
		IProblem problem = new DistinctPrimesFactors().count(4);
		return execute(problem);
	}

	public Object problem048() {
		IProblem problem = new SelfPowers().limit(1000);
		return execute(problem);
	}

	public Object problem049() {
		IProblem problem = new PrimePermutations();
		return execute(problem);
	}

	public Object problem050() {
		IProblem problem = new ConsecutivePrimeSum().limit(1000000);
		return execute(problem);
	}

}
