package Modifiers;

//modifier olarak class'larda public, abstract ve final kullanılabilir.
public class Main {
	final int x = 5;
	final double pi = 3.14;
	
	//Statik bir method, public'in aksine, sınıfın bir nesnesi oluşturmadan erişilebileceği anlamına gelir:
	static void staticExample() {
		System.out.println("static function is called");
	}
	//attributes, methods ve constructorlarda public, private ve protected kullanılabilir.
	public static void main(String[] args) {
		Main myMain = new Main();
		System.out.println(myMain.x);
		
		staticExample();
	}
}
