
public class Person {
	
	private String name;
	
	private int age;
	
	// No args constructor
	public Person () {
		System.out.println("In constructor");
		
		name = "Kik";
		age = 5;
	}
	
	
	
	// Method declaration
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public boolean isAdult() {
		return age >=18;
	}
	
}
