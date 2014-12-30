package com.project.euler.launcher;

import org.apache.log4j.Logger;



public final class LaunchPad {

	static Logger logger = Logger.getLogger(LaunchPad.class);
	
	private LaunchPad() {
	
		super();
	
	}

	public static void main(final String[] args) {
	
		long lStartTime = System.nanoTime();


		logger.info(new com.project.euler.problem._069TotientMaximum().solve());

		long lEndTime = System.nanoTime();
		
		long difference = lEndTime - lStartTime;

		
		logger.info("Elapsed milliseconds: " + difference/1000000);



	}

}
