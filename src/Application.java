
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		// PERSON
		Person person1 = new Person();
		// person1.name = "Kik";
		// person1.age = 24;
		
		// Method call
		person1.printName();
		boolean adult = person1.isAdult();
		System.out.println("Adult is " + adult);
		
		Person person2 = new Person();
		person2.setName("Piet");
		person2.printName();
		boolean adult2 = person2.isAdult();
		System.out.println("Adult2 is " + adult2);
		
		System.out.println();
		System.out.println();
		
		// Animals
		Dog dog = new Dog();
		
		
		// AUTO
		Auto auto1 = new Auto();
		
		auto1.printAll();
		boolean highMileage = auto1.isHighMileage();
		System.out.println("Heeft deze auto een hoge kilometerstand? " + highMileage);
		
		System.out.println();
		
		Auto auto2 = new Auto("Jeep", "Wrangler", "Groen", 60000, false);
		
		auto2.printAll();
	}

}
