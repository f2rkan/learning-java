package part.three.inheritance;

public class Main {

	protected String brand = "Ford";
	public void honk() {
		System.out.println("honk is called");
	}
}

class Car extends Main{
	private String modelName = "Mustang";
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.honk();
	}
}