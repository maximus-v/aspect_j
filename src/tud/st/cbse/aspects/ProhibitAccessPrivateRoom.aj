package tud.st.cbse.aspects;

import tud.st.cbse.task4.building.*;
import tud.st.cbse.task4.stakeholder.Person;

public aspect ProhibitAccessPrivateRoom {
	
	pointcut prohibitAccessToPrivateRoom(Room room, Person p) : call(* HousePart.visit(Person)) && args(p) && target(room);
	
	before(Room room, Person p) : prohibitAccessToPrivateRoom(room, p) {
		if (room.getRoomName().equals("private room")) { // TODO: get owner of room
			// TODO: skip method
			System.out.println("No Access");
		}
	}

}
