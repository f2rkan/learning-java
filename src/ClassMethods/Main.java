package ClassMethods;

public class Main {

	static void myMethod() {
		System.out.println("myMethod called");
	}
	
	public static void main(String[] args) {
		Main myMain = new Main();
		myMain.myMethod();
		
		myMethod();
	}
}