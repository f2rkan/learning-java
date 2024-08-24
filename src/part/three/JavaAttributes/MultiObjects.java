package part.three.JavaAttributes;

public class MultiObjects {

	int x = 5;
	String name = "Ömer";
	
	public static void main(String[] args) {
		MultiObjects myMulti = new MultiObjects();
		System.out.println(myMulti.x + " 11 " + myMulti.name);
		
		myMulti.x = 3;
		myMulti.name = "Furkan";

		System.out.println("---");
		MultiObjects myMulti2 = new MultiObjects();
		System.out.println(myMulti2.x + " 22 " + myMulti2.name);
	}
}
