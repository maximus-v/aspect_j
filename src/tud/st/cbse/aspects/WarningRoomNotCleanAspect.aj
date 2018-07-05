package tud.st.cbse.aspects;

import tud.st.cbse.task4.building.*;
import tud.st.cbse.task4.stakeholder.Person;

public aspect WarningRoomNotCleanAspect {
	
	pointcut warnRoomNotClean(Room room, Person p) : execution(* HousePart.visit(Person)) && args(p) && target(room);
	
	before(Room room, Person p) : warnRoomNotClean(room, p) {
		System.out.println((room.isClean() == false ? "Warning: Unclean room" : "No worries, " + room.getRoomName() + " is clean"));
	}

}
