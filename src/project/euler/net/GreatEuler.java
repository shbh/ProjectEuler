package project.euler.net;

import project.euler.base.IProblem;
import project.euler.base.Key;
import project.euler.base.Problem;
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
import project.euler.problem._052PermutedMultiples;
import project.euler.problem._053CombinatoricSelections;

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
		IProblem problem = new _001MultiplesOf3And5().limit(1000);
		return execute(problem);
	}

	public Object problem002() {
		IProblem problem = new _002EvenFibonacciNumbers().limit(4000000);
		return execute(problem);
	}

	public Object problem003() {
		IProblem problem = new _003LargestPrimeFactor().inputnumber(600851475143l);
		return execute(problem);
	}

	public Object problem004() {
		IProblem problem = new _004LargestPalindromeProduct().upper(1000)
				.lower(100);
		return execute(problem);
	}

	public Object problem005() {
		IProblem problem = new _005SmallestMultiple().divisor(20);
		return execute(problem);
	}

	public Object problem006() {
		IProblem problem = new _006SumSquareDifference().limit(100);
		return execute(problem);
	}

	public Object problem007() {
		IProblem problem = new _007TenThousandFirstPrime().number(10001);
		return execute(problem);
	}

	public Object problem008() {
		IProblem problem = new _008LargestProductInASeries().factor(5);
		return execute(problem);
	}

	public Object problem009() {
		IProblem problem = new _009SpecialPythagoreanTriplet().marker(1000);
		return execute(problem);
	}

	public Object problem010() {
		IProblem problem = new _010SummationOfPrimes().limit(2000000);
		return execute(problem);
	}

	public Object problem011() {
		IProblem problem = new _011LargestProductInAGrid();
		return execute(problem);
	}

	public Object problem012() {
		IProblem problem = new _012HighlyDivisibleTriangularNumber().total(500);
		return execute(problem);
	}

	public Object problem013() {
		IProblem problem = new _013LargeSum();
		return execute(problem);
	}

	public Object problem014() {
		IProblem problem = new _014LongestCollatzSequence().limit(1000000);
		return execute(problem);
	}

	public Object problem015() {
		IProblem problem = new _015LatticePaths().limit(20);
		return execute(problem);
	}

	public Object problem016() {
		IProblem problem = new _016PowerDigitSum().limit(1000);
		return execute(problem);
	}

	public Object problem017() {
		IProblem problem = new _017NumberLetterCounts();
		return execute(problem);
	}

	public Object problem018() {
		IProblem problem = new _018MaximumPathSumI();
		return execute(problem);
	}

	public Object problem019() {
		IProblem problem = new _019CountingSundays().before(2001);
		return execute(problem);
	}

	public Object problem020() {
		IProblem problem = new _020FactorialDigitSum().limit(100);
		return execute(problem);
	}

	public Object problem021() {
		IProblem problem = new _021AmicableNumbers().limit(10000);
		return execute(problem);
	}

	public Object problem022() {
		IProblem problem = new _022NamesScores();
		return execute(problem);
	}

	public Object problem023() {
		IProblem problem = new _023NonAbundantSums();
		return execute(problem);
	}

	public Object problem024() {
		IProblem problem = new _024LexicographicPermutations().position(1000000);
		return execute(problem);
	}

	public Object problem025() {
		IProblem problem = new _025ThousandDigitFibonacciNumber().limit(1000);
		return execute(problem);
	}

	public Object problem026() {
		IProblem problem = new _026ReciprocalCycles().limit(1000);
		return execute(problem);
	}

	public Object problem027() {
		IProblem problem = new _027QuadraticPrimes().limit(1000);
		return execute(problem);
	}

	public Object problem028() {
		IProblem problem = new _028NumberSpiralDiagonals().limit(1001);
		return execute(problem);
	}

	public Object problem029() {
		IProblem problem = new _029DistinctPowers().a(2, 100).b(2, 100);
		return execute(problem);
	}

	public Object problem030() {
		IProblem problem = new _030DigitFifthPowers().digit(5);
		return execute(problem);
	}

	public Object problem031() {
		IProblem problem = new _031CoinSums().target(200);
		return execute(problem);
	}

	public Object problem032() {
		IProblem problem = new _032PandigitalProducts();
		return execute(problem);
	}

	public Object problem033() {
		IProblem problem = new _033DigitCancelingFractions().numerator(100)
				.denominator(100);
		return execute(problem);
	}

	public Object problem034() {
		IProblem problem = new _034DigitFactorials();
		return execute(problem);
	}

	public Object problem035() {
		IProblem problem = new _035CircularPrimes().limit(1000000);
		return execute(problem);
	}

	public Object problem036() {
		IProblem problem = new _036DoubleBasePalindromes().limit(1000000);
		return execute(problem);
	}

	public Object problem037() {
		IProblem problem = new _037TruncatablePrimes().limit(11);
		return execute(problem);
	}

	public Object problem038() {
		IProblem problem = new _038PandigitalMultiples();
		return execute(problem);
	}

	public Object problem039() {
		IProblem problem = new _039IntegerRightTriangles().limit(1000);
		return execute(problem);
	}

	public Object problem040() {
		IProblem problem = new _040ChampernowneConstant().limit(7);
		return execute(problem);
	}

	public Object problem041() {
		IProblem problem = new _041PandigitalPrime();
		return execute(problem);
	}

	public Object problem042() {
		IProblem problem = new _042CodedTriangleNumbers();
		return execute(problem);
	}

	public Object problem043() {
		IProblem problem = new _043SubStringDivisibility();
		return execute(problem);
	}

	public Object problem044() {
		IProblem problem = new _044PentagonNumbers();
		return execute(problem);
	}

	public Object problem045() {
		IProblem problem = new _045TriangularPentagonalAndHexagonal();
		return execute(problem);
	}

	public Object problem046() {
		IProblem problem = new _046GoldbachsOtherConjecture();
		return execute(problem);
	}

	public Object problem047() {
		IProblem problem = new _047DistinctPrimesFactors().count(4);
		return execute(problem);
	}

	public Object problem048() {
		IProblem problem = new _048SelfPowers().limit(1000);
		return execute(problem);
	}

	public Object problem049() {
		IProblem problem = new _049PrimePermutations();
		return execute(problem);
	}

	public Object problem050() {
		IProblem problem = new _050ConsecutivePrimeSum().limit(1000000);
		return execute(problem);
	}

	public Object problem052() {
		IProblem problem = new _052PermutedMultiples();
		return execute(problem);
	}


	public Object problem053() {
		IProblem problem = new _053CombinatoricSelections();
		return execute(problem);
	}
}
