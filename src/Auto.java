
public class Auto {
	
	private String brand;
	private String model;
	private String color;
	private int mileage;
	private boolean stolen;
	
	public Auto() {
		System.out.println("No car");
	}
	
	public Auto(String brand, String model, String color, int mileage, boolean stolen) {
		System.out.println("Heeft een auto ");
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.mileage = mileage;
		this.stolen = stolen;
	}
	
	public void printBrand() {
		System.out.println("Auto merk is " + brand);
	}
	
	public void printAll() {
		System.out.println("Auto merk is " + brand);
		System.out.println("Model is " + model);
		System.out.println("Auto kleur is " + color);
		System.out.println("Auto mileage is " + mileage);
		System.out.println("Is auto gestolen? " + stolen);
		
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setAll(String newBrand, String newModel, String newColor, int newMileage, boolean newStolen) {
		brand = newBrand;
		model = newModel;
		color = newColor;
		mileage = newMileage;
		stolen = newStolen;
	}
	
	public boolean isHighMileage() {
		return mileage >= 50000;
	}
}
