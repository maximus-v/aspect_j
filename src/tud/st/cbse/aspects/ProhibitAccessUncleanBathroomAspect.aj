package tud.st.cbse.aspects;

import tud.st.cbse.task4.building.*;
import tud.st.cbse.task4.stakeholder.Person;

public aspect ProhibitAccessUncleanBathroomAspect {

	pointcut prohibitAccessToUncleanBathroom(Bathroom bath, Person p) : call(* HousePart.visit(Person)) && args(p) && target(bath);
	
	before(Bathroom bath, Person p) : prohibitAccessToUncleanBathroom(bath, p) {
		if (bath.isClean()) {
			
		} else {
			throw new IllegalAccessError("Stop! It is not clean");
		}
	}
	
}
