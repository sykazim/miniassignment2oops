package q2;

import java.util.logging.Logger;

public class Apple extends Base {
	
	private static final Logger logger = Logger.getLogger(Apple.class.getName());

	@Override
	public void hasToImplementThisMethod() {
		logger.info("apples way of doing it");
	}
	
	

}
