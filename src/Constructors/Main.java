package Constructors;

//public class Main {
//int x = 5;
//
//public Main() {
//	x = 7;
//}
//
//public static void main(String[] args) {
//	Main myMain = new Main();
//	System.out.println(myMain.x);
//}
//}
public class Main {
	
	int x = 5;
	
	public Main(int y) {
		x = y;
	}
	
	public static void main(String[] args) {
		Main myMain = new Main(9);
		System.out.println(myMain.x);
	}
}