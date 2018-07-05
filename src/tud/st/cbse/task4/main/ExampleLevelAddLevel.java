package tud.st.cbse.task4.main;

import tud.st.cbse.task4.building.Bathroom;
import tud.st.cbse.task4.building.Hallway;
import tud.st.cbse.task4.building.House;
import tud.st.cbse.task4.building.Level;
import tud.st.cbse.task4.building.Room;
import tud.st.cbse.task4.stakeholder.Person;

public class ExampleLevelAddLevel {

	Person owner = new Person("owner");
	
	public static void main(String[] args){
		ExampleLevelAddLevel starter = new ExampleLevelAddLevel();
		starter.run();
	}
	
	public void run(){
		House h1 = buildSimpleHouse();
		h1.printStructure();
	}
	
	private House buildSimpleHouse(){
		House house = new House("Street 1", owner);
		Level l0 = new Level(0);
		Level l1 = new Level(1);
		
		Room livingRoom = new Room("living room");
		Room sleepingRoom = new Room("sleeping room");
		Room privateRoom = new Room("private room");
		Room bathRoom = new Bathroom();
		
		Hallway hallway = new Hallway();
		hallway.addPart(sleepingRoom);
		hallway.addPart(bathRoom);
		hallway.addPart(privateRoom);
		
		l1.addPart(hallway);
		l0.addPart(livingRoom);
		l1.addPart(l0);
		
		house.addPart(l0);
		house.addPart(l1);
		
		return house;
	}
	
}
