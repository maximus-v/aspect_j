package tud.st.cbse.task4.building;

import java.util.ArrayList;
import java.util.List;

import tud.st.cbse.task4.stakeholder.Person;

public abstract class ComplexHousePart extends HousePart {
	
	private List<HousePart> subParts;
	
	public ComplexHousePart(){
		subParts = new ArrayList<HousePart>();
	}

	public List<HousePart> getSubParts(){
		return subParts;
	}
	
	public void addPart(HousePart part){
		part.setSuperPart(this);
		this.subParts.add(part);
	}
	
	public void removePart(HousePart part){
		this.subParts.remove(part);
	}

	@Override
	public void printStructure() {
		for(HousePart part : subParts){
			System.out.print("	");
			part.printStructure();
			System.out.println("");
		}
	}

	@Override
	public void visit(Person p) {
		enter(p);
		for(HousePart part : subParts) {
			System.out.println(p.getName() + " visits " + part.toString());
			part.visit(p);
		}
	}
	
	public void run() {
		System.out.println("Run");
	}
}
