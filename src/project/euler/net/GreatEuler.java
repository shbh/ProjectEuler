package project.euler.net;

import static project.euler.util.Learning.solution;
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

public class GreatEuler {
	public GreatEuler problem001() {
		IProblem problem = new MultiplesOf3And5().limit(1000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem002() {
		IProblem problem = new EvenFibonacciNumbers().limit(4000000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem003() {
		IProblem problem = new LargestPrimeFactor().inputnumber(600851475143l);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem004() {
		IProblem problem = new LargestPalindromeProduct().upper(1000)
				.lower(100);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem005() {
		IProblem problem = new SmallestMultiple().divisor(20);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem006() {
		IProblem problem = new SumSquareDifference().limit(100);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem007() {
		IProblem problem = new TenThousandFirstPrime().number(10001);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem008() {
		IProblem problem = new LargestProductInASeries().factor(5);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem009() {
		IProblem problem = new SpecialPythagoreanTriplet().marker(1000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem010() {
		IProblem problem = new SummationOfPrimes().limit(2000000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem011() {
		IProblem problem = new LargestProductInAGrid();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem012() {
		IProblem problem = new HighlyDivisibleTriangularNumber().total(500);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem013() {
		IProblem problem = new LargeSum();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem014() {
		IProblem problem = new LongestCollatzSequence().limit(1000000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem015() {
		IProblem problem = new LatticePaths().limit(20);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem016() {
		IProblem problem = new PowerDigitSum().limit(1000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem017() {
		IProblem problem = new NumberLetterCounts();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem018() {
		IProblem problem = new MaximumPathSumI();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem019() {
		IProblem problem = new CountingSundays().before(2001);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem020() {
		IProblem problem = new FactorialDigitSum().limit(100);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem021() {
		IProblem problem = new AmicableNumbers().limit(10000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem022() {
		IProblem problem = new NamesScores().path("C:\\names.txt");
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem023() {
		IProblem problem = new NonAbundantSums();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem024() {
		IProblem problem = new LexicographicPermutations().position(1000000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem025() {
		IProblem problem = new ThousandDigitFibonacciNumber().limit(1000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem026() {
		IProblem problem = new ReciprocalCycles().limit(1000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem027() {
		IProblem problem = new QuadraticPrimes().limit(1000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem028() {
		IProblem problem = new NumberSpiralDiagonals().limit(1001);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem029() {
		IProblem problem = new DistinctPowers().a(2, 100).b(2, 100);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem030() {
		IProblem problem = new DigitFifthPowers().digit(5);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem031() {
		IProblem problem = new CoinSums().target(200);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem032() {
		IProblem problem = new PandigitalProducts();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem033() {
		IProblem problem = new DigitCancelingFractions().numerator(100)
				.denominator(100);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem034() {
		IProblem problem = new DigitFactorials();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem035() {
		IProblem problem = new CircularPrimes().limit(1000000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem036() {
		IProblem problem = new DoubleBasePalindromes().limit(1000000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem037() {
		IProblem problem = new TruncatablePrimes().limit(11);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem038() {
		IProblem problem = new PandigitalMultiples();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem039() {
		IProblem problem = new IntegerRightTriangles().limit(1000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem040() {
		IProblem problem = new ChampernowneConstant().limit(7);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem041() {
		IProblem problem = new PandigitalPrime();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem042() {
		IProblem problem = new CodedTriangleNumbers().path("C:\\words.txt");
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem043() {
		IProblem problem = new SubStringDivisibility();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem044() {
		IProblem problem = new PentagonNumbers();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem045() {
		IProblem problem = new TriangularPentagonalAndHexagonal();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem046() {
		IProblem problem = new GoldbachsOtherConjecture();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem047() {
		IProblem problem = new DistinctPrimesFactors().count(4);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem048() {
		IProblem problem = new SelfPowers().limit(1000);
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem049() {
		IProblem problem = new PrimePermutations();
		solution(problem.solve());
		return this;
	}

	public GreatEuler problem050() {
		IProblem problem = new ConsecutivePrimeSum().limit(1000000);
		solution(problem.solve());
		return this;
	}
	
	public static void main(String[] args) {
		
	}
}
