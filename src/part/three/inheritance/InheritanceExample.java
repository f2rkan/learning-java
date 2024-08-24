package part.three.inheritance;

public class InheritanceExample {

	public String fname, lname;
	public int born;
	public void myMethod() {
		System.out.println("Inheritance myMethod");
	}
}

class Example extends InheritanceExample{
	String firm = "brrrrr";
	
	public void myMethod2() {
		System.out.println("mrr");
	}
	public static void main(String[] args) {
		Example myExample = new Example();
		myExample.myMethod();
	}
}
