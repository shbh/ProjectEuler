//package com.project.euler.feature;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.SortedSet;
//import org.junit.*;
//import static org.junit.Assert.*;
//
///**
// * The class <code>PermutationsTest</code> contains tests for the class <code>{@link Permutations}</code>.
// *
// * @generatedBy CodePro at 30/12/14 1:32 PM
// * @author test
// * @version $Revision: 1.0 $
// */
//public class PermutationsTest {
//	/**
//	 * Run the SortedSet<String> generateCombination(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 30/12/14 1:32 PM
//	 */
//	@Test
//	public void testGenerateCombination_1()
//		throws Exception {
//		String alphabet = "abcde";
//
//		SortedSet<String> result = Permutations.generateCombination(alphabet);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.NumberFormatException: For input string: ""
//		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//		//       at java.lang.Long.parseLong(Long.java:453)
//		//       at java.lang.Long.valueOf(Long.java:540)
//		//       at com.project.euler.feature.Permutations$1.compare(Permutations.java:75)
//		//       at com.project.euler.feature.Permutations$1.compare(Permutations.java:1)
//		//       at java.util.TreeMap.compare(TreeMap.java:1188)
//		//       at java.util.TreeMap.put(TreeMap.java:531)
//		//       at java.util.TreeSet.add(TreeSet.java:255)
//		//       at com.project.euler.feature.Permutations.perm1(Permutations.java:42)
//		//       at com.project.euler.feature.Permutations.perm1(Permutations.java:31)
//		//       at com.project.euler.feature.Permutations.generateCombination(Permutations.java:83)
//		//       at com.project.euler.feature.Permutations.generateCombination(Permutations.java:64)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the void perm1(String,Set<String>) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 30/12/14 1:32 PM
//	 */
//	@Test
//	public void testPerm1_1()
//		throws Exception {
//		String string = "";
//		Set<String> content = new HashSet();
//
//		Permutations.perm1(string, content);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Perform pre-test initialization.
//	 *
//	 * @throws Exception
//	 *         if the initialization fails for some reason
//	 *
//	 * @generatedBy CodePro at 30/12/14 1:32 PM
//	 */
//	@Before
//	public void setUp()
//		throws Exception {
//		// add additional set up code here
//	}
//
//	/**
//	 * Perform post-test clean-up.
//	 *
//	 * @throws Exception
//	 *         if the clean-up fails for some reason
//	 *
//	 * @generatedBy CodePro at 30/12/14 1:32 PM
//	 */
//	@After
//	public void tearDown()
//		throws Exception {
//		// Add additional tear down code here
//	}
//
//	/**
//	 * Launch the test.
//	 *
//	 * @param args the command line arguments
//	 *
//	 * @generatedBy CodePro at 30/12/14 1:32 PM
//	 */
//	public static void main(String[] args) {
//		new org.junit.runner.JUnitCore().run(PermutationsTest.class);
//	}
//}