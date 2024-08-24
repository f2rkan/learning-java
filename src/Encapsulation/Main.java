package Encapsulation;

public class Main {

	public static void main(String[] args) {
		Person myPerson = new Person();
		
		System.out.println("getName: " + myPerson.getName());
		System.out.println("getYear: " + myPerson.getYear());
		
		myPerson.setName("Furkan");
		System.out.println("setName: " + myPerson.getName());
		
		myPerson.setYear(2024);
		System.out.println("setYear: " + myPerson.getYear());
	}
}
