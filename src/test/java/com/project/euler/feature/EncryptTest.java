package com.project.euler.feature;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EncryptTest</code> contains tests for the class <code>{@link Encrypt}</code>.
 *
 * @generatedBy CodePro at 30/12/14 1:32 PM
 * @author test
 * @version $Revision: 1.0 $
 */
public class EncryptTest {
	/**
	 * Run the String encrypt(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 1:32 PM
	 */
	@Test
	public void testEncrypt_1()
		throws Exception {
		String plaintext = "test";
		String algorithm = "SHA";
		String encoding = "UTF-8";

		String result = Encrypt.encrypt(plaintext, algorithm, encoding);

		// add additional test code here
		assertEquals("qUqP5cyxm6YcTAhz05Hph5gvu9M=", result);
	}

	/**
	 * Run the String encrypt(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 30/12/14 1:32 PM
	 */
	@Test
	public void testEncrypt_2()
		throws Exception {
		String plaintext = "test";
		String algorithm = "SHA";
		String encoding = "UTF-8";

		String result = Encrypt.encrypt(plaintext, algorithm, encoding);

		// add additional test code here
		assertEquals("qUqP5cyxm6YcTAhz05Hph5gvu9M=", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 30/12/14 1:32 PM
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
	 * @generatedBy CodePro at 30/12/14 1:32 PM
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
	 * @generatedBy CodePro at 30/12/14 1:32 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EncryptTest.class);
	}
}