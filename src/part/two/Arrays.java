package part.two;

public class Arrays {

	public static void main(String[] args) {
		String arr[] = {
				"ex1",
				"ex2",
				"ex3"
		};
		arr[2] = "brr";
		for(String i : arr) {
			System.out.println(i);
		
		}
		System.out.println("---");
		//loop2
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
