package part.two;

public class WorkingForString {

	public static void main(String[] args) {

		String fname = "Ömer Furkan ";
		String lname = "Sağır";
		
		String fullName = fname.concat(lname);
		
		System.out.println("fullname is " + fullName);
	}
}
