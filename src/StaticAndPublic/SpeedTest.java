package StaticAndPublic;

public class SpeedTest {

	//class function'larına erişmek için dot syntax kullanırsın.
	public void test() {
		System.out.println("test function is called");
	}
	
	public void speed(int sp) {
		System.out.println("speed limit is " + sp + " km/h");
	}
	
	public static void main(String[] args) {
		SpeedTest mySpeed = new SpeedTest();
		mySpeed.test();

		mySpeed.speed(100);
	}
}
