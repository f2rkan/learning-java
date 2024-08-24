package SimpliInheritance;

public class Machine {
	public String brand = "Samsung";
	public void wash() {
		System.out.println("Yıkama işlemi başlatılıyor ");
	}
}

class WashingMachine extends Machine{
	public String modelName = "QA-777";
	
	public static void main(String[] args) {
		WashingMachine myWash = new WashingMachine();
		myWash.wash();
		
		System.out.println(myWash.brand + " - " + myWash.modelName);
	}
}
