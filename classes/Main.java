package classes;

public class Main {
	public static void makeMusicians() {
		Musicians james = new Musicians();
		james.age = 20;
		james.name = "James";
		james.instrument = "Guitar";
		
		System.out.println("Name: " + james.name);
		System.out.println("Age: " + james.age);
		System.out.println("Instrument: " + james.instrument);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeMusicians();
	}

}
