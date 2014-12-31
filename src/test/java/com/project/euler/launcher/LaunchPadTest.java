package com.project.euler.launcher;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LaunchPadTest</code> contains tests for the class <code>{@link LaunchPad}</code>.
 *
 * @generatedBy CodePro at 31/12/14 5:09 PM
 * @author test
 * @version $Revision: 1.0 $
 */
public class LaunchPadTest {
	/**
	 * Run the LaunchPad() constructor test.
	 *
	 * @generatedBy CodePro at 31/12/14 5:09 PM
	 */
	@Test
	public void testLaunchPad_1()
		throws Exception {
		LaunchPad result = new LaunchPad();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/12/14 5:09 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		LaunchPad.main(args);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/12/14 5:09 PM
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
	 * @generatedBy CodePro at 31/12/14 5:09 PM
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
	 * @generatedBy CodePro at 31/12/14 5:09 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LaunchPadTest.class);
	}
}