package tud.st.cbse.task4.building;

public class Level extends ComplexHousePart {

	private int number;
	
	public Level(int number){
		this.number = number;
	}
	
	@Override
	public void printStructure() {
		System.out.println("Level " + number);
		super.printStructure();
	}
	
	@Override
	public String toString() {
		return "Level: " + String.valueOf(number);
	}
	
}
