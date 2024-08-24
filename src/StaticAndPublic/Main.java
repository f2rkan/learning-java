package StaticAndPublic;

public class Main {

	//static method
	static void myStatic() {
		System.out.println("myStatic is called");
	}
	//public fonksiyona erişmek için nesne oluşturmak ve o nesneyi kullanmak zorundasın.
	public void myPublic() {
		System.out.println("myPublic is called");
	}
	
	public static void main(String[] args) {
		myStatic();
		
		Main myMain = new Main();
		myMain.myPublic();
	}
}
