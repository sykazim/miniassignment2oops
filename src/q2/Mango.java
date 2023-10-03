package q2;

import java.util.logging.Logger;

public class Mango extends Base {

	private static final Logger logger = Logger.getLogger(Mango.class.getName());
	
	@Override
	public void hasToImplementThisMethod() {
		logger.info("mango way of doing it");
	}

	
}
