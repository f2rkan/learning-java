package Modifiers.Abstract;

abstract class AbsExample {

	public String name;
	public int year;
	
	public abstract void myMethod();
}

class ExampleAccess extends AbsExample{
	String deneme = "brr";
	public void myMethod() {
		System.out.println("myMethod is called");
	}
}
