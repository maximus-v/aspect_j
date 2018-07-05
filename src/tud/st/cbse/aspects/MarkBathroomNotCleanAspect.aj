package tud.st.cbse.aspects;

import tud.st.cbse.task4.building.*;
import tud.st.cbse.task4.stakeholder.*;

// TODO: execute before method is done
public aspect MarkBathroomNotCleanAspect {
	
	pointcut markBathroomNotClean(Bathroom bath, Person p) : call(* HousePart.visit(Person)) && args(p) && target(bath);
	
	before(Bathroom bath, Person p) : markBathroomNotClean(bath, p) {
		bath.setClean(false);
		System.out.println("Bathroom clean: " + bath.isClean());
	}

}
