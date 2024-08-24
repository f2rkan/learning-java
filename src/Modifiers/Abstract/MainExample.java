package Modifiers.Abstract;

abstract class MainExample {
	public String name = "Furkan";
	public int gradYear = 2023;
	
	public abstract void myFunc();
}

class AccessMainExample extends MainExample{
	public String lname = "Sağır";
	public void myFunc() {
		System.out.println("this is a myFunc");
	}
}
