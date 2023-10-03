package q1;

import java.util.logging.Logger;

public class CallByReference {

	private static final Logger logger = Logger.getLogger(CallByReference.class.getName());

	public static void main(String[] args) {
		Person person = new Person("Alice");

		logger.info("Before calling modifyPerson method: " + person.getName());

		modifyPerson(person);

		logger.info("After calling modifyPerson method: " + person.getName());
	}

	public static void modifyPerson(Person p) {
		// This method receives a reference to the object 'person'
		// and modifies the object's state
		p.setName("Bob");
	}
}
