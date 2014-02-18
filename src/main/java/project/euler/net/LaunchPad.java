package project.euler.net;

import org.apache.log4j.Logger;



public final class LaunchPad {

	static Logger logger = Logger.getLogger(LaunchPad.class);
	private LaunchPad() {
		super();
	}

	public static void main(final String[] args) {
		logger.info(new project.euler.problem._053CombinatoricSelections().solve());
	}

}
