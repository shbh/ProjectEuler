package project.euler.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import project.euler.net.EulerEngine;

public class Reader {

	public static Map<Integer, String> readProperties() {
		InputStream input = null;
		Properties props = new Properties();
		Map<Integer, String> results = new LinkedHashMap<Integer, String>();

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
		return results;
	}
}
