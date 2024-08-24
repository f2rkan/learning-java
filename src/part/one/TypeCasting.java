package part.one;

public class TypeCasting {

	public static void main(String[] args) {
		int test = 7;
		System.out.println("test for int: " + test);
		
		double test2 = test;
		System.out.println("test for double: " + test2);
		
		//casting example 2
		double test3 = 8.33;
		int test4 = (int)test3;
		System.out.println("test4 parser by int: " + test4);
		
		//real-life example
		int example = 50;
		double example2 = 500.93;
		float calc = (float) example * (float) example2;
		
		System.out.println("calc: " + calc);
	}
}
