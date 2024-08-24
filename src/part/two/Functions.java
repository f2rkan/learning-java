package part.two;

public class Functions {

	static void test() {
		System.out.println("test");
	}
	
	static void test3(String ex) {
		System.out.println("name: " + ex);
	}
	
	static String test4(String name) {
		return "name value: " + name;
	}
	
	static void methodOverloading() {
		System.out.println("method1");
	}
	
	static String methodOverloading(String name) {
		return "method2";
	}
	
	static int methodOverloading(int val) {
		System.out.println("m2 called");
		return 2;		
	}
	
	static double methodOverloading(double val) {
		System.out.println("m3 called");
		return val;
	}
	public static void main(String[] args) {
		test();
		test3("exx");
		System.out.println(test4("Ömer"));
		
		System.out.println("m1: " + methodOverloading(3));
		System.out.println("m2: " + methodOverloading(4.5));
	}
}
