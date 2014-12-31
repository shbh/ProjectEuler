package com.project.euler.feature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.project.euler.problem._054PokerHands;

public class Reader {

	private Map<Integer, String> results = new HashMap<Integer, String>();

	public Reader() {

		this.readProperties();

	}

	public Map<Integer, String> getResults() {

		return results;

	}

	public Map<Integer, String> readProperties() {

		try {
			InputStream input = null;

			Properties props = new Properties();

			input = Reader.class.getClassLoader().getResourceAsStream("solution.properties");

			// load a properties file from class path, inside static method
			props.load(input);

			props.load(input);

			Enumeration<Object> keys = props.keys();

			while (keys.hasMoreElements()) {

				Object key = (Object) keys.nextElement();

				results.put(Integer.parseInt(key.toString()), (String) props.get(key));
			}

			if (input != null) {

				try {

					input.close();

				} catch (IOException e) {

					e.printStackTrace();

				}
			}

		} catch (Exception ex) {

		}
		return results;

	}

	public void setResults(Map<Integer, String> results) {
		this.results = results;
	}

	public List<String> readFile(String fileName) {

		List<String> datas = new ArrayList<>(100);

		InputStream input = _054PokerHands.class.getClassLoader().getResourceAsStream(fileName);

		try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {

				datas.add(sCurrentLine);
			}

		} catch (Exception e) {

			// e.printStackTrace();

		}

		return datas;
	}
}
