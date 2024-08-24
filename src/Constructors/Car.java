package Constructors;

public class Car {

	int year;
	String modelName;
	int weight;
	
	public Car(int year, String modelName, int weight) {
		this.year = year;
		this.modelName = modelName;
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		Car myCar = new Car(2023, "tuareg", 2000);
		System.out.println("myCar.year: " + myCar.year);
		System.out.println("myCar.modelName: " + myCar.modelName);
		System.out.println("myCar.weight: " + myCar.weight);
	}
}
