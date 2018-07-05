package tud.st.cbse.aspects;

import tud.st.cbse.task4.building.*;

public aspect LevelAspect {

	// define pointcut only for case when level tries to add another level as a part
	pointcut addingPart(Level owner, Level child) : call(* Level.addPart(HousePart)) && args(child) && target(owner);
	
	before(Level owner, Level child) : addingPart(owner, child) {
		throw new IllegalArgumentException("Level can't be part of other level");
	}
	
}
