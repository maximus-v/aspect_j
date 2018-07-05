package tud.st.cbse.task4.main;

import tud.st.cbse.task4.building.Hallway;
import tud.st.cbse.task4.building.House;
import tud.st.cbse.task4.building.Level;
import tud.st.cbse.task4.building.Room;
import tud.st.cbse.task4.stakeholder.Person;

public class ExamplePrivateRoom {
	
	private Person owner = new Person("John Doe");
	private Person otherPerson = new Person("Jane Doe");
	
	public static void main(String[] args){
		ExamplePrivateRoom starter = new ExamplePrivateRoom();
		starter.run();
	}
	
	public void run(){
		House h1 = buildSimpleHouse();
		h1.printStructure();
		h1.visit(owner);
		h1.visit(otherPerson);
	}
	
	private House buildSimpleHouse(){
		House house = new House("Street 1", owner);
		Level l0 = new Level(0);
		Level l1 = new Level(1);
		
		Room privateRoom = new Room("private room");
		
		Hallway hallway = new Hallway();
		hallway.addPart(privateRoom);
		
		l1.addPart(hallway);
		
		house.addPart(l0);
		house.addPart(l1);
		
		return house;
	}

}
