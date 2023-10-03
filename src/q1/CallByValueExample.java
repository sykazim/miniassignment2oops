package q1;

import java.util.logging.Logger;

public class CallByValueExample {

	private static final Logger logger = Logger.getLogger(CallByValueExample.class.getName());

	public static void main(String[] args) {
		int x = 10;
		logger.info("Before calling modifyValue method: x = " + x);

		modifyValue(x);

		logger.info("After calling modifyValue method: x = " + x);
	}

	public static void modifyValue(int value) {
		// This method receives a copy of the value of x
		// and modifies the copy, not the original x
		value = value * 2;
		logger.info("Inside modifyValue method: value = " + value);
	}
}
