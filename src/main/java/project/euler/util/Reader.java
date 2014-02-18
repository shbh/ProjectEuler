package project.euler.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

public class Reader {
	
	public static Reader reader = null;
	public static Reader getInstance()
	{
		if(reader!=null)
		{
			return reader;
		}
		return new Reader();
	}

	private Map<Integer, String> results = new LinkedHashMap<Integer, String>();

	private Reader() {
		this.readProperties();
	}
	
	public Map<Integer, String> getResults() {
		return results;
	}
	
	public  Map<Integer, String> readProperties() {
		InputStream input = null;
		Properties props = new Properties();
		

		try {

			input = Reader.class.getClassLoader().getResourceAsStream(
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

	public void setResults(Map<Integer, String> results) {
		this.results = results;
	}
}
