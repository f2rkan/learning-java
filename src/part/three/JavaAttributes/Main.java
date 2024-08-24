package part.three.JavaAttributes;

public class Main {
	int x = 5;
	final int y = 77;
	
	
	public static void main(String[] args) {
		Main myMain = new Main();
		System.out.println("mMain: " + myMain.x);
		
		myMain.x = 7;
		System.out.println("new myMain.x: " + myMain.x);
		
		System.out.println(myMain.y);
	}
}
