package com.project.euler.feature;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>EncryptTest</code> contains tests for the class <code>{@link Encrypt}</code>.
 *
 * @generatedBy CodePro at 31/12/14 5:09 PM
 * @author test
 * @version $Revision: 1.0 $
 */
public class EncryptTest {
	/**
	 * Run the String encrypt(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/12/14 5:09 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testEncrypt_1()
		throws Exception {
		String plaintext = "";
		String algorithm = "";
		String encoding = "";

		String result = Encrypt.encrypt(plaintext, algorithm, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String encrypt(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/12/14 5:09 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testEncrypt_2()
		throws Exception {
		String plaintext = "";
		String algorithm = "";
		String encoding = "";

		String result = Encrypt.encrypt(plaintext, algorithm, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String encrypt(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/12/14 5:09 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testEncrypt_3()
		throws Exception {
		String plaintext = "";
		String algorithm = "";
		String encoding = "";

		String result = Encrypt.encrypt(plaintext, algorithm, encoding);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(EncryptTest.class);
	}
}