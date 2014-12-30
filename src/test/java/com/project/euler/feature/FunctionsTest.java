package com.project.euler.feature;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FunctionsTest</code> contains tests for the class <code>{@link Functions}</code>.
 *
 * @generatedBy CodePro at 30/12/14 4:43 PM
 * @author test
 * @version $Revision: 1.0 $
 */
public class FunctionsTest {
	/**
	 * Run the int GcdR(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGcdR_1()
		throws Exception {
		int value1 = 1;
		int value2 = 1;

		int result = Functions.GcdR(value1, value2);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int GcdR(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGcdR_2()
		throws Exception {
		int value1 = 0;
		int value2 = 1;

		int result = Functions.GcdR(value1, value2);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Integer addDigit(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testAddDigit_1()
		throws Exception {
		BigInteger number = BigInteger.valueOf(1L);

		Integer result = Functions.addDigit(number);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer addDigit(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testAddDigit_2()
		throws Exception {
		BigInteger number = BigInteger.valueOf(1L);

		Integer result = Functions.addDigit(number);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the boolean areDistinctDigits(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testAreDistinctDigits_1()
		throws Exception {
		long number = 1L;

		boolean result = Functions.areDistinctDigits(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean areDistinctDigits(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testAreDistinctDigits_2()
		throws Exception {
		long number = 1L;

		boolean result = Functions.areDistinctDigits(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean areDistinctDigits(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testAreDistinctDigits_3()
		throws Exception {
		long number = 0L;

		boolean result = Functions.areDistinctDigits(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the long concat(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testConcat_1()
		throws Exception {
		long a = 1L;
		long b = 1L;

		long result = Functions.concat(a, b);

		// add additional test code here
		assertEquals(11L, result);
	}

	/**
	 * Run the long concat(long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testConcat_2()
		throws Exception {
		long a = 1L;
		long b = 0L;

		long result = Functions.concat(a, b);

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the int containPrimeFactor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testContainPrimeFactor_1()
		throws Exception {
		int number = 1;

		int result = Functions.containPrimeFactor(number);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int containPrimeFactor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testContainPrimeFactor_2()
		throws Exception {
		int number = 1;

		int result = Functions.containPrimeFactor(number);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int containPrimeFactor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testContainPrimeFactor_3()
		throws Exception {
		int number = 1;

		int result = Functions.containPrimeFactor(number);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countNoOfRelativePrime(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testCountNoOfRelativePrime_1()
		throws Exception {
		int number = 1;

		int result = Functions.countNoOfRelativePrime(number);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countNoOfRelativePrime(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testCountNoOfRelativePrime_2()
		throws Exception {
		int number = 1;

		int result = Functions.countNoOfRelativePrime(number);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countNoOfRelativePrime(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testCountNoOfRelativePrime_3()
		throws Exception {
		int number = 0;

		int result = Functions.countNoOfRelativePrime(number);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int countdivisor(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testCountdivisor_1()
		throws Exception {
		long trianglenumber = 2L;

		int result = Functions.countdivisor(trianglenumber);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countdivisor(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testCountdivisor_2()
		throws Exception {
		long trianglenumber = 2L;

		int result = Functions.countdivisor(trianglenumber);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countdivisor(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testCountdivisor_3()
		throws Exception {
		long trianglenumber = 1L;

		int result = Functions.countdivisor(trianglenumber);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the long factorial(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFactorial_1()
		throws Exception {
		int n = 0;

		long result = Functions.factorial(n);

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the long factorial(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFactorial_2()
		throws Exception {
		int n = 1;

		long result = Functions.factorial(n);

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the long factorial(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFactorial_3()
		throws Exception {
		int n = -1;

		long result = Functions.factorial(n);

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the BigInteger findNearestDifference(BigInteger,BigInteger,BigInteger,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFindNearestDifference_1()
		throws Exception {
		BigInteger a = BigInteger.valueOf(1L);
		BigInteger b = BigInteger.valueOf(1L);
		BigInteger k = BigInteger.valueOf(1L);
		int D = 1;

		BigInteger result = Functions.findNearestDifference(a, b, k, D);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.bitCount());
		assertEquals("2", result.toString());
		assertEquals(2, result.intValue());
		assertEquals(2L, result.longValue());
		assertEquals(2.0f, result.floatValue(), 1.0f);
		assertEquals(2.0, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals(2, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals((byte) 2, result.byteValue());
		assertEquals((short) 2, result.shortValue());
	}

	/**
	 * Run the BigInteger findNearestDifference(BigInteger,BigInteger,BigInteger,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFindNearestDifference_2()
		throws Exception {
		BigInteger a = BigInteger.valueOf(1L);
		BigInteger b = BigInteger.valueOf(1L);
		BigInteger k = BigInteger.valueOf(1L);
		int D = 1;

		BigInteger result = Functions.findNearestDifference(a, b, k, D);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.bitCount());
		assertEquals("2", result.toString());
		assertEquals(2, result.intValue());
		assertEquals(2L, result.longValue());
		assertEquals(2.0f, result.floatValue(), 1.0f);
		assertEquals(2.0, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals(2, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals((byte) 2, result.byteValue());
		assertEquals((short) 2, result.shortValue());
	}

	/**
	 * Run the BigInteger findNearestDifference(BigInteger,BigInteger,BigInteger,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFindNearestDifference_3()
		throws Exception {
		BigInteger a = BigInteger.valueOf(1L);
		BigInteger b = BigInteger.valueOf(1L);
		BigInteger k = BigInteger.valueOf(1L);
		int D = 1;

		BigInteger result = Functions.findNearestDifference(a, b, k, D);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.bitCount());
		assertEquals("2", result.toString());
		assertEquals(2, result.intValue());
		assertEquals(2L, result.longValue());
		assertEquals(2.0f, result.floatValue(), 1.0f);
		assertEquals(2.0, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals(2, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals((byte) 2, result.byteValue());
		assertEquals((short) 2, result.shortValue());
	}

	/**
	 * Run the BigInteger findNearestDifference(BigInteger,BigInteger,BigInteger,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFindNearestDifference_4()
		throws Exception {
		BigInteger a = BigInteger.valueOf(1L);
		BigInteger b = BigInteger.valueOf(1L);
		BigInteger k = BigInteger.valueOf(1L);
		int D = 1;

		BigInteger result = Functions.findNearestDifference(a, b, k, D);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.bitCount());
		assertEquals("2", result.toString());
		assertEquals(2, result.intValue());
		assertEquals(2L, result.longValue());
		assertEquals(2.0f, result.floatValue(), 1.0f);
		assertEquals(2.0, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals(2, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals((byte) 2, result.byteValue());
		assertEquals((short) 2, result.shortValue());
	}

	/**
	 * Run the BigInteger findNearestDifference(BigInteger,BigInteger,BigInteger,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFindNearestDifference_5()
		throws Exception {
		BigInteger a = BigInteger.valueOf(1L);
		BigInteger b = BigInteger.valueOf(1L);
		BigInteger k = BigInteger.valueOf(1L);
		int D = 1;

		BigInteger result = Functions.findNearestDifference(a, b, k, D);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.bitCount());
		assertEquals("2", result.toString());
		assertEquals(2, result.intValue());
		assertEquals(2L, result.longValue());
		assertEquals(2.0f, result.floatValue(), 1.0f);
		assertEquals(2.0, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals(2, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals((byte) 2, result.byteValue());
		assertEquals((short) 2, result.shortValue());
	}

	/**
	 * Run the int findNearestSquare(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFindNearestSquare_1()
		throws Exception {
		int number = 1;

		int result = Functions.findNearestSquare(number);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int findNearestSquare(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFindNearestSquare_2()
		throws Exception {
		int number = 1;

		int result = Functions.findNearestSquare(number);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int findNearestSquare(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testFindNearestSquare_3()
		throws Exception {
		int number = 1;

		int result = Functions.findNearestSquare(number);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the Set<String> generate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGenerate_1()
		throws Exception {
		String string = "";

		Set<String> result = Functions.generate(string);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the Set<String> generate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGenerate_2()
		throws Exception {
		String string = "";

		Set<String> result = Functions.generate(string);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the Set<String> generateCircular(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGenerateCircular_1()
		throws Exception {
		String string = "aa";

		Set<String> result = Functions.generateCircular(string);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains("aa"));
	}

	/**
	 * Run the Set<String> generateCircular(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGenerateCircular_2()
		throws Exception {
		String string = "";

		Set<String> result = Functions.generateCircular(string);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the Set<String> generateCircular(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGenerateCircular_3()
		throws Exception {
		String string = "aa";

		Set<String> result = Functions.generateCircular(string);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains("aa"));
	}

	/**
	 * Run the int getCycleLength(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGetCycleLength_1()
		throws Exception {
		int n = 1;

		int result = Functions.getCycleLength(n);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getCycleLength(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGetCycleLength_2()
		throws Exception {
		int n = 1;

		int result = Functions.getCycleLength(n);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int greatestCommonFactor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGreatestCommonFactor_1()
		throws Exception {
		int numerator = 1;
		int denominator = 0;

		int result = Functions.greatestCommonFactor(numerator, denominator);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int greatestCommonFactor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testGreatestCommonFactor_2()
		throws Exception {
		int numerator = 1;
		int denominator = 1;

		int result = Functions.greatestCommonFactor(numerator, denominator);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean hasPandigitalProduct(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testHasPandigitalProduct_1()
		throws Exception {
		int n = 1;

		boolean result = Functions.hasPandigitalProduct(n);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasPandigitalProduct(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testHasPandigitalProduct_2()
		throws Exception {
		int n = 1;

		boolean result = Functions.hasPandigitalProduct(n);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasPandigitalProduct(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testHasPandigitalProduct_3()
		throws Exception {
		int n = 1;

		boolean result = Functions.hasPandigitalProduct(n);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasPandigitalProduct(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testHasPandigitalProduct_4()
		throws Exception {
		int n = 0;

		boolean result = Functions.hasPandigitalProduct(n);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isComposite(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsComposite_1()
		throws Exception {
		long number = 1L;

		boolean result = Functions.isComposite(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isComposite(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsComposite_2()
		throws Exception {
		long number = 1L;

		boolean result = Functions.isComposite(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isComposite(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsComposite_3()
		throws Exception {
		long number = 1L;

		boolean result = Functions.isComposite(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isConjecture(long,long[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsConjecture_1()
		throws Exception {
		long n = 1L;
		long[] sqrt = new long[] {1L};
		int[] prime = new int[] {1};

		boolean result = Functions.isConjecture(n, sqrt, prime);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isConjecture(long,long[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsConjecture_2()
		throws Exception {
		long n = 1L;
		long[] sqrt = new long[] {1L};
		int[] prime = new int[] {1};

		boolean result = Functions.isConjecture(n, sqrt, prime);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isConjecture(long,long[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsConjecture_3()
		throws Exception {
		long n = 1L;
		long[] sqrt = new long[] {};
		int[] prime = new int[] {1};

		boolean result = Functions.isConjecture(n, sqrt, prime);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isConjecture(long,long[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsConjecture_4()
		throws Exception {
		long n = 1L;
		long[] sqrt = new long[] {1L};
		int[] prime = new int[] {1};

		boolean result = Functions.isConjecture(n, sqrt, prime);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isConjecture(long,long[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsConjecture_5()
		throws Exception {
		long n = 1L;
		long[] sqrt = new long[] {};
		int[] prime = new int[] {1};

		boolean result = Functions.isConjecture(n, sqrt, prime);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isConjecture(long,long[],int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsConjecture_6()
		throws Exception {
		long n = 1L;
		long[] sqrt = new long[] {};
		int[] prime = new int[] {};

		boolean result = Functions.isConjecture(n, sqrt, prime);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDoubleBasePalindrome(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsDoubleBasePalindrome_1()
		throws Exception {
		Integer number = Integer.valueOf(1);

		boolean result = Functions.isDoubleBasePalindrome(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDoubleBasePalindrome(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsDoubleBasePalindrome_2()
		throws Exception {
		Integer number = Integer.valueOf(1);

		boolean result = Functions.isDoubleBasePalindrome(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDoubleBasePalindrome(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsDoubleBasePalindrome_3()
		throws Exception {
		Integer number = Integer.valueOf(1);

		boolean result = Functions.isDoubleBasePalindrome(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLychrel(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsLychrel_1()
		throws Exception {
		BigInteger number = BigInteger.valueOf(1L);

		boolean result = Functions.isLychrel(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLychrel(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsLychrel_2()
		throws Exception {
		BigInteger number = BigInteger.valueOf(1L);

		boolean result = Functions.isLychrel(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLychrel(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsLychrel_3()
		throws Exception {
		BigInteger number = BigInteger.valueOf(1L);

		boolean result = Functions.isLychrel(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNumberContainEven(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsNumberContainEven_1()
		throws Exception {
		String string = "aa";

		boolean result = Functions.isNumberContainEven(string);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNumberContainEven(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsNumberContainEven_2()
		throws Exception {
		String string = "aa";

		boolean result = Functions.isNumberContainEven(string);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNumberContainEven(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsNumberContainEven_3()
		throws Exception {
		String string = "";

		boolean result = Functions.isNumberContainEven(string);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPalindrome(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPalindrome_1()
		throws Exception {
		int number = 1;

		boolean result = Functions.isPalindrome(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPalindrome(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPalindrome_2()
		throws Exception {
		int number = 1;

		boolean result = Functions.isPalindrome(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Boolean isPalindrome(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPalindrome_3()
		throws Exception {
		String letters = "";

		Boolean result = Functions.isPalindrome(letters);

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isPalindrome(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPalindrome_4()
		throws Exception {
		String letters = "";

		Boolean result = Functions.isPalindrome(letters);

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the boolean isPandigital(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPandigital_1()
		throws Exception {
		String s = "";

		boolean result = Functions.isPandigital(s);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPandigital(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPandigital_2()
		throws Exception {
		String s = "aaaaaaaaa";

		boolean result = Functions.isPandigital(s);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPandigital(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPandigital_3()
		throws Exception {
		String s = "aaaaaaaaa";

		boolean result = Functions.isPandigital(s);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPandigital(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPandigital_4()
		throws Exception {
		String s = "";
		String number = "";

		boolean result = Functions.isPandigital(s, number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPandigital(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPandigital_5()
		throws Exception {
		String s = "";
		String number = "";

		boolean result = Functions.isPandigital(s, number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPentagonal(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPentagonal_1()
		throws Exception {
		long number = 1L;

		boolean result = Functions.isPentagonal(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPentagonal(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPentagonal_2()
		throws Exception {
		long number = 1L;

		boolean result = Functions.isPentagonal(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPrime(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPrime_1()
		throws Exception {
		long number = -1L;

		boolean result = Functions.isPrime(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPrime(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPrime_2()
		throws Exception {
		long number = -1L;

		boolean result = Functions.isPrime(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPrime(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPrime_3()
		throws Exception {
		long number = 2L;

		boolean result = Functions.isPrime(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPrime(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPrime_4()
		throws Exception {
		long number = -1L;

		boolean result = Functions.isPrime(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPrime(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPrime_5()
		throws Exception {
		long number = 2L;

		boolean result = Functions.isPrime(number);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPrimeBrute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPrimeBrute_1()
		throws Exception {
		int num = 1;

		boolean result = Functions.isPrimeBrute(num);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPrimeBrute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPrimeBrute_2()
		throws Exception {
		int num = 1;

		boolean result = Functions.isPrimeBrute(num);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPrimeBrute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testIsPrimeBrute_3()
		throws Exception {
		int num = 1;

		boolean result = Functions.isPrimeBrute(num);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String join(List<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testJoin_1()
		throws Exception {
		List<Object> list = new LinkedList();
		String delim = "";

		String result = Functions.join(list, delim);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String join(List<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testJoin_2()
		throws Exception {
		List<Object> list = new LinkedList();
		String delim = "";

		String result = Functions.join(list, delim);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String join(List<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testJoin_3()
		throws Exception {
		List<Object> list = new LinkedList();
		String delim = "";

		String result = Functions.join(list, delim);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the long makePandigital(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testMakePandigital_1()
		throws Exception {
		long n = 0L;

		long result = Functions.makePandigital(n);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long makePandigital(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testMakePandigital_2()
		throws Exception {
		long n = 1L;

		long result = Functions.makePandigital(n);

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the long makePandigital(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testMakePandigital_3()
		throws Exception {
		long n = 0L;

		long result = Functions.makePandigital(n);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long makePandigital(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testMakePandigital_4()
		throws Exception {
		long n = 0L;

		long result = Functions.makePandigital(n);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the String reverse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testReverse_1()
		throws Exception {
		String characters = "";

		String result = Functions.reverse(characters);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String reverse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testReverse_2()
		throws Exception {
		String characters = "";

		String result = Functions.reverse(characters);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int smallestFactor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testSmallestFactor_1()
		throws Exception {
		int C = 4;

		int result = Functions.smallestFactor(C);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int smallestFactor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testSmallestFactor_2()
		throws Exception {
		int C = 4;

		int result = Functions.smallestFactor(C);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int smallestFactor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testSmallestFactor_3()
		throws Exception {
		int C = 1;

		int result = Functions.smallestFactor(C);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int sumofdivisor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testSumofdivisor_1()
		throws Exception {
		int number = 2;

		int result = Functions.sumofdivisor(number);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int sumofdivisor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testSumofdivisor_2()
		throws Exception {
		int number = 1;

		int result = Functions.sumofdivisor(number);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int sumofdivisor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testSumofdivisor_3()
		throws Exception {
		int number = 2;

		int result = Functions.sumofdivisor(number);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int sumofdivisor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testSumofdivisor_4()
		throws Exception {
		int number = 2;

		int result = Functions.sumofdivisor(number);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int sumofdivisor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testSumofdivisor_5()
		throws Exception {
		int number = 1;

		int result = Functions.sumofdivisor(number);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int validateQuadric(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testValidateQuadric_1()
		throws Exception {
		int a = 1;
		int b = 1;

		int result = Functions.validateQuadric(a, b);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int validateQuadric(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testValidateQuadric_2()
		throws Exception {
		int a = 1;
		int b = 1;

		int result = Functions.validateQuadric(a, b);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int validateQuadric(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Test
	public void testValidateQuadric_3()
		throws Exception {
		int a = 1;
		int b = 1;

		int result = Functions.validateQuadric(a, b);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 30/12/14 4:43 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FunctionsTest.class);
	}
}